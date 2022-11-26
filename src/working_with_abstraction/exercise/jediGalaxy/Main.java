package working_with_abstraction.exercise.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] fieldDimensions = readToArray(scanner.nextLine());
        Field field = new Field(fieldDimensions[0], fieldDimensions[1]);

        String command = scanner.nextLine();

        long starsCollected = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPositions = readToArray(command);
            Jedi jedi = new Jedi(jediPositions[0], jediPositions[1]);

            int[] evilPositions = readToArray(scanner.nextLine());
            EvilPower evil = new EvilPower(evilPositions[0], evilPositions[1]);

            Galaxy galaxy = new Galaxy(field, jedi, evil);
            galaxy.moveEvil();

            starsCollected += galaxy.moveJedi();
            command = scanner.nextLine();
        }

        System.out.println(starsCollected);
    }

    private static int[] readToArray(String input) {
        return Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
