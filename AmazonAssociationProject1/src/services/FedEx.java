package services;

public class FedEx implements IDeliveryService{
    public Boolean deliverProduct(Double amount) {
        System.out.println("Product delivered through FedEx and amount paid is : "+ amount);
        return true;
    }
}
