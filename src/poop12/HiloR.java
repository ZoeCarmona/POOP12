package poop12;

/**
 *Clase HiloR
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class HiloR implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+(i+1)+ " de "+Thread.currentThread().getName());
        }
        System.out.println("Termina el "+ Thread.currentThread().getName());
    }
}
