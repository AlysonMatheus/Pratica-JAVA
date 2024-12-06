package javacore.Wrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10l;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanp = true;


        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanw = true;

        int i =intW; //unboxing
        Integer intw2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TruE");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('D'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));



    }
}
