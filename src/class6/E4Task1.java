package class6;

import java.util.Scanner;

public class E4Task1 {
    public static void main(String[] args) {
        /*
        Prompt the user to enter person height in inches.
        Person should be classified as one of the following:
        short (under 60inc)
        medium (between 60-72 inch)
        tall (over 72 inc)
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your height in inches");
        int height=scanner.nextInt();
        System.out.println(height);
        if(height<60){
            System.out.println("Short");
        } else if (height>=60 &&height<=72){
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }
    }
}
