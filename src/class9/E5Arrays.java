package class9;

public class E5Arrays {
    /*
    write a loop that starts from 0 till number 5 and print only the even numbers

    create an array of chars and print tall the chars on even index
     */
    public static void main(String[] args) {

        char [] chars={'A','B','C','D','E'};
        for (int i = 0; i < chars.length; i+=2) {

                System.out.println(chars[i]);


        }
    }

}
