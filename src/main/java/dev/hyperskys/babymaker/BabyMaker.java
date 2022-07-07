package dev.hyperskys.babymaker;

import dev.hyperskys.babymaker.api.data.Color;
import dev.hyperskys.babymaker.api.data.Gender;
import dev.hyperskys.babymaker.api.data.Location;
import dev.hyperskys.babymaker.api.data.Target;
import dev.hyperskys.babymaker.api.impl.CumShot;
import dev.hyperskys.babymaker.user.impl.DialogService;
import java.util.Scanner;

public class BabyMaker {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DialogService input = new DialogService(scanner);

    public static void main(String[] args) {
        System.out.println("What is your name?: ");
        String name = input.nextString();

        System.out.println("How many sperm should you shoot?: ");
        int spermCount = input.nextInteger();

        System.out.println("Who is your target?: ");
        System.out.println("Options: Male, or Female");
        Target target = input.nextTarget();

        System.out.println("What gender are you?: ");
        System.out.println("Options: Male, or Female");
        Gender gender = input.nextGender();

        System.out.println("Where does your sperm shoot into?: ");
        System.out.println("Options: Ass, Mouth, or Vagina");
        Location location = input.nextLocation();

        System.out.println("What color is your sperm?: ");
        System.out.println("Options: White, Green, Rainbow, or American");
        Color color = input.nextColor();

        new CumShot(name, spermCount, target, location, color, gender).shoot();

        System.out.println("Please type something and press ENTER to redo this application.");
        scanner.next();
        main(args);
    }
}