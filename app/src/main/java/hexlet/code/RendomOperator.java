package hexlet.code;

public class RendomOperator {
    public static char get() {
        var operator = '+';
        final int plus = 0;
        final int minus = 1;
        final int mult = 2;
        final int max = 4;
        switch (RendomInteger.get(0, max)) {
            case plus: operator = '+';
            break;
            case minus: operator = '-';
            break;
            case mult: operator = '*';
            break;
            default: operator = '/';
        }
        return operator;
    }
}
