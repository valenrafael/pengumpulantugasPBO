enum Level {
    BEGINNER(0),
    INTERMEDIATE(100),
    EXPERT(500);

    private final int poinMin;

    // Constructor enum harus private
    Level(int poinMin) {
        this.poinMin = poinMin;
    }

    public int getPoinMin() {
        return poinMin;
    }
}

public class MainEnumLevel {
    public static void main(String[] args) {
        for (Level lvl : Level.values()) {
            System.out.println("Level: " + lvl + " | Poin Minimum: " + lvl.getPoinMin());
        }
    }
}