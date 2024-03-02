public class App {
    public static void main(String[] args) throws Exception {
        // processo para criação através do extends Thread
        MinhaThread thread1 = new MinhaThread();
        MinhaThread thread2 = new MinhaThread();
        thread1.setName(" Thread1");
        thread2.setName("\tThread2"); // o contra barra t serve para facilitar a vizualização no console
        System.out.println("------------------------------------------------------------------");
        thread1.start();
        thread2.start();
        try{
            thread1.join(); // A thread main aguarda o termino da thread 1
            thread2.join(); // A thread main aguarda o termino da thread 2
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("AS DUAS THREADS TERMINARAM");

        
        // processo para criação de thread através do implements runnable
        //MinhaRunnable minhaRunnable = new MinhaRunnable();
        //Thread thread = new Thread(minhaRunnable);
        //thread.start();

    }
}

/*
 METODOS IMPORTANTES
●run() - é o código que a thread executará.
● start() - sinaliza à JVM que a thread pode ser executada, mas saiba que essa execução
não é garantida quando esse método é chamado, e isso pode depender da JVM.
● isAlive() - volta true se a thread está sendo executada e ainda não terminou.
● sleep() - suspende a execução da thread por um tempo determinado;
● yield() - torna o estado de uma thread executável para que thread com prioridades
equivalentes possam ser processadas, isso será estudando mais adiante;
● currentThread() - é um método estático da classe Thread que volta qual a thread que
está sendo executada.
● getName() - volta o nome da Thread, você pode especificar o nome de uma Thread com
o método setName() ou na construção da mesma, pois existe os construtores
sobrecarregados.
 */
