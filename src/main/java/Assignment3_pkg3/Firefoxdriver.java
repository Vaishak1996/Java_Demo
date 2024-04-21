package Assignment3_pkg3;

public class Firefoxdriver implements WebDriver{

    public void get(){
        System.out.println("Firefox Driver");
    }
    public void openInspect(){
        System.out.println("open inspect");
    }
    public static void main(String[] args){
        Firefoxdriver ff=new Firefoxdriver();
        ff.get();
        ff.openInspect();
    }
}
