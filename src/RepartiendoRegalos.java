import java.util.*;
public class RepartiendoRegalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> portales = new ArrayList<>();
        portales.add(0, 3);
        portales.add(1, 2);
        portales.add(2, 5);
        //int portal;
        int resultado = 0;
        System.out.println("¿En que orden visitará los portales?");
/*
        for (int i = 0; i < 3; i++) {
            portal = sc.nextInt();
            portales.add(portal);

        }*/
        System.out.println(portales);

        for (int i = 0; i < portales.size(); i++) {
            if (portales.indexOf(0) - portales.indexOf(1) < portales.indexOf(0) - portales.indexOf(2)){
                resultado += portales.indexOf(1);
                resultado += portales.indexOf(2);
            }
            else if (portales.indexOf(0) - portales.indexOf(1) > portales.indexOf(0) - portales.indexOf(2)){
                resultado += portales.indexOf(2);
                resultado += portales.indexOf(1);
            }


            System.out.println(resultado);
        }
    }
}

