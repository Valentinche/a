
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayofNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumbers = input.nextInt();
        input.nextLine();
        int[] numbers = new int[randomNumbers];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();


        }
        Arrays.sort(numbers);
        for (int number:numbers){
            System.out.print(number+" ");
        }
    }

}
