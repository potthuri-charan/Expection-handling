import java.io.IOException;
public class testthrows {
    void m()throws IOException{
        throw  new IOException("Device error");
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e) {
            System.out.println("Exception handeled");
        }
    }

    public static void main(String[] args) {
        testthrows obj=new testthrows();
        obj.p();
        System.out.println("Normal flow...........");
    }
}
