package class4;

public class E2IfElseStatement {
    public static void main(String[] args) {
        // String is non-primitive data type, and we can't use == sign, we can't use relational operators

        String name="Jacob";

        //name.equals("Corey") =>checks if name and the value that we write inside equals () are same or not
        if (name.equals("Corey")) {
            System.out.println("I like swimming");
        } else {
            System.out.println("I like programming");
        }
    }
}
