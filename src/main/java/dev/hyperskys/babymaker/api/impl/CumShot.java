package dev.hyperskys.babymaker.api.impl;

import dev.hyperskys.babymaker.api.data.Color;
import dev.hyperskys.babymaker.api.data.Gender;
import dev.hyperskys.babymaker.api.data.Location;
import dev.hyperskys.babymaker.api.data.Target;
import dev.hyperskys.babymaker.api.Sperm;
import org.jetbrains.annotations.NotNull;

public class CumShot {

    private final String owner;
    private final int spermCount;
    private final Target target;
    private final Location location;
    private final Color color;
    private final Gender gender;

    public CumShot(@NotNull String owner, int spermCount, @NotNull Target target, @NotNull Location location, @NotNull Color color, @NotNull Gender gender) {
        this.owner = owner;
        this.spermCount = spermCount;
        this.target = target;
        this.location = location;
        this.color = color;
        this.gender = gender;
    }

    public void shoot() {
        boolean b = gender.equals(Gender.MALE) && target.equals(Target.MALE);
        boolean b1 = gender.equals(Gender.FEMALE) && target.equals(Target.FEMALE);
        boolean b2 = gender.equals(Gender.MALE) && location.equals(Location.MOUTH);
        boolean b3 = gender.equals(Gender.FEMALE) && location.equals(Location.MOUTH);
        boolean b4 = gender.equals(Gender.FEMALE) && location.equals(Location.VAGINA);
        boolean b5 = gender.equals(Gender.FEMALE) && location.equals(Location.ASS);
        boolean b6 = gender.equals(Gender.MALE) && location.equals(Location.VAGINA);
        boolean b7 = gender.equals(Gender.MALE) && location.equals(Location.ASS);

        switch (color) {
            case WHITE:
                if (b) {
                    System.out.println(owner + ", sorry but you know that Men are unable to get pregnant.");
                    System.out.println("If you want to bypass these laws, select sperm color to Pride Color.");
                    return;
                }

                if (b1) {
                    System.out.println(owner + ", we do not like to believe that you are going to have bone marrow babies.");
                    System.out.println("This may be a feature soon however, if you want it ;)");
                    return;
                }

                if (b2) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Stomach Sperm ["+i+"x]");
                        System.out.println("New Stomach Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Stomach Sperm number " + spermSelected + " would have been born but was swallowed :(");
                    return;
                }

                if (b3) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Creamy Stomach Sperm ["+i+"x]");
                        System.out.println("New Creamy Stomach Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Creamy Stomach Sperm number " + spermSelected + " would have been born but was swallowed :(");
                    return;
                }

                if (b4) {
                    System.out.println("Holy fuck, I have no idea where you found that hole but...");
                    return;
                }

                if (b5) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Pegged Sperm ["+i+"x]");
                        System.out.println("New Pegged Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Pegged Sperm number " + spermSelected + " would have been born but has severe brain damage :(");
                    return;
                }

                if (b6) {
                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    int chanceOfDeath = (int)Math.floor(Math.random()*(2-1+1)+1);

                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Sperm [" + i + "x]");
                        System.out.println("New Sperm Incoming: " + sperm.getName());
                    }

                    if(chanceOfDeath != 1) {
                        System.out.println(owner + " Sperm number " + spermSelected + " was selected but died in the womb due to death.");
                        return;
                    }

                    System.out.println(owner + " Sperm number " + spermSelected + " was selected and made it out of the womb.");
                    return;
                }

                if (b7) {
                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    int chanceOfDeath = (int)Math.floor(Math.random()*(2-1+1)+1);

                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Shit Sperm ["+i+"x]");
                        System.out.println("New Shit Sperm Incoming: " + sperm.getName());
                    }

                    if(chanceOfDeath != 1) {
                        System.out.println(owner + " Shit Sperm number " + spermSelected + " would have been able to harvest your shit but died :(");
                        return;
                    }

                    System.out.println(owner + " Shit Sperm number " + spermSelected + " was selected and is now harvesting your shit.");
                    return;
                }

                System.out.println("What the fuck, I have no idea...");
                System.exit(69);
                break;

            case GREEN:
                if (b) {
                    System.out.println(owner + ", sorry but you know that Alien Men are unable to get pregnant.");
                    System.out.println("If you want to bypass these laws, select sperm color to Pride Color.");
                    return;
                }

                if (b1) {
                    System.out.println(owner + ", we do not like to believe that you are going to have alien bone marrow babies.");
                    System.out.println("This may be a feature soon however, if you want it ;)");
                    return;
                }

                if (b2) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Alien Stomach Sperm ["+i+"x]");
                        System.out.println("New Alien Stomach Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Alien Stomach Sperm number " + spermSelected + " would have been born but was swallowed :(");
                    return;
                }

                if (b3) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Creamy Alien Stomach Sperm ["+i+"x]");
                        System.out.println("New Creamy Alien Stomach Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Creamy Alien Stomach Sperm number " + spermSelected + " would have been born but was swallowed :(");
                    return;
                }

                if (b4) {
                    System.out.println("Holy fuck, I have no idea where you found that hole but...");
                    return;
                }

                if (b5) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Pegged Alien Sperm ["+i+"x]");
                        System.out.println("New Pegged Alien Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Pegged Alien Sperm number " + spermSelected + " would have been born but has severe brain damage :(");
                    return;
                }

                if (b6) {
                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    int chanceOfDeath = (int)Math.floor(Math.random()*(2-1+1)+1);

                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Alien Sperm [" + i + "x]");
                        System.out.println("New Alien Sperm Incoming: " + sperm.getName());
                    }

                    if(chanceOfDeath != 1) {
                        System.out.println(owner + " Alien Sperm number " + spermSelected + " was selected but died in the womb due to death.");
                        return;
                    }

                    System.out.println(owner + " Alien Sperm number " + spermSelected + " was selected and made it out of the womb.");
                    return;
                }

                if (b7) {
                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    int chanceOfDeath = (int)Math.floor(Math.random()*(2-1+1)+1);

                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Alien Shit Sperm ["+i+"x]");
                        System.out.println("New Alien Shit Sperm Incoming: " + sperm.getName());
                    }

                    if(chanceOfDeath != 1) {
                        System.out.println(owner + " Alien Shit Sperm number " + spermSelected + " would have been able to harvest your shit but died :(");
                        return;
                    }

                    System.out.println(owner + " Alien Shit Sperm number " + spermSelected + " was selected and is now harvesting your shit.");
                    return;
                }

                System.out.println("What the fuck, I have no idea...");
                System.exit(69);
                break;

            case RAINBOW:
                if (gender.equals(Gender.MALE) && target.equals(Target.FEMALE)) {
                    System.out.println(owner + ", sorry but this is prideful not straightful.");
                    return;
                }

                if (gender.equals(Gender.FEMALE) && target.equals(Target.MALE)) {
                    System.out.println(owner + ", sorry but this is prideful not straightful.");
                    return;
                }

                if (gender.equals(Gender.MALE) && target.equals(Target.MALE) && location.equals(Location.ASS)) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Pride Sperm ["+i+"x]");
                        System.out.println("New Pride Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Pride Sperm number " + spermSelected + " was selected and is now giving you head.");
                    return;
                }

                if (gender.equals(Gender.FEMALE) && target.equals(Target.FEMALE) && location.equals(Location.ASS)) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " OnlyShit Pride Sperm ["+i+"x]");
                        System.out.println("New OnlyShit Pride Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " OnlyShit Pride Sperm number " + spermSelected + " was selected and is now making a million a month on OnlyShit.");
                    return;
                }

                if (gender.equals(Gender.FEMALE) && target.equals(Target.FEMALE) && location.equals(Location.VAGINA)) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Rock Paper Scissors Sperm ["+i+"x]");
                        System.out.println("New Rock Paper Scissors Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Rock Paper Scissors Sperm number " + spermSelected + " was selected and is a world record holder at scissoring.");
                    return;
                }

                if (gender.equals(Gender.MALE) && target.equals(Target.MALE) && location.equals(Location.VAGINA)) {
                    System.out.println("You guys are better explorers than Dora herself, you found something that doesn't exist.");
                    System.out.println("Or someone is transgender, however that isn't added so, yeah.");
                    return;
                }

                if (gender.equals(Gender.MALE) && target.equals(Target.MALE) && location.equals(Location.MOUTH)) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " What's for Breakfast Sperm ["+i+"x]");
                        System.out.println("New What's for Breakfast Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " What's for Breakfast Sperm number " + spermSelected + " was selected and has started a multi billion dollar cereal company.");
                    return;
                }

                if (gender.equals(Gender.FEMALE) && target.equals(Target.FEMALE) && location.equals(Location.MOUTH)) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Quick Squirt Sperm ["+i+"x]");
                        System.out.println("Quick Squirt Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Quick Squirt Sperm number " + spermSelected + " was selected and is the reason your walls are so sticky.");
                    return;
                }

                System.out.println("What the fuck, I have no idea...");
                System.exit(69);
                break;

            case AMERICAN:
                if (gender.equals(Gender.FEMALE)) {
                    System.out.println(owner + ", sorry but America does not like women's rights.");
                    return;
                }

                if (target.equals(Target.MALE)) {
                    System.out.println(owner + ", sorry but America does not like gay people's rights.");
                    return;
                }

                if (location.equals(Location.ASS)) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " American Diarrhea Sperm ["+i+"x]");
                        System.out.println("American Diarrhea Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " American Diarrhea Sperm number " + spermSelected + " was selected and is now one of the founding fathers.");
                    return;
                }

                if (location.equals(Location.VAGINA)) {
                    System.out.println("You most likely do not want to do this.");
                    System.out.println("Since abortions are now illegal in the USA.");
                    return;
                }

                if (location.equals(Location.MOUTH)) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " George Washington Sperm ["+i+"x]");
                        System.out.println("George Washington Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " George Washington Sperm number " + spermSelected + " was selected and is now battling Great Britain.");
                    return;
                }

                System.out.println("What the fuck, I have no idea...");
                System.exit(69);
                break;

            default:
                System.out.println("What kind of fucking baby is this?");
                System.exit(0);
                break;
        }
    }
}
