package main;

import services.FedEx;

public class LaunchAmazon {
    public static void main(String[] args) {

        Amazon amazon = new Amazon();
//        FedEx fedEx = new FedEx();
//        amazon.setService(fedEx);
        amazon.setService(new FedEx());




        Boolean status = amazon.deliverProduct(200.9);
        if (status){
            System.out.println("Product delivered Successfully");
        }else {
            System.out.println("Product not delivered Successfully");
        }
    }
}
