// Java Program to Add Elements to a List

// Importing all utility classes
import java.util.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String args[])
    {
        // Creating an object of List interface,
        // implemented by ArrayList class
        List<String> add = new ArrayList<>();

        add.add("primero");
        add.add("segundo");
        add.add("tercero");

        List<String> al = new ArrayList<>();

        al.add("antepenultimo");
        al.add("penultimo");
        al.add("ultimo");

        System.out.println("Podio " +add);
        System.out.println("AntiPodio " + al);

        List<String> alll = new ArrayList<>();

        // Adding elements to object of List class
        alll.add("Geeks");
        alll.add("Geeks");
        alll.add(1, "Geeks");
        alll.add("Geeks");
        alll.add(3, "Geeks");
        alll.add("Geeks");
        alll.add("Geeks");

        System.out.println("Viewers " + alll);

    }

}
