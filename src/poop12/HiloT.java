package poop12;

/**
 *Clase HiloT
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class HiloT extends Thread{

    public HiloT(String name) {
        super(name);
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteraciòn "+(i+1)+" de"+getName());
        }
        System.out.println("Termina el "+getName());
    }
}
