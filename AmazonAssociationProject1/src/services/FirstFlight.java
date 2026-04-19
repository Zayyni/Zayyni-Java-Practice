package services;

public class FirstFlight implements IDeliveryService{

    public Boolean deliverProduct(Double amount) {
        System.out.println("Product delivered through First flight and amount paid is : "+ amount);
        return true;
    }
}
