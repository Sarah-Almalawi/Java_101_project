package bmi;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in);
System.out.println("Hello Welcome To The BMI Calculator");
System.out.print("Please Enter Your Height : ");
double hight = input.nextDouble();
System.out.print("Please Enter Your Weight : ");
double wight = input.nextDouble();
if (hight < 0 || wight < 0){
System.out.println("Wrong value");
}
else{
double BMI = wight / (hight*hight);

if(BMI<18.5)
    System.out.println("Your BMI Is: "+ BMI + ", And Based On The Calculated BMI You Have (Underweight)");
else if (BMI<24.9)
     System.out.println("Your BMI Is: "+ BMI + ", And Based On The Calculated BMI You Have (Normal Weight)");
else if(BMI<29.9)
     System.out.println("Your BMI Is: "+ BMI + ", And Based On The Calculated BMI You Have (Overweight)");
else
     System.out.println("Your BMI Is: "+ BMI + ", And Based On The Calculated BMI You Have (Obese)");



}


    }
    
}
