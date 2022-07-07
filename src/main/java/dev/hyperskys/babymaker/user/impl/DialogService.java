package dev.hyperskys.babymaker.user.impl;

import dev.hyperskys.babymaker.BabyMaker;
import dev.hyperskys.babymaker.api.data.Color;
import dev.hyperskys.babymaker.api.data.Gender;
import dev.hyperskys.babymaker.api.data.Location;
import dev.hyperskys.babymaker.api.data.Target;
import dev.hyperskys.babymaker.user.InputService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DialogService implements InputService {

    private final Scanner scanner;
    public DialogService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String nextString() {
        return scanner.next();
    }

    @Override
    public Integer nextInteger() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The users input failed to map to a variable.");
            System.exit(0);
        }

        return null;
    }

    @Override
    public Target nextTarget() {
        switch (scanner.next().toLowerCase()) {
            case "male":
                return Target.MALE;

            case "female":
                return Target.FEMALE;

            default:
                System.out.println("The users input failed to map to a variable.");
                System.exit(0);
        }

        return null;
    }

    @Override
    public Location nextLocation() {
        switch (scanner.next().toLowerCase()) {
            case "mouth":
                return Location.MOUTH;

            case "ass":
                return Location.ASS;

            case "vagina":
                return Location.VAGINA;

            default:
                System.out.println("The users input failed to map to a variable.");
                System.exit(0);
        }

        return null;
    }

    @Override
    public Color nextColor() {
        switch (scanner.next().toLowerCase()) {
            case "white":
                return Color.WHITE;

            case "green":
                return Color.GREEN;

            case "rainbow":
                return Color.RAINBOW;

            case "american":
                return Color.AMERICAN;

            default:
                System.out.println("The users input failed to map to a variable.");
                System.exit(0);
        }

        return null;
    }

    @Override
    public Gender nextGender() {

        switch (scanner.next().toLowerCase()) {
            case "male":
                return Gender.MALE;

            case "female":
                return Gender.FEMALE;

            default:
                System.out.println("The users input failed to map to a variable.");
                System.exit(0);
        }

        return null;
    }
}
