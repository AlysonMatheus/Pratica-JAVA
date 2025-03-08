package javacore.PadroesDeProjetos.Test;

import javacore.PadroesDeProjetos.dominio.Country;
import javacore.PadroesDeProjetos.dominio.Currency;
import javacore.PadroesDeProjetos.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
        System.out.println(currency.getSymbol());
    }
}
