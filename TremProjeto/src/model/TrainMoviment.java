package model;

public class TrainMoviment {





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
}
