package javacore.Formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumeroFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefaullt = Locale.getDefault();
        Locale localeBR= new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;

        NumberFormat [] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);

      double valor = 10_000.3130;
      for (NumberFormat numberFormat :nfa){
          System.out.println(numberFormat.format(valor));
      }

    }
}
