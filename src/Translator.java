import java.util.HashMap;

public class Translator {
    private final HashMap<Integer, String> numericAlpha;

    public Translator(int[] numeric, String[] alphabetic) {
        numericAlpha = new HashMap<>();
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate(int number) {
        return numericAlpha.get(number);
    }
}