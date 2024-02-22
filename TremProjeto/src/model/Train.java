package model;

import javafx.scene.image.ImageView;

public class Train {
    
    private ImageView imageView;
    private int opcao; // determina as posições iniciais do trem
    private double velocidadeX;
    private double velocidadeY;

    public Train(ImageView imageView , int opcao){
        this.imageView = imageView;
        this.opcao = opcao;
        switch (opcao) {
             case 0:{
                imageView.setLayoutX(378);
                imageView.setLayoutY(339);
                imageView.setRotate(15);
                break;
            }
            case 1:{
                imageView.setLayoutX(489);
                imageView.setLayoutY(339);
                imageView.setRotate(-15);
                break;
            }
                
           case 2:{
                imageView.setLayoutX(379);
                imageView.setLayoutY(-16);
                imageView.setRotate(180);
                break;
            }
            case 3:{
                imageView.setLayoutX(482);
                imageView.setLayoutY(-16);
                imageView.setRotate(180);
            }

            default:
                break;
        }

    }

    public int getOpcao(){
        return opcao;
    }
    public void setVelocidadeX(double velocidadeX){
        this.velocidadeX = velocidadeX;
    }
    public double getVelocidadeX(){
        return velocidadeX;
    }
    public void setVelocidadeY(double velocidadeY){
        this.velocidadeY = velocidadeY;
    }
    public double getVelocidadeY(){
        return velocidadeY;
    }
    public ImageView getImageView(){
        return imageView;
    }
    public void setImageView(ImageView imageView){
        this.imageView = imageView;
    }


}
