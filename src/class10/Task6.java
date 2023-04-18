package class10;

public class Task6 {
    public static void main(String[] args) {
        /*
        Create an array on integers and calculate the sum of all elements in array
        From an array of integer elements find the largest number
         */
        int []numbers={10,20,30,50};
        int sum=0;

        for(int num:numbers){
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
