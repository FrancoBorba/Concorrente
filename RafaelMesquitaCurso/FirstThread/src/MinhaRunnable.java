public class MinhaRunnable implements Runnable{
    // criando threads através da implementação da interface Runnable
    @Override
    public void run() {
       System.out.println("Executando runnable");
    }

}