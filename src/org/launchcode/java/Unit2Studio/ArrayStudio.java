package org.launchcode.java.Unit2Studio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ArrayStudio {
    public static void main(String[] args){
        //String sentences="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Strings :");
        String sentences=input.nextLine();
        char[] charInString=sentences.toLowerCase().toCharArray();
       // System.out.println(charInString);
        HashMap<Character,Integer> mapping=new HashMap<>();
        for(char temp:charInString){

            if (!String.valueOf(temp).matches("[a-zA-Z]")) {
                continue;
            }

            if(mapping.containsKey(temp)){
                mapping.put(temp,(mapping.get(temp)+1));
            }else{
                mapping.put(temp,1);
            }
        }
        for (Map.Entry<Character,Integer> mEntry: mapping.entrySet()) {

                System.out.println(mEntry.getKey() + " :" + mEntry.getValue());

        }
        input.close();
                //System.out.println(mapping);
    }
}
