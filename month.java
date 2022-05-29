
import java.util.Scanner;

public class Month {


    public static void main(String[] args) {
        int num ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        num = scanner.nextInt();

         switch(num) {
             case 1:
                 if (num == 1) {
                     System.out.println("january");
                 }
                 break;

             case 2:
                 if (num == 2) {
                     System.out.println("february");
                 }
                 break;

             case 3:
                 if (num == 3) {
                     System.out.println("march");
                 }
                 break;

             case 4:
                 if (num == 4) {
                     System.out.println("april");
                 }
                 break;

             case 5:
                 if (num == 5) {
                     System.out.println("may");
                 }
                 break;

             case 6:
                 if (num == 6) {
                     System.out.println("jun");
                 }
                 break;

             case 7:
                 if (num == 7) {
                     System.out.println("july");
                 }
                 break;

             case 8:
                 if (num == 8) {
                     System.out.println("august");
                 }
                 break;

             case 9:
                 if (num == 9) {
                     System.out.println("september");
                 }
                 break;


             case 10:
                 if (num == 10) {
                     System.out.println("october");
                 }
                 break;

             case 11:
                 if (num == 11) {
                     System.out.println("november");
                 }
                 break;

             case 12:
                 if (num == 12) {
                     System.out.println("december");
                 }
                 break;
         }

    }

}
