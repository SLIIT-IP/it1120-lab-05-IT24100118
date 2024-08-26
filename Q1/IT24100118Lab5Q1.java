import java.util.Scanner;

public class IT24100118Lab5Q1{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int f1,f2,f3;          /* f1=First integer
                                  f2=Second integer
                                  f3=third integer*/

         System.out.print("Enter the first integer: ");
         f1 = input.nextInt();

         System.out.print("Enter the second integer: ");
         f2 = input.nextInt();

         System.out.print("Enter the third integer: ");
         f3 = input.nextInt();

         System.out.println(" ");
 
         System.out.println("User entered numbers are : "+ f1+ " "+ f2+ " " + f3);

         if(f1<f2)
		{
		System.out.println("The Smallest number is: "+ f1);
                System.out.println("The Largest number is: "+ f2);
                 }
         else if(f2<f3)
                {
		System.out.println("The Smallest number is: "+ f2);
                System.out.println("The Largest number is: "+ f3);
                 }
         else
                {
                 System.out.println("The Smallest number is: "+ f3);
                }
     }
}
      