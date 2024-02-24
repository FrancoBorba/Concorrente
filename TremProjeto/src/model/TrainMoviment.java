package model;

public class TrainMoviment {


    public void trainMoviment(Train train){
        switch (train.getOpcao()) {
            case 0:{
                movimentPosisition0(train);
                break;
            }
            case 1:{
                movimentPosisition1(train);
                break;
            }
            case 2:{
                movimentPosisition2(train);
                break;
            }
            case 3:{
                movimentPosisition3(train);
            }

            default:
                break;
        }
    }


    public void movimentPosisition0(Train train){
        
        if((train.getImageView().getLayoutY() <= 400) && (train.getImageView().getLayoutY() >= 333)){
             train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
             train.getImageView().setRotate(20);      
        } else if( (train.getImageView().getLayoutY() <= 333) && (train.getImageView().getLayoutY() > 305)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() + train.getVelocidadeX());
            train.getImageView().setRotate(15);
        } else if((train.getImageView().getLayoutY() <= 305) && (train.getImageView().getLayoutY() > 240)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() + train.getVelocidadeX());
            train.getImageView().setRotate(35);
        } else if((train.getImageView().getLayoutY() <= 240) && (train.getImageView().getLayoutY() > 138 )){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
            train.getImageView().setRotate(-10);
        } else if((train.getImageView().getLayoutY() <= 138) && (train.getImageView().getLayoutY() > 51 )){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() - train.getVelocidadeX());
            train.getImageView().setRotate(-25);
        }else if((train.getImageView().getLayoutY() <= 51) && (train.getImageView().getLayoutY() >= 0)){
            train.getImageView().setRotate(0);
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
        } else if( (train.getImageView().getLayoutY() <= 0) && (train.getImageView().getLayoutY() > -100) ){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
        } else{
            train.getImageView().setLayoutX(378);
               train.getImageView().setLayoutY(370);
        }       
    }
    public void movimentPosisition1(Train train){
        if((train.getImageView().getLayoutY() <= 400) && ( train.getImageView().getLayoutY() >= 311)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
            train.getImageView().setRotate(-25);
        } else if((train.getImageView().getLayoutY() <= 311) && ( train.getImageView().getLayoutY() >= 220)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() - train.getVelocidadeX());
        } else if((train.getImageView().getLayoutY() <= 220) && (train.getImageView().getLayoutY() >=135)){
           train.getImageView().setRotate(10);
           train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
        } else if((train.getImageView().getLayoutY() <= 135) && (train.getImageView().getLayoutY() >= 60)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() + train.getVelocidadeX());
            train.getImageView().setRotate(20);
        } else if((train.getImageView().getLayoutY() <= 60) && (train.getImageView().getLayoutY() >= 0)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
            train.getImageView().setRotate(-8);
        } else if((train.getImageView().getLayoutY() <= 0) && (train.getImageView().getLayoutY() >= -100)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() - train.getVelocidadeY());
        } else{
            train.getImageView().setLayoutX(489);
                train.getImageView().setLayoutY(370);
                train.getImageView().setRotate(-15);
        }    
}
    public void movimentPosisition2(Train train){
        if ((train.getImageView().getLayoutY() <= 30) && (train.getImageView().getLayoutY() > -100)) {
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
        } else if((train.getImageView().getLayoutY() <= 67) && (train.getImageView().getLayoutY() > 30)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() + train.getVelocidadeX());
            train.getImageView().setRotate(140);
        } else if((train.getImageView().getLayoutY() <= 133) && (train.getImageView().getLayoutY() >= 67)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() + train.getVelocidadeX());
            train.getImageView().setRotate(180);
        } else if((train.getImageView().getLayoutY() <= 220) && (train.getImageView().getLayoutY() >= 133)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
            train.getImageView().setRotate(215);
        } else if((train.getImageView().getLayoutY() <= 315 ) && (train.getImageView().getLayoutY() >= 220)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() - train.getVelocidadeX());
            train.getImageView().setRotate(190);
        } else if((train.getImageView().getLayoutY() <= 400) && (train.getImageView().getLayoutY() >= 315)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
        } else {
            train.getImageView().setLayoutX(377);
            train.getImageView().setLayoutY(-30);
        }

    }
    public void movimentPosisition3(Train train){
        if ((train.getImageView().getLayoutY() <= 25) && (train.getImageView().getLayoutY() > -100)) {
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
            train.getImageView().setRotate(200);
        } else if((train.getImageView().getLayoutY() <= 110 ) && (train.getImageView().getLayoutY() >= 25)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() - train.getVelocidadeX());
            train.getImageView().setRotate(190);
        } else if((train.getImageView().getLayoutY() <= 145 ) && (train.getImageView().getLayoutY() >= 110)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
        } else if((train.getImageView().getLayoutY() <= 155 ) && (train.getImageView().getLayoutY() >= 145)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() - train.getVelocidadeX());
            train.getImageView().setRotate(170);
        } else if((train.getImageView().getLayoutY() <= 213 ) && (train.getImageView().getLayoutY() >= 155)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
           train.getImageView().setRotate(155);
        } else if((train.getImageView().getLayoutY() <= 303 ) && (train.getImageView().getLayoutY() >= 213)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
            train.getImageView().setLayoutX(train.getImageView().getLayoutX() + train.getVelocidadeX());
        } else if( (train.getImageView().getLayoutY() <= 400 ) && (train.getImageView().getLayoutY() >= 303)){
            train.getImageView().setLayoutY(train.getImageView().getLayoutY() + train.getVelocidadeY());
            train.getImageView().setRotate(165);
        } else {
            train.getImageView().setLayoutX(482);
            train.getImageView().setLayoutY(-30);
        }
    }

    public void checkColision(Train train1 , Train train2){
        
    }








}
