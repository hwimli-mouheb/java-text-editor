import java.awt.event.*;
import java.awt.*;
import java.io.*;
class MyActionListenerForNew implements ActionListener
{
MyFrameAWT f;
public MyActionListenerForNew(MyFrameAWT f)
{
this.f=f;
}
public void actionPerformed(ActionEvent e)
{
System.out.println("Bouton New actionné");
f.ta.setText("");
}
}