import java.util.Scanner;
public class Percentage{
public static void main(String args[]) {

  System.out.println("Percentage and grade calculator with max.mark as 100\n\n");
 
  float percent;
  int num1,num2,num3,num4,num5;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your English mark:");
  num1=sc.nextInt();
  System.out.println("Enter your language mark:");
  num2=sc.nextInt();
  System.out.println("Enter your maths mark:");
  num3=sc.nextInt();
  System.out.println("Enter your science mark:");
  num4=sc.nextInt();
  System.out.println("Enter your social mark:");
  num5=sc.nextInt();

  percent=(num1+num2+num3+num4+num5)/5;

  if(percent>=85&&percent<=100){
    System.out.println("congrats you  have got A grade with"+percent+"percentage");
  } 
  else if(percent>=65&&percent<=84){
    System.out.println("good you have got B grade wiht"+percent+"percentage");
  }
  else if(percent>=40&&percent<=64){
    System.out.println("nice you have got C grade with"+percent+"percentage");
  }
  else {
    System.out.println("sorry you have failed and got D grade with"+percent+"percentage");
  }




}
}