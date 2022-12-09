package poop12;

/**
 *Clase principal
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        HiloT primero = new HiloT("Primer hilo");
        primero.start();
        
        new HiloT("Segundo hilo").start();
        new Thread(new HiloR(),"Tercer hilo").start();
        new Thread(new HiloR(),"Cuarto hilo").start();
       */
        
        //Actividad: Realizacion de 50 depositos y 50 retiros
        System.out.println("Actividad Práctica 12\n");
        Cuenta hilo1 =new Cuenta("Deposito 1");
        Cuenta hilo2 =new Cuenta("Deposito 2");
        Cuenta hilo3 =new Cuenta("Retiro 1");
        Cuenta hilo4 =new Cuenta("Retiro 2");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
    }
    
}
