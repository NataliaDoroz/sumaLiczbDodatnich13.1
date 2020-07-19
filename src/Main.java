import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = getNumberList();
        showList(numberList);
        sumAndPrintNumberList(numberList);
        minAndMax(numberList);
    }

    private static ArrayList<Integer> getNumberList() {
        ArrayList<Integer> numberList = new ArrayList<>();
        int number;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("podaj liczbę:  ");
            number = scan.nextInt();
            if (number > 0) {
                numberList.add(number);
            }
        }
        while (number > 0);
        return numberList;
    }

    private static void showList(ArrayList<Integer> numberList) {
        System.out.print("odwrotna kolejność: ");
        for (int i = numberList.size() - 1; i >= 0; i--) {
            System.out.print(numberList.get(i) + " ");
        }
        System.out.println();
    }

    private static void sumAndPrintNumberList(ArrayList<Integer> numberList) {
        int sum = 0;
        for (Integer number : numberList) {
            sum += number;
        }
        for (int i = 0; i < numberList.size(); i++) {
            if (i == numberList.size() - 1) {
                System.out.print(numberList.get(i));
            } else {
                System.out.print(numberList.get(i) + " + ");
            }
        }
        System.out.println(" = " + sum);
    }

    private static void minAndMax(ArrayList<Integer> numberList) {
        int max = numberList.get(0);
        int min = numberList.get(0);
        for (Integer number : numberList) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
