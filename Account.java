public class Account {
    
    String name ;
    String password;
    String id;
    String id_groupe;
    String comment ;
    String Directory;
    Account(){
    }
   Account(String name ,String password,String id,String id_groupe,String comment ,String Directory){
       this.name=name;
       this.password=password;
       this.id=id;
       this.id_groupe=id_groupe;
       this.comment=comment;
       this.Directory=Directory;
   }
public String toString(){
    return("{"+name+","+password+","+id+","+id_groupe+","+comment+","+Directory+"}"+"\n");
}
}
