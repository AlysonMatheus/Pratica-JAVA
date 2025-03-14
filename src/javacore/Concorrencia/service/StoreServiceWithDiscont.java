package javacore.Concorrencia.service;

import javacore.Concorrencia.dominio.Discount;
import javacore.Concorrencia.dominio.Quote;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscont {


    public String getPriceSynsc(String Storename) {
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
                ];
        return String.format(Locale.US,"%s:%.2f:%s",Storename,price, discountCode);
    }


public String applyDiscount (Quote quote){
        delay();
        double discountValue = quote.getPrice()* 100 - quote.getDiscountCode().getPercentage()/100;
        return String.format("'%s' original price: '%.2f'.Apllying discount code '%s'. Final price: '%2f'",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discountValue);
}
    private double priceGenerator() {

        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }



    private void delay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(200,500);
            TimeUnit.SECONDS.sleep(milli);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
