package class9;

public class E4Arrays {
    public static void main(String[] args) {
        /*
        create an array of String store 5 names in that array
        print all the names from that array with the help of a for loop try
        printing with help of a while loop as well
         */

        String []names={"Viktorija","Lazar","Verica","Mare","Stanka"};

        for (int j=0;j< names.length;j++){
            System.out.print(names[j]+" ");
        }
        System.out.println();
        int counter=0;
        while (counter< names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}
