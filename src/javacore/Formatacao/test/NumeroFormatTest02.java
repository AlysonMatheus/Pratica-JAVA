package javacore.Formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumeroFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefaullt = Locale.getDefault();
        Locale localeBR= new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;

        NumberFormat [] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

      double valor = 10_000.3130;
      for (NumberFormat numberFormat :nfa){
          System.out.println(numberFormat.getMaximumFractionDigits());
          System.out.println(numberFormat.format(valor));
      }
      String valorString = "￥10,000";
      try{
          System.out.println(nfa[1].parse(valorString));

      }catch (ParseException e){
          e.printStackTrace();
      }


    }
}
