import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String[] daysArr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

       int n = Integer.parseInt(sc.nextLine());

       if(n >= 1 && n <= 7){
           System.out.println(daysArr[n - 1]);
       }else{
           System.out.println("Invalid day!");
       }
    }
}
