package user;

import api.data.Color;
import api.data.Location;
import api.data.Target;

public interface InputService {
    String nextString();
    Integer nextInteger();
    Target nextTarget();
    Location nextLocation();
    Color nextColor();
}
