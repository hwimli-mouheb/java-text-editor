import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
class MyActionListenerForOpenSerialised implements ActionListener{
MyFrameAWT f;
public MyActionListenerForOpenSerialised(MyFrameAWT f)
{
this.f=f;
}
public void actionPerformed(ActionEvent e)
{
System.out.println("Bouton Open actionné");
FileDialog fd = new FileDialog(f);

fd.setVisible(true);
String nomFichier = fd.getFile();
String repFichier = fd.getDirectory();
String nomComplet = repFichier + nomFichier;
try {
    FileInputStream fichier = new FileInputStream(nomComplet);
    ObjectInputStream ois = new ObjectInputStream(fichier);
    String s = (String) ois.readObject();

   /*String []lines =s.split("\n");
    String[][] data = new String[100][];
    int i=0;
    /*ArrayList<Account> a = new ArrayList<Account>();
    for(String line :lines){
        a.add(new Account(line.split(":")[0],line.split(":")[1],
        line.split(":")[2],line.split(":")[3],line.split(":")[4],line.split(":")[5]));
        i++;}*/
        
    f.ta.setText(s);
} catch (java.io.IOException ex) {
    ex.printStackTrace();
} catch (ClassNotFoundException ex1) {
    ex1.printStackTrace();
}
}}