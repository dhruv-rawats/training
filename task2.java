package training;
//Program to find minimum number from array
public class task2 {

	public static void main(String[] args) {
		int[] arr = {7, 2, 9, 3, 1};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum number: " + min);
        
       

	}

}
