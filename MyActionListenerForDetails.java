import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
class MyActionListenerForDetails implements ActionListener{
MyFrameAWT f1;
public MyActionListenerForDetails(MyFrameAWT f1)
{
    this.f1=f1;
}
public void actionPerformed(ActionEvent e)
{
    JFrame f;
JTable j;
    String s=f1.ta.getText();
    f=new JFrame();
f.setTitle("Users List");
String []lines =s.split("\n");
String[][] data = new String[100][];
int i=0;
for(String line :lines){
    data[i]=line.split(":");
    i++;
}
System.out.println("Bouton Details actionné");
String[] columnNames = { "Name", "Password", "Id", "Id groupe ","Commentaire","Directory"};
j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);

		// adding it to JScrollPane
		JScrollPane sp = new JScrollPane(j);
		f.add(sp);
		// Frame Size
		f.setSize(500, 200);
		// Frame Visible = true
		f.setVisible(true);
}
}