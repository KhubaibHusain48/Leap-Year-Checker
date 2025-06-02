import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner Year = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = Year.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Given year " + year + " is a leap Year");
        } else {
            System.out.println("Given year " + year + " is not a leap Year");
        }
    }
}
