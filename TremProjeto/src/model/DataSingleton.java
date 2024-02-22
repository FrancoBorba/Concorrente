package model;

public class DataSingleton {
    private static final DataSingleton instance = new DataSingleton();
    private int opcao;

    DataSingleton(){};
    
    public static DataSingleton getInstance() {
        return instance;
    }

    public void setOpcao(int opcao){
        this.opcao = opcao;
    }
    public int getOpcao(){
        return opcao;
    }

    
}
