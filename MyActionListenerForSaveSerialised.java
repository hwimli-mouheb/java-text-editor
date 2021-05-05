import java.awt.event.*;
import java.awt.*;
import java.io.*;
class MyActionListenerForSaveSerialised implements ActionListener
{
MyFrameAWT f;
public MyActionListenerForSaveSerialised(MyFrameAWT f)
{
this.f=f;
}
public void actionPerformed(ActionEvent e)
{
System.out.println("Bouton Save actionné");
FileDialog fd = new FileDialog(f,"Save",FileDialog.SAVE);
fd.setVisible(true);
String nomFichier = fd.getFile();
String repFichier = fd.getDirectory();
String nomComplet = repFichier + nomFichier;

String s=f.ta.getText();
try {   
    FileOutputStream fichier = new FileOutputStream(nomComplet); 
 ObjectOutputStream oos = new ObjectOutputStream(fichier);  
 oos.writeObject(s);   
 oos.flush();  
 oos.close();  
   }    
 catch (java.io.IOException ex) {      ex.printStackTrace();    }
}
}