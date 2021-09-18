package edu.isu.cs2263.hw01;

public class Eval {
    public Eval() {

    }

    public float evaluate(String line) {
        String[] chars = line.split(" ");
        float total = Float.parseFloat(chars[0]);

        for (int i = 1; i < chars.length; i+=2) {
            switch (chars[i]) {
                case "+":
                    total += Float.parseFloat(chars[i + 1]);
                    break;
                case "-":
                    total -= Float.parseFloat(chars[i + 1]);
                    break;
                case "*":
                    total *= Float.parseFloat(chars[i + 1]);
                    break;
                case "/":
                    total /= Float.parseFloat(chars[i + 1]);
                    break;
                default:
                    break;
            }
        }
        return total;
    }
}
