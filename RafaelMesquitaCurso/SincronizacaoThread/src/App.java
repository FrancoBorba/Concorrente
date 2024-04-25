public class App  {
    public static void main(String[] args) throws Exception {
       Produto produto = new Produto(5); // estabelecendo 5 produtos em estoques
       Thread thread[] = new Thread[15]; // criando um vetor de Threads

       for(int i=0 ; i < thread.length ; i++){
        thread[i] = new Thread(produto);
        thread[i].setName("Cliente: " + i);
        thread[i].start();
       }
    }
}
