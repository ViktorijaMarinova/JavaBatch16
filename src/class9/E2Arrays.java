package class9;

public class E2Arrays {
    public static void main(String[] args) {

        /*
        Create an array of int and store numbers from 30 40 50 90
         inside it and access only the number 50
         */

        int[] numbers={30,40,50,90};
        /*
        When we try to access an element using an index which does not exist will get an error
         */
        System.out.println(numbers[2]);
    }
}
