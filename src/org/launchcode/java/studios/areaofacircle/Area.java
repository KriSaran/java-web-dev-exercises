package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        float radius;
        //double area;
        Scanner input;
        input =new Scanner(System.in);
        System.out.println("Enter the radius :");
        radius=input.nextFloat();
       System.out.println(Circle.getArea(Double.valueOf(radius)));

        input.close();
       // area=Math.PI *(radius*radius);
        //System.out.println(area);
        //System.out.println(((Object)area).getClass().getSimpleName());
    }
}
