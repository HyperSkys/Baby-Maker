import api.data.Color;
import api.data.Location;
import api.data.Target;
import api.impl.CumShot;
import user.impl.DialogService;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DialogService input = new DialogService(scanner);

    public static void main(String[] args) {
        System.out.println("What is your name?: ");
        String name = input.nextString();

        System.out.println("How many sperm should you shoot?: ");
        int spermCount = input.nextInteger();

        System.out.println("Who is your target?: ");
        System.out.println("Options: Boy or Girl");
        Target target = input.nextTarget();

        System.out.println("Where does your sperm shoot into?: ");
        System.out.println("Options: Ass, Mouth, or Vagina");
        Location location = input.nextLocation();

        System.out.println("What color is your sperm?: ");
        System.out.println("Options: White, Green, or Rainbow");
        Color color = input.nextColor();

        CumShot cumShot = new CumShot(name, spermCount, target, location, color);
        cumShot.shoot();

        System.out.println("Please press ENTER to redo this application.");
        input.nextString();
        main(args);
    }
}