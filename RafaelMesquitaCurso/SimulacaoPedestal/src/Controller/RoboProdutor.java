package Controller;

import model.Pedestal;

public class RoboProdutor implements Runnable {
   Pedestal p;
   public RoboProdutor(Pedestal p){
    this.p = p;
   }
   public void run(){
    while (true) {
        synchronized(p){
            while (!p.livre) {
                try {
                   p.wait();
                } catch (Exception e) {
                   System.out.println("Erro na thread produtor");
                }
            }
           
            System.out.println(Thread.currentThread().getName() + " Peça colocada");
            p.livre = false;
            p.notifyAll();
        }
    }
   }

   
}
