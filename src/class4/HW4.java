package class4;

public class HW4 {
    /*
    Write a program to check whether number is positive or negative.
Write a Java Program to check whether number is Even or Odd.
     */
    public static void main(String[] args) {

        int number=-10;
        if (number>0){
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        int num=10;
        int remainder=num%2;
        if(remainder==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
