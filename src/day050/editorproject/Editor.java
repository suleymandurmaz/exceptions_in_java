package day050.editorproject;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Editor extends JFrame {
    private JMenuBar menuCubugu;
    private JMenu dosyaMenusu;
    private JMenuItem ac,kaydet,cikis;
    private JTextArea icerik;
    public Editor(String title) throws HeadlessException {
        super(title);

        setSize(800,600);

        int width=Toolkit.getDefaultToolkit().getScreenSize().width;
        int height=Toolkit.getDefaultToolkit().getScreenSize().height;
        setLocation((width-getWidth())/2,(height-getHeight())/2);
        menuTasarla();

        //icerik
        icerik=new JTextArea();
        add(icerik);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void menuTasarla() {
        menuCubugu=new JMenuBar();

        //Dosya Menüsü
        dosyaMenusu=new JMenu("Dosya");

        //Aç menü elemanı
        ac=new JMenuItem("Aç");
        ac.addActionListener(e->dosyaAc());
        dosyaMenusu.add(ac);


        //Kaydet menü elemanı
        kaydet=new JMenuItem("Kaydet");
        kaydet.addActionListener(e->kayitYap());
        dosyaMenusu.add(kaydet);

        dosyaMenusu.addSeparator();
        //Çıkış menü elemanı
        cikis=new JMenuItem("Çıkış");
        cikis.addActionListener(e->cikisYap());
        dosyaMenusu.add(cikis);

        menuCubugu.add(dosyaMenusu);
        setJMenuBar(menuCubugu);
    }

    private void kayitYap() {
        JFileChooser chooser=new JFileChooser();
        if (chooser.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
            File file=chooser.getSelectedFile();
            String title=String.format("%s - %s",getTitle(),file.getName());
            setTitle(title);

            try(FileOutputStream fos=new FileOutputStream(file)){
                if(icerik.getText().isEmpty()){
                    throw new Exception("İçerik boş");
                }
                String metin=icerik.getText();
                byte[] data = metin.getBytes(StandardCharsets.UTF_8);
                fos.write(data);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e.getMessage(),"Hata",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void dosyaAc() {
        JFileChooser chooser=new JFileChooser();
        if (chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File file=chooser.getSelectedFile();
            String title=String.format("%s - %s",getTitle(),file.getName());
            setTitle(title);

            try(FileInputStream fis=new FileInputStream(file)){
                byte[] data = fis.readAllBytes();
                StringBuilder sb=new StringBuilder();
                for(byte b:data){
                    sb.append((char) b);
                }
                icerik.setText(sb.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void cikisYap() {
        System.exit(0);
    }
}
