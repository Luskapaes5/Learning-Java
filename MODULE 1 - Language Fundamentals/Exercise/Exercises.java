public class Exercises {

    static int x_static = 10;
    int x_instance = 20;


    public static void main(String[] args){
        ex6();
    }



    public void ex4(){
        
        int age = 19;
        boolean hasLicense = false;
        boolean canDrive = age >= 18 && hasLicense;

        }



    public static void ex6(){
        x_static ++;
        System.out.println(x_static);
    }
}

