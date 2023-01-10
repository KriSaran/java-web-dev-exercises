package excercises;
//import java.sql.Array;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int i=0;
        System.out.println("Enter the number to Array List");
        do{
        Integer n = input.nextInt();
     //   if(n!=null) {
            numbers.add(n);
            i += 1;
      //  }
        }while(i<=9);
      System.out.println(numbers);
      int sum = 0;
      for(int num :numbers){
          if(num%2==0){
              sum+=num;
          }
      }
      System.out.println("Sum of all the even numbers in array : "+sum);
        String words = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        ArrayList<String> cWords=new ArrayList<>();

        String[] mWords = words.split(" ");

      //  String result = Arrays.toString(mWords);
      //  System.out.println(result);
        for (String test : mWords) {
            if (test.contains(".")) {
             test = test.replace(".","");
            }else if(test.contains(",")) {
            test=test.replace(",","");
        }
                cWords.add(test);
        }
        System.out.println(cWords);
        System.out.println(cWords.size());
    }
}
