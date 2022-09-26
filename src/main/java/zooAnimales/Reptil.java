package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){
        this(null,-1,null,null,null,-1);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
        setTotalReptiles(1);
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public int cantidadReptiles(){
        return listado.size();
    }

    public String movimiento(){
        return "reptar";
    }

    public static Reptil crearIguana(String nombre,int edad,String genero){
        iguanas ++;
        String colorEscamas = "verde";
        int largoCola = 3;
        String habitat = "humedal";
        Reptil iguana = new Reptil(nombre, edad,habitat,genero,colorEscamas,largoCola);
        listado.add(iguana);
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre,int edad,String genero){
        serpientes ++;
        String colorEscamas = "blanco";
        int largoCola = 1;
        String habitat = "jungla";
        Reptil serpiente = new Reptil(nombre,edad,habitat,genero,colorEscamas,largoCola);
        listado.add(serpiente);
        return serpiente;
    }
}