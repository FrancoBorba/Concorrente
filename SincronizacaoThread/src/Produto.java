public class Produto implements Runnable {
   private int estoque;
   
   public Produto(int estoque){
    this.estoque = estoque;
   }

   public Produto(){}

   public void run(){
    efetuarPedido();
   }
   public synchronized void efetuarPedido(){
    try{
        if(estoque > 0){
            System.out.println("Pedido efetuado pelo cliente " + Thread.currentThread().getName());
            Thread.sleep(300);
            this.estoque--;
        } 
        else{
            System.out.println("Pedido em falta para o cliente " + Thread.currentThread().getName());
        }
    }

    catch(Exception e){
        System.out.println("ERRO");
    }
   }
}
