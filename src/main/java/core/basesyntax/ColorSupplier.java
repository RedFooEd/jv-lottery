package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int index = new Random().nextInt(RandomColors.values().length);
        return String.valueOf(RandomColors.values()[index]);
    }
}
