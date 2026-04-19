package main;

import services.FedEx;
import services.IDeliveryService;

public class Amazon
{

    private IDeliveryService service;

    public Amazon(IDeliveryService service){
        this.service = service;

    }

    public void setService(IDeliveryService service) //IDeliveryService service = new FedEx();
    {
        this.service = service;
    }
    public Boolean deliverProduct(Double amount)
    {
//        FedEx fedEx = new FedEx();
        return service.deliverProduct(amount);

    }
}
