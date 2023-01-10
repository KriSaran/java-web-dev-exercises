package excercises;
import java.util.Arrays;

public class Arraypractice {
    public static void main(String[] args){
        int[] list={1,1,2,3,5,8};
        for(int print:list) {
            if (print % 2 == 0) {
                System.out.println(print);
                //continue;
            }
        }
        String words="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

      //  String[] mWords=words.split(" ");
        //System.out.println(mWords);
        //String[] mWords=words.replaceAll(",","");
       // System.out.println(Arrays.toString(mWords));


       // System.out.println(mWords.length);
        String[] sentences = words.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}