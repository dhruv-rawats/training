package training;
//Program to find vowels count in string
import java.util.HashSet;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
        int count = 0;
        HashSet<Character> vowels = new HashSet<>();
        
        // Add vowels to HashSet
        for (char v : "aeiou".toCharArray()) {
            vowels.add(v);	
        }

        // Count vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (vowels.contains(ch)) {
                count++;
            }
        }

        System.out.println("Vowel count: " + count);
	}

}
