package Assignment_3.pkg1;

public class Animal {
    public String name;
   private int age;
    protected String surname;
    int id;

    public void eat(){
        System.out.println("Animal Eats");
    }
    private void gender(){
        System.out.println("Animal gender");
    }
    protected void walk(){
        System.out.println("Animal Walks");
    }
    void details(){
        System.out.println("Animal details");
    }
    public Animal(String Lion, int age, String surname, int id){
       this.name=name;
       this.age=age;
       this.surname=surname;
       this.id=id;


    }
}
