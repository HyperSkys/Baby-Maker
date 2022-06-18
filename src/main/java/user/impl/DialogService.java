package user.impl;

import api.data.Color;
import api.data.Location;
import api.data.Target;
import user.InputService;
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
            case "boy":
                return Target.BOY;

            case "girl":
                return Target.GIRL;

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

            default:
                System.out.println("The users input failed to map to a variable.");
                System.exit(0);
        }

        return null;
    }
}
