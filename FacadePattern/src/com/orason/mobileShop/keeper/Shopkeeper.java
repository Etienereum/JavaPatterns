package com.orason.mobileShop.keeper;

import com.orason.mobileShop.phone.Blackberry;
import com.orason.mobileShop.phone.Iphone;
import com.orason.mobileShop.phone.MobileShop;
import com.orason.mobileShop.phone.Samsung;

public class Shopkeeper {

    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    public Shopkeeper(){
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }

    public void iphoneSales(){
        iphone.modelNum();
        iphone.phonePrice();
    }

    public void samsungSales(){
        samsung.modelNum();
        samsung.phonePrice();
    }

    public void blackberrySales(){
        blackberry.modelNum();
        blackberry.phonePrice();
    }
}
