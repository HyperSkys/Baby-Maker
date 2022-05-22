import user.CumShot;
import types.Color;
import types.Location;
import types.Target;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("What is your name?: ");
            String name = scanner.next();

            System.out.println("How many sperm do you shoot?: ");
            int spermCount = scanner.nextInt();

            System.out.println("Who is your target? (boy/girl): ");
            String type = scanner.next();
            Target target = null;

            if(type.equalsIgnoreCase("boy")) {
                target = Target.BOY;
            } else if(type.equalsIgnoreCase("girl")) {
                target = Target.GIRL;
            } else {
                System.out.println("There is only 2 genders.");
                main(args);
            }

            System.out.println("Where do you shoot at? (ass/vagina/mouth): ");
            String in = scanner.next();
            Location location = null;

            if(in.equalsIgnoreCase("ass")) {
                location = Location.ASS;
            } else if(in.equalsIgnoreCase("mouth")) {
                location = Location.MOUTH;
            } else if(in.equalsIgnoreCase("vagina")) {
                location = Location.VAGINA;
            } else {
                System.out.println("0% accuracy try again.");
                main(args);
            }

            System.out.println("What color is your sperm (white/green): ");
            String col = scanner.next();
            Color color = null;

            if(col.equalsIgnoreCase("white")) {
                color = Color.WHITE;
            } else if(col.equals("green")) {
                color = Color.GREEN;
            } else {
                System.out.println("Weird color cum you have buddy.");
                main(args);
            }

            CumShot shot = new CumShot(name, spermCount, target, location, color);
            shot.shoot();
        } catch (InputMismatchException e) {
            System.out.println("You did not enter a valid number.");
            main(args);
        }

        System.out.println("All babies have been killed due to death now :(");
        System.exit(420);
    }
}
