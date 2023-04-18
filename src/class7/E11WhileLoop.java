package class7;

public class E11WhileLoop {
    /*
    Print numbers from 100 to 1
    print even numbers from 20 to 100
    Print only odd numbers from 100 to 1
    (2 different way)
     */
    public static void main(String[] args) {

        int counter=100;
        while (counter>0){ //same as writing counter>=1
            System.out.print(counter+" ");
            counter--;

        }
        int counter1=20;
        System.out.println();
        while(counter1<=100){
            System.out.print(counter1+" ");
            counter1+=2;
        }
        counter=100;
        // so that we can see the next output on a new line
        System.out.println();
        while(counter>=1){
            // odd numbers when divided by 2 gives 1 as remainder
            if (counter%2==1){ // it's same as counter%2!=0
                System.out.print(counter+" ");
            }
            counter--;
        }
    }
}
