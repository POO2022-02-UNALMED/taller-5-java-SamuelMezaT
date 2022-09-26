package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Animal {
	private int totalAnimales;
    private static int totalMamiferos;
    private static int totalAves;
    private static int totalReptiles;
    private static int totalPeces;
    private static int totalAnfibios;

    public static int getTotalMamiferos() {
        return totalMamiferos;
    }

    public static void setTotalMamiferos(int totalMamiferos) {
        Animal.totalMamiferos = Animal.totalMamiferos + totalMamiferos;
    }

    public static int getTotalAves() {
        return totalAves;
    }

    public static void setTotalAves(int totalAves) {
        Animal.totalAves = Animal.totalAves + totalAves;
    }

    public static int getTotalReptiles() {
        return totalReptiles;
    }

    public static void setTotalReptiles(int totalReptiles) {
        Animal.totalReptiles = Animal.totalReptiles + totalReptiles;
    }

    public static int getTotalPeces() {
        return totalPeces;
    }

    public static void setTotalPeces(int totalPeces) {
        Animal.totalPeces = Animal.totalPeces + totalPeces;
    }

    public static int getTotalAnfibios() {
        return totalAnfibios;
    }

    public static void setTotalAnfibios(int totalAnfibios) {
        Animal.totalAnfibios = Animal.totalAnfibios + totalAnfibios;
    }

    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        this(null, 0, null, null);
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;

        totalAnimales++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {

        return "Mamiferos: "+getTotalMamiferos()+"\n" +
                "Aves: "+getTotalAves()+"\n" +
                "Reptiles: "+getTotalReptiles()+"\n" +
                "Peces: "+getTotalPeces()+"\n" +
                "Anfibios: "+getTotalAnfibios();
    }

    @Override
    public String toString() {
        String nombreAnimal = nombre;
        int edadAnimal = edad;
        String habitatAnimal = habitat;
        String generoAnimal = genero;
        String zonaAnimal;
        String nombreZoo;

        if (zona != null) {
            zonaAnimal = zona.getNombre();
            nombreZoo = zona.getZoo().getNombre();

            return "Mi nombre es " + nombreAnimal + ", tengo una edad de " + edadAnimal + ", habito en " + habitatAnimal + " y mi genero es" + generoAnimal + ", la zona en la que me ubico es " + zonaAnimal + ", en el " + nombreZoo;
        } else {
            return "Mi nombre es " + nombreAnimal + ", tengo una edad de " + edadAnimal +", habito en " + habitatAnimal + " y mi genero es " + generoAnimal;
        }
    }
}