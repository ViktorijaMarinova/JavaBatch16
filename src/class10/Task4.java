package class10;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an array of cars and store 6 elements into it. Using 2 different loops print all
        values from the array
         */

        String[]cars={"Toyota","BMW","Honda","Bugatti","Audi","Mercedes"};
        for (String car:cars){
            System.out.println(car + " ");
        }
        System.out.println();
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]+ " ");

        }
        System.out.println();
        int i=0;
        while (i< cars.length){
            System.out.println(cars[i]+ " ");
            i++;
        }


    }
}
