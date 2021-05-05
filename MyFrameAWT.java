import java.awt.*;
class MyFrameAWT extends Frame{
Panel pNorth = new Panel();
Button bNew = new Button("New");
Button bOpen = new Button("Open.txt");
Button bOpenSerialised = new Button("Open.ser");
Button bSave = new Button("Save.txt");
Button bSaveSerialised = new Button("Save.ser");
Button bQuit = new Button("Exit");
Button bDetails = new Button("Details");
Panel pSouth = new Panel();TextArea ta = new TextArea("");
  public MyFrameAWT (){
pNorth.setBackground(Color.green);
     pNorth.add(bNew);   pNorth.add(bOpen);
     pNorth.add(bSave);  pNorth.add(bQuit); pNorth.add(bDetails);
     pNorth.add(bOpenSerialised);pNorth.add(bSaveSerialised);
pSouth.setBackground(Color.yellow);
pSouth.add(ta);
this.setBackground(Color.blue);
this.setLayout(new GridLayout(2,1));
this.add(pNorth); this.add(pSouth);
this.setBounds(10,10,500,400);
this.setVisible(true);
MyWindowListener x1 = new MyWindowListener();
this.addWindowListener(x1);
MyActionListenerForOpen x2 = new MyActionListenerForOpen(this);
bOpen.addActionListener(x2);
MyActionListenerForNew x3 = new MyActionListenerForNew(this);
bNew.addActionListener(x3);
MyActionListenerForSave x4 = new MyActionListenerForSave(this);
bSave.addActionListener(x4);
MyActionListenerForQuit x5 = new MyActionListenerForQuit(this);
bQuit.addActionListener(x5);
MyActionListenerForDetails x6 = new MyActionListenerForDetails(this);
bDetails.addActionListener(x6);
MyActionListenerForOpenSerialised x7 = new MyActionListenerForOpenSerialised(this);
bOpenSerialised.addActionListener(x7);
MyActionListenerForSaveSerialised x8 = new MyActionListenerForSaveSerialised(this);
bSaveSerialised.addActionListener(x8);


}
}