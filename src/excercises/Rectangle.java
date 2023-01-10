package excercises;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length :");
        int length=input.nextInt();
        System.out.println("Enter the width");
        int width=input.nextInt();
        int area=length * width;
        System.out.println("Area of the rectangle:"+area);
        input.close();
    }
}
