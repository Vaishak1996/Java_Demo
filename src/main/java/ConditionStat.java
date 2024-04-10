public class ConditionStat {

    public static void main(String[] args) {

        int age = 100;
        String Gender = "male";

        if (age >= 0 && age < 18) {

            if (Gender == "male") {
                System.out.println("user is a boy");
            }
            else if(Gender == "female"){
                System.out.println("user is a girl");
            }

        }
        else if(age >=18 && age<60){
            if (Gender == "male") {

                System.out.println("user is a man");
            }
            else if(Gender=="female"){
                System.out.println("user is a women ");
            }
        }
        else{
            System.out.println("user is Senior citizen");
        }
    }
}