package main;

import services.BlueDart;
import services.FedEx;
import services.FirstFlight;

public class LaunchAmazon {
    public static void main(String[] args) {

        //constructor Injection
        Amazon amazon = new Amazon(new FirstFlight());
//        FedEx fedEx = new FedEx();
//        amazon.setService(fedEx);
        //setter Injection
//        amazon.setService(new BlueDart());
//       amazon.setService(new FedEx());
//        amazon.setService(new FirstFlight());




        Boolean status = amazon.deliverProduct(200.9);
        if (status){
            System.out.println("Product delivered Successfully");
        }else {
            System.out.println("Product not delivered Successfully");
        }
    }
}
