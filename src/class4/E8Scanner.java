package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your salary");
        // for int type of data we should use nextInt() method
        int salary=scanner.nextInt();
        if (salary>10000){
            System.out.println("You are rich");
        }else {
            System.out.println("Look for better opportunities");
        }
    }
}
