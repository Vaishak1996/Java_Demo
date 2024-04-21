package Assignment3_pkg3;

public class Automation {

    public static void main(String[] args){

        Chromedriver cd = new Chromedriver();
        Firefoxdriver fd= new Firefoxdriver();

        cd.OpenDevtools();
        cd.get();
        fd.get();
        fd.openInspect();
    }
}
