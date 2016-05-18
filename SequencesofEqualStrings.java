import java.util.ArrayList;
import java.util.Scanner;

public class SequencesofEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] readArreys = text.split(" ");
        ArrayList<String> read = new ArrayList<String>();

        read.add(readArreys[0]);

        if (readArreys.length == 1) {
            System.out.println(readArreys[0]);
        }

        for (int i = 0; i < readArreys.length - 1; i++) {
            if (readArreys[i].equals(readArreys[i + 1])) {
                read.add(readArreys[i + 1]);
                if (i == readArreys.length - 2) {
                    printSequence(read);
                }
            } else {
                printSequence(read);
                System.out.println();
                read.clear();
                read.add(readArreys[i + 1]);
                if (i == readArreys.length - 2) {
                    printSequence(read);
                }
            }
        }

    }

    public static void printSequence(ArrayList<String> read) {
        for (String reads : read) {
            System.out.print(read + " ");
        }
    }

}





