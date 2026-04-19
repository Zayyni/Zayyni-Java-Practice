package main;

import services.FedEx;

public class Amazon
{
    public Boolean deliverProduct(Double amount)
    {
        FedEx fedEx = new FedEx();
        return fedEx.deliverProduct(amount);

    }
}
