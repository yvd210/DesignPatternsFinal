package SingleTon;

public class Client {
    public static void main(String[] args){
        DBConnection db1=DBConnection.getInstance();
        DBConnection db2=DBConnection.getInstance();
        if(db1==db2){
            System.out.println("true");
        }
    }
}
