public class MinhaThread extends Thread {
    // criando threads extendeno a classe Thread
    public void run(){
       
        String name = Thread.currentThread().getName(); // pega o nome da thread alocada e salva em name
        System.out.println("Rodando thread: " + name);
        for(int i = 0 ; i < 10; i++){
            System.out.println(name + ": " + i);
            // passando o controle para outra Thread implicitamente
            //Thread.yield();
            if(i % 2 == 0){
                try {
                    Thread.sleep(2000); // precisa ser dentro de um try/ catch
                    // A Thread dorme 2 segundo a cada 2 contagens
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                } 
                
            }

        }
        System.out.println(name + " Fim" );

    }// codigo didatico para visualização do funcionamento de Threads
}
