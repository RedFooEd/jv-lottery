package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"RED", "GREEN", "BLUE", "YELLOW", "ORANGE"};

    public String getRandomColor() {
        int index = new Random().nextInt(colors.length);
        return colors[index];
    }
}
