package main;

import services.BlueDart;
import services.FedEx;
import services.FirstFlight;

public class LaunchAmazon {
    public static void main(String[] args) {

        //constructor Injection
        Amazon amazon = new Amazon(new FirstFlight());
        //Injecting dependent object/dependency into target class is called dependency injection
        //If this is done through setter we call this as Setter injection
        //If this is done through constructor we call this as Constructor Injection

        // target class/Object ==> a class where service of other classes are being used
        //eg in this project : Amazon Class

        //dependent class/object ==> a class whose service is being used by target class
        // eg in this project : FedEx Class, BlueDart Class, FirstFlight Class


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
