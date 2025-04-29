package genericos;
public class Caja{
    //Atributos
    private String contenido;

    //propiedades
    public String getContindo(){
        return contenido;
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    @Override
    public String toString(){
        return "Contenido de la caja: "+contenido;
    }

}