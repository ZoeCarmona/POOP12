package poop12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Clase cuenta
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class Cuenta extends Thread{
    private static double saldo;       

    /**
     * Se crea una cuenta son saldo 0, super invoca al método constructor de la clase superior
     * @param name 
     */
    public Cuenta(String name) {
        super(name);
        saldo = 0;
    }

    /**
     * consultaSaldo(): Consulta el saldo de la cuenta
     * @return saldo: Regresa el saldo
     */
    public static double consultaSaldo() {
        return saldo;
    }
    /**
     * depositarDinero: Deposita el dinero que se desee a la cuenta
     * @param monto Indica la cantidad de dinero a depositar
     */
    public synchronized void depositarDinero(double monto){
        saldo += monto;
        System.out.println(getName()+" depositando saldo.... \nsaldo: "+saldo);
        notifyAll();
    }
    
    /**
     * retirarDinero: Retira el dinero solicitado de la cuenta 
     * @param monto Indica la cantidad de dinero a retirar 
     */
    public synchronized void retirarDinero(double monto){
        if(saldo<=0 || monto>saldo){
            System.out.println(getName()+" debe esperar un deposito Saldo: "+saldo);
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else{
            saldo-=monto;
            System.out.println(getName()+" extrajo la cantidad: $"+monto+"\nSaldo actual: $"+saldo);
        }
        notifyAll();
    }
    
    public void run(){
        if(getName().equals("Deposito 1")||getName().equals("Deposito 2")){
            for (int i = 0; i < 25; i++) {
                this.depositarDinero(100);
        }
            
        }
        else{
            for (int i = 0; i < 25; i++) {
                this.retirarDinero(50);
        }
        }
            
    }
}
