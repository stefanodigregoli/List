import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String>cityNames =Arrays.asList(" Palermo", " Amsterdam", " Tokyo");
        cityNames.set(1, " Tegucigalpa ");
        System.out.println("City Name:" + cityNames);

        ArrayList <String>kingsOfRome = new ArrayList<>();

        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Lucio Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Lucio tarqunio Superbo");

        System.out.println(kingsOfRome);

        String[]kingsOfRomeArray=kingsOfRome.toArray(new String[0]);

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}