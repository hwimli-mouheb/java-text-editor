import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Lslogin {
    
    public static void main(String []args)throws IOException{
        File f= new File(args[0]);
FileInputStream fin =new  FileInputStream(f);
int size=(int)f.length();
byte[] b=new byte[size];
fin.read(b);
String s=new String(b);
String []users=s.split("\n");
for(String user : users){
    System.out.println((user.split(":"))[0]);
}
    }
}
