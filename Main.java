import java.util.Scanner;

public class Main {
    
    public static void reverse(String input){
        char[] arr = input.toCharArray();
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word to be reversed");
        String word = sc.nextLine();
        reverse(word);
    }
}
