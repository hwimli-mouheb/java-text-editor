import java.awt.event.*;
import java.awt.*;
import java.io.*;
class MyActionListenerForSave implements ActionListener
{
MyFrameAWT f;
public MyActionListenerForSave(MyFrameAWT f)
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
System.out.println("Nom Fichier : " + nomFichier);
System.out.println("Répertoire Fichier : " + repFichier);
System.out.println("Nom complet du Fichier : " +nomComplet);
File file = new File(nomComplet);
int size;
size = (int) file.length();

try
{
    
    

String s=f.ta.getText();
byte data[] =new byte[size];
FileOutputStream fout =new  FileOutputStream(file);
		data = s.getBytes();
    fout.write(data);
    fout.close();

  }catch(FileNotFoundException e2){System.out.println(e2);}
  catch(IOException e3){System.out.println(e3);}
  
}
}