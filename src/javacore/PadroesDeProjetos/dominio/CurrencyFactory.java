package javacore.PadroesDeProjetos.dominio;

public class CurrencyFactory {
    public static Currency  newCurrency(Country country){
        switch (country){
            case USA:
                return new UsDollar();
            case BRASIL:
                return new Real();
            default:throw new IllegalArgumentException("No currency found for thus country");



        }
    }

}
