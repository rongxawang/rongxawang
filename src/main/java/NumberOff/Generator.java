package NumberOff;

import java.util.Scanner;

public class Generator {
    private Scanner scanner = new Scanner(System.in);

    public Integer[] generate() {
        System.out.println("Please input the number of students:");
        int people = scanner.nextInt();
        Integer[] array = new Integer[people];
        for (int index = 0; index < people; index++) {
            array[index] = index + 1;
        }
        return array;
    }
}
