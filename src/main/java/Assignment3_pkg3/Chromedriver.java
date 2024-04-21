package Assignment3_pkg3;



public class Chromedriver implements WebDriver{


    public void get(){
        System.out.println("Chrome Driver");
    }
    public void OpenDevtools(){
        System.out.println("open devtools");
    }
    public static void main(String[] args){
        Chromedriver cd=new Chromedriver();
        cd.get();
        cd.OpenDevtools();
    }
}
