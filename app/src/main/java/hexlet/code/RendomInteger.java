package hexlet.code;

public class RendomInteger {
    public static int get(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
