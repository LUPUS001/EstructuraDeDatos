import java.util.*;
public class PruebasMapa {
    public static void main(String[] args) {
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
        personal.put("145", new Empleado("Juan"));
        personal.put("2323", new Empleado("Antonio"));
        personal.put("148", new Empleado("Pepe"));
        System.out.println(personal);
        personal.put("148", new Empleado("Roberto"));
        personal.remove("145");
        System.out.println(personal);
    }
}

class Empleado{
    public Empleado (String n){
        nombre = n;

        sueldo = 2000;
    }
    public String toString(){
        return"[Nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }
    private String nombre;

    private double sueldo;
}