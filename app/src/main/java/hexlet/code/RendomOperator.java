package hexlet.code;

public class RendomOperator {
    public static char get() {
        var operator = '+';
        final int plus = 1;
        final int minus = 2;
        final int mult = 3;
        switch (RendomInteger.get(0, mult)) {
            case plus: operator = '+';
            break;
            case minus: operator = '-';
            break;
            default: operator = '*';
        }
        return operator;
    }
}
