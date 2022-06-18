package api.impl;

import api.data.Color;
import api.data.Location;
import api.data.Target;
import api.Sperm;

public class CumShot {

    private final String owner;
    private final int spermCount;
    private final Target target;
    private final Location location;
    private final Color color;

    public CumShot(String owner, int spermCount, Target target, Location location, Color color) {
        this.owner = owner;
        this.spermCount = spermCount;
        this.target = target;
        this.location = location;
        this.color = color;
    }

    public void shoot() {
        switch (color) {
            case WHITE:
                if(location.equals(Location.VAGINA) && target != Target.BOY) {
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

                if(location.equals(Location.MOUTH) && target != Target.BOY) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Stomach Sperm ["+i+"x]");
                        System.out.println("New Stomach Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Stomach Sperm number " + spermSelected + " would have been born but was swallowed :(");
                    return;
                }

                if(location.equals(Location.ASS) && target != Target.BOY) {
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

                System.out.println(owner + " you know men can't get pregnant right?");
                System.exit(69);
                break;

            case GREEN:
                if(location.equals(Location.VAGINA) && target != Target.BOY) {
                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    int chanceOfDeath = (int)Math.floor(Math.random()*(2-1+1)+1);

                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Alien Sperm ["+i+"x]");
                        System.out.println("New Alien Sperm Incoming: " + sperm.getName());
                    }

                    if(chanceOfDeath != 1) {
                        System.out.println(owner + " Alien Sperm number " + spermSelected + " was selected but died in the womb due to death.");
                        return;
                    }

                    System.out.println(owner + " Alien Sperm number " + spermSelected + " was selected and made it out of the womb.");
                    return;
                }

                if(location.equals(Location.MOUTH) && target != Target.BOY) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Alien Stomach Sperm ["+i+"x]");
                        System.out.println("Alien New Stomach Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Alien Stomach Sperm number " + spermSelected + " would have been born but was swallowed :(");
                    return;
                }

                if(location.equals(Location.ASS) && target != Target.BOY) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Alien Shit Sperm ["+i+"x]");
                        System.out.println("New Alien Shit Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    int chanceOfDeath = (int)Math.floor(Math.random()*(2-1+1)+1);

                    if(chanceOfDeath != 1) {
                        System.out.println(owner + " Alien Shit Sperm number " + spermSelected + " would have been able to harvest your shit but died :(");
                        return;
                    }

                    System.out.println(owner + " Alien Shit Sperm number " + spermSelected + " was selected and is now harvesting your shit.");
                    return;
                }

                System.out.println(owner + " you know alien men can't get pregnant right?");
                System.exit(69);
                break;

            case RAINBOW:
                if(location.equals(Location.ASS) && target != Target.GIRL) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Pride Sperm ["+i+"x]");
                        System.out.println("New Pride Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Pride Sperm number " + spermSelected + " was selected and is now giving you head.");
                    return;
                }

                if(location.equals(Location.MOUTH) && target != Target.GIRL) {
                    for(int i = 0; i <= spermCount; i++) {
                        Sperm sperm = new Sperm(owner + " Wet Pride Sperm ["+i+"x]");
                        System.out.println("New Wet Pride Sperm Incoming: " + sperm.getName());
                    }

                    int spermSelected = (int)Math.floor(Math.random()*(spermCount-1+1)+1);
                    System.out.println(owner + " Wet Pride Sperm number " + spermSelected + " was selected and is now lubricating your asshole.");
                    return;
                }

                System.out.println(owner + " you know alien men can't get pregnant right?");
                System.exit(69);
                break;

            default:
                System.out.println("What kind of fucking baby is this?");
                System.exit(0);
        }
    }
}
