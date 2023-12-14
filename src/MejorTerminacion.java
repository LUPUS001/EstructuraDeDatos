import java.util.*;
public class MejorTerminacion {
    public static void main(String[] args) {
        String [] decimos = {"98234", "45678", "09784"};
        for (String numero : decimos) {
            char ultimoCaract = numero.charAt(numero.length() - 1);
            System.out.println(ultimoCaract);
        }

        Map<Integer, Integer> terminaciones = new HashMap<>();
        terminaciones.put(4, 3);
        terminaciones.put(3, 4);
        System.out.println(terminaciones.toString());
        Integer cuantos = terminaciones.get(4);
        terminaciones.put(4, cuantos + 1);

        cuantos = terminaciones.get(5);
        if (cuantos == null){
            terminaciones.put(5, 1);
        }
        else {
            terminaciones.put(5, cuantos + 1);
        }
    }
}
