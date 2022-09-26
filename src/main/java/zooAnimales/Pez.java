package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){
        this(null,-1,null,null,null,-1);
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
        setTotalPeces(1);
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public int cantidadPeces(){
        return listado.size();
    }

    public String movimiento(){
        return "nadar";
    }

    public static Pez crearSalmon(String nombre,int edad,String genero){
        salmones ++;
        String colorEscamas = "rojo";
        int cantidadAletas = 6;
        String habitat = "oceano";
        Pez salmon = new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
        listado.add(salmon);
        return salmon;
    }

    public static Pez crearBacalao(String nombre,int edad,String genero){
        bacalaos ++;
        String colorEscamas = "gris";
        int cantidadAletas = 6;
        String habitat = "oceano";

        Pez bacalao = new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
        listado.add(bacalao);
        return bacalao;
    }
	

}