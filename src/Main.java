import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            String userInput = scanner.nextLine();
            A.add(userInput);
        }

        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            String userInput = scanner.nextLine();
            B.add(userInput);
        }

        List<String> C = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(4 - i));
        }

        System.out.println("Объединенный список C:");
        for (String item : C) {
            System.out.println(item);
        }

        Collections.sort(C, Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список C по длине слова:");
        for (String item : C) {
            System.out.println(item);
        }
    }
}

