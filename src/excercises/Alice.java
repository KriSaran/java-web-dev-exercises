package excercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        String input ="Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter term to search:");
        String search = scanner.nextLine();
        if(input.toLowerCase().contains(search.toLowerCase())) {
            //System.out.println(input);
            //System.out.println(search.length());
            System.out.println("Index of the word in the paragraph: "+input.indexOf(search)+ " & String Length is: " + search.length());
            String newValue="";
            String replacedString;
            replacedString=input.replace(search,newValue);
            System.out.println(replacedString);
        } else {
            System.out.println("Search term not found");
        }
        scanner.close();
    }
}
