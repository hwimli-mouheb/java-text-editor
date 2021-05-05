import java.awt.event.*;
import java.awt.*;
import java.io.*;
class MyActionListenerForQuit implements ActionListener
{
MyFrameAWT f;
public MyActionListenerForQuit(MyFrameAWT f)
{
this.f=f;
}
public void actionPerformed(ActionEvent e)
{
System.out.println("Bouton Quit actionné");
System.exit(0);
}
}