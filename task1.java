package training;
//frequency of every char in the string
public class ques1 {

	public static void main(String[] args) {
		
		String str = "helloworld";
        int[] freq = new int[256];  

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
	}

}
