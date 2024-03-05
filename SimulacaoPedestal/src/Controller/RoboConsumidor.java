package Controller;

import model.Pedestal;

public class RoboConsumidor implements Runnable {
     Pedestal p;

    public RoboConsumidor(Pedestal p){
        this.p = p;
    }
    public void run(){
        while(true){
            synchronized(p){

           
            while (p.livre) {
                try {
                   p.wait();
                } catch (Exception e) {
                    System.out.println("Erro na thread consumidor");
                } 
            }
            System.out.println(Thread.currentThread().getName() + " Peça retirada");
            
            p.livre = true;
            p.notifyAll();
            }
        }
    }     
}
