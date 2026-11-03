import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        System.out.print("Enter word to insert: ");
        String word = sc.nextLine();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index >= 0 && index <= sb.length()) {
            sb.insert(index, word);
            System.out.println("Updated String: " + sb);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}
