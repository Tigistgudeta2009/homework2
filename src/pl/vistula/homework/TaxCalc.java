package pl.vistula.homework;

import java.math.BigDecimal;

public class TaxCalc {
    public static void main(String[] args) {
        double PriceWithoutVat = 12.99;

        System.out.println("Price without VAT:"+PriceWithoutVat);

        double PriceWithVat= PriceWithoutVat * 1.43;
        System.out.println("Price with VAT:"+ PriceWithVat);

        double ValueWithVat=PriceWithVat*10000;
        System.out.println("Value with VAT:"+ ValueWithVat);

        double PriceWithoutVat2= ValueWithVat/1.43;
        System.out.println("Value without VAT:"+PriceWithoutVat2);


        //USING THE BIG DECIMAL CLASS

        System.out.println("");
        System.out.println("same thing after using big  decimal:");

        BigDecimal dbPriceWithoutVat= new BigDecimal("12.99");
        System.out.println("Price wtihout VAT:"+ dbPriceWithoutVat);

        BigDecimal dbPriceWithVat= dbPriceWithoutVat.multiply(new BigDecimal("1.43"));

        dbPriceWithVat =dbPriceWithVat.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        System.out.println("price with vat rounded:" +dbPriceWithVat);

        BigDecimal dbValueWithVat = dbPriceWithVat.multiply(new BigDecimal(10000));
        System.out.println("value with VAT:"+ dbValueWithVat);

        BigDecimal dbPriceWithoutVat2= dbPriceWithVat.divide(new BigDecimal("1.43"),BigDecimal.ROUND_HALF_EVEN);
        System.out.println("value without VAT:"+dbPriceWithoutVat2);


    }
}
