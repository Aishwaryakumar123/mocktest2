import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Average_list_Number {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of numbers (enter -1 to finish):");

        int num;
        do {
            num = scanner.nextInt();
            if (num != -1) {
                numbers.add(num);
            }
        } while (num != -1);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();
        System.out.println("Average: " + average);

    }
}
