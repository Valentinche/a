import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String text = input.nextLine();
        String[] textsArray = text.split(" ");

        int[] integers = new int[textsArray.length];
        integers = convertToInt(textsArray, integers);

        int max = Integer.MIN_VALUE;
        int tempCount = 1;
        int Index = 0;
        int tempEnd = 0;

        for (int i = 0; i < integers.length - 1; i++) {
            if (integers[i] < integers[i + 1]) {
                tempCount++;
                tempEnd = i + 1;
                if (i == integers.length - 2) {
                    if (tempCount > max) {
                        max = tempCount;
                        Index = tempEnd;
                    }
                    int startIndex = tempEnd - tempCount + 1;
                    for (int j = startIndex; j <= tempEnd; j++) {
                        System.out.print(integers[j] + " ");
                    }
                    System.out.println();
                }
            } else {
                if (tempCount > max) {
                    max = tempCount;
                    Index = tempEnd;
                }
                int startIndex = tempEnd - tempCount + 1;
                for (int j = startIndex; j <= tempEnd; j++) {
                    System.out.print(integers[j] + " ");
                }
                System.out.println();
                tempCount = 1;
                tempEnd = i + 1;
            }
        }

        int startIndex = Index - max + 1;
        System.out.print("Longest: ");
        for (int j = startIndex; j <= Index; j++) {
            System.out.print(integers[j] + " ");
        }

    }

    private static int[] convertToInt(String[] numbersArray, int[] integers) {
        for (int i = 0; i < numbersArray.length; i++) {
            integers[i] = Integer.parseInt(numbersArray[i]);
        }
        return integers;


    }
}
