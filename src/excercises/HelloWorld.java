package excercises;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=input.nextLine();
        System.out.println("Hello " +name);
        input.close();
    }
}
