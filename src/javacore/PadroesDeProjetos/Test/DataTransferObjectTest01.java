package javacore.PadroesDeProjetos.Test;

import javacore.PadroesDeProjetos.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRASIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder().firstName("Alyson").lastName("Matheus").build();


        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder().aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName()).build();

        System.out.println(reportDto);
    }
}
