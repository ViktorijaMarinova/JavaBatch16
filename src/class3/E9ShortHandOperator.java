package class3;

public class E9ShortHandOperator {

    public static void main(String[] args) {
        // to create container of type int and to store the number 10 in it
        int number=10;
        // pick whatever is stored in number container and add 20 to that value and
        // store the results back to number variable
       // number=number=20; //30
        // we are saying to java add 20 to the previous value of number variable
        number+=20; //shortcut
        System.out.println(number);
    }
}
