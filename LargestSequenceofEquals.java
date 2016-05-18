import java.util.Scanner;

public class LargestSequenceofEquals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] symbols = text.split(" ");

        int temp = 1;
        int count = Integer.MIN_VALUE;
        int endIndex = 0;
        int tempEnd = 0;

        for (int i = 0; i < symbols.length - 1; i++) {
            if (symbols[i].equals(symbols[i + 1])) {
                temp++;
                tempEnd = i + 1;
                if (i == symbols.length - 2) {
                    if (temp > count) {
                        count = temp;
                        endIndex = tempEnd;
                    }
                }
            } else {
                if (temp > count) {
                    count = temp;
                    endIndex = tempEnd;
                }
                temp = 1;
            }
        }

        if (symbols.length != 1) {
            int startIndex = endIndex - count + 1;
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(symbols[i] + " ");
            }
        } else {
            System.out.println(symbols[0]);
        }

    }

}

