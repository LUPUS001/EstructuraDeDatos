import java.util.*;
public class ConvertirArray {
    public static void main(String[] args) {
        ArrayList<String> animales = new ArrayList<>();
        animales.add("Lobo");
        animales.add("Pato");
        animales.add("Tortuga");
        animales.add("Delfin");

        System.out.println(animales);

        String[] str = new String[animales.size()];
        for (int i = 0; i < animales.size(); i++) {
            str[i] = animales.get(i);
        }

        for (int i = 0; i < str.length; i++){
            String s = str[i];
            System.out.println(s);
        }
    }
}

