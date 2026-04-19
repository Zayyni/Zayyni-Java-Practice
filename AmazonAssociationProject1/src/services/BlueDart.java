package services;

public class BlueDart implements IDeliveryService{
    public Boolean deliverProduct(Double amount) {
        System.out.println("Product delivered through Blue Dart and amount paid is : "+ amount);
        return true;
    }
}
