import java.util.Objects;
import java.util.Scanner;
//Code werkt niet :(
public class Main {

    public static void main(String[] args) {
        int[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes"," zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(numeric, alphabetic);
        Scanner scanner = new Scanner(System.in);
        boolean play = true;

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te verlaten"); // Waarom wordt de vraag twee keer
            // geprint?
            String input = scanner.nextLine();

            if (Objects.equals(input, "x")) { // Waarom corrigeert IntelliJ dit? Het werkt wel.
                play = false;
                System.out.println("Stop programma.");
            } else if (Objects.equals(input, "v")) {
                play = true;
                System.out.println("Geef een nummer tussen 0 t/m 9");
                int number = scanner.nextInt();
                if (number >= 0 && number <= 9) { //Check of de input tussen 0-9 is.
                String translation = translator.translate(number);
                System.out.println("Translation: " + translation);
            } else if (!input.equals("v") && !input.equals("x")) { // Check of er een x of een v is ingevoerd
                System.out.println(" ongeldig invoer");
            } else {
                System.out.println("Ongeldige invoer! Geef een nummer tussen 0 t/m 9");
                }

            }
        }
        scanner.close();
    }
}

