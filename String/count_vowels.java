import java.util.Scanner;
public class count_vowels {

    public static boolean isVowel(char ch) {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }

    public static int countVowels(String input) {
        int count=0;
        for(int i=0; i<input.length(); i++) {
            char ch=input.charAt(i);
            if(isVowel(ch)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:" );
        String input = sc.nextLine();

        int vowelCount = countVowels(input);
        System.out.println("Total vowels in our input is "+vowelCount);
    }
}