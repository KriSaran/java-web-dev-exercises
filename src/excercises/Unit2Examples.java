package excercises;

public class Unit2Examples {
    public static void main(String[] args){
        String msg = "Hello World";
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }
        for (int n:nums){
            System.out.println(n);
        }
        do {
            System.out.println("Hello world!");
        } while (3 < 2);
    }
}
