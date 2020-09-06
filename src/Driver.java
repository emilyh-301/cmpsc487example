import java.util.Scanner;

public class Driver {

    public static void main(String[] args){

        System.out.println("Hello software engineering student!");

        String favAnimal = favoriteAnimal();
        System.out.println("*** " + favAnimal + " ***");
    }

    public static String favoriteAnimal(){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite animal?");

        String favoriteAnimal = scan.nextLine();
        return favoriteAnimal;
    }

}