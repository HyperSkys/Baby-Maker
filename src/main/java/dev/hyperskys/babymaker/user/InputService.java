package dev.hyperskys.babymaker.user;

import dev.hyperskys.babymaker.api.data.Color;
import dev.hyperskys.babymaker.api.data.Gender;
import dev.hyperskys.babymaker.api.data.Location;
import dev.hyperskys.babymaker.api.data.Target;

public interface InputService {
    String nextString();
    Integer nextInteger();
    Target nextTarget();
    Location nextLocation();
    Color nextColor();
    Gender nextGender();
}
