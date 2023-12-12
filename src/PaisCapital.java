import java.util.*;
public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> paisesMap = new HashMap<String, String>();
        paisesMap.put("España", "Madrid");
        paisesMap.put("Alemania", "Berlin");
        paisesMap.put("Italia", "Roma");
        paisesMap.put("Noruega", "Oslo");
        paisesMap.put("Francia", "Paris");

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un pais Europeo");
        String capitalesMap = sc.nextLine();
        if (paisesMap.containsKey(capitalesMap)){
            System.out.println("La capital de " + capitalesMap + " es " + paisesMap.get(capitalesMap));
        }
        else {
            System.out.println("No tenemos la capital de ese país en el código");
        }

    }
    public static String capital (Map<String, String> paisesMap, String capitalesMap){
        return paisesMap.get(capitalesMap);
    }
}
