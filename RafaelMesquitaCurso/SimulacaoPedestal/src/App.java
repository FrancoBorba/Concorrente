import Controller.RoboConsumidor;
import Controller.RoboProdutor;
import model.Pedestal;

public class App {
    public static void main(String[] args) throws Exception {
        Pedestal p = new Pedestal();
       RoboProdutor roboProdutor = new RoboProdutor(p);
       RoboConsumidor roboConsumidor = new RoboConsumidor(p);

       Thread produtora = new Thread(roboProdutor);
       Thread consumidora = new Thread(roboConsumidor);

       produtora.start();
       consumidora.start();

       
    }
}
/*
 Demonstracao de wait/notify que sincronizam a
execucao verificando se o pedestal esta livre
  u ocupado.
 */