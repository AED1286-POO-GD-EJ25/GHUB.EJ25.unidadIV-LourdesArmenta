package abstractas;
abstract class FiguraGeometrica{
    //atributos
    protected double x;
    protected double y;

    protected String nombre;
    //constructores
    public FiguraGeometrica(){
        x = 0;
        y = 0;
    }
    public FiguraGeometrica(double x, double y){
        this.x = x;
        this.y = y;
    }
    public FiguraGeometrica(String nom){
        this.nombre = nom;

    }
    //método abstractos
    public abstract double area();
    //método concreto
    public String toString(){
        return nombre+ " Area: "+area();
    }
    
}