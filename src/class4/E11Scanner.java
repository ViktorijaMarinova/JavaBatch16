package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        If we want to take the complete line from the user we should use nextLine method, can hold numbers as well
         */
        String sentence=scanner.nextLine();
        System.out.println(sentence);
    }
}
