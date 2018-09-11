import java.util.Scanner;
class Bmi_237 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("weight=");
        double weight = sc.nextDouble();
        
        System.out.print("height=");
        double height = sc.nextDouble();

        //double bmi = sc.nextDouble();
        double bmi = weight*10000.00f/(height*height);
        System.out.print("bmi="+bmi);

    }
}