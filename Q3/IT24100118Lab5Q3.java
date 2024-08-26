import java.util.Scanner;

public class IT24100118Lab5Q3{

    private static final double room_charge_per_day = 4800;                
    private static final double disc_3_4_days = 0.1;
    private static final double disc_5_more_days = 0.2;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int start_day,end_day,reserved_days;    
        double amount,discamount3_4,discamount5_more; 

         System.out.print("Enter Start Date (1-31): ");
         start_day = input.nextInt();

         System.out.print("Enter End Date (1-31): ");
         end_day = input.nextInt();

         System.out.println(" ");

         if(start_day<1 || start_day>31 || end_day<1 || end_day>31) {
            System.out.println("Days must be between 1 and 31");
         return;}
         if(start_day>end_day){
            System.out.println("Start date must be less than End date");
         return;}

        reserved_days = end_day - start_day;
        amount = reserved_days * room_charge_per_day;
        discamount3_4 = amount - (amount * disc_3_4_days);
        discamount5_more = amount - (amount * disc_5_more_days);

         System.out.println("Room Charge Per Day: "+ room_charge_per_day);
         System.out.println("Numbers of days reserved: "+ reserved_days);

         if (reserved_days>=0 && reserved_days<3) {
            System.out.println("Total Amount to be Paid: "+ amount);
         return;}
         else if (reserved_days>=3 && reserved_days<=4) {
            System.out.println("Total Amount to be Paid: "+ discamount3_4);
         return;}
         else{
            System.out.println("Total Amount to be Paid: "+ discamount5_more);
         return;}
    }
}
