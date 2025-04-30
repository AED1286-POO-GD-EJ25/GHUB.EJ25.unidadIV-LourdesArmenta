package desacoplar;
public class MiAplicacionDeMensajes{
    public static void main(String[] args) {
        /* 
        Comunicador t1 = new TelefonoCelular();
        Comunicador t2 = new PalomaMensajera();
        Comunicador t3 = new Telegrafo();

        t1.enviarMensaje("mensaje");
        t2.enviarMensaje("mensaje");
        t3.enviarMensaje("mensaje");
        */
        Comunicador c = ComunicacionManager.crearComunicador();
        c.enviarMensaje("Hola, este es mi mensaje");



        
    }
}