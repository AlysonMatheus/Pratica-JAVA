package javacore.Classesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner{
      public void printOuterClassAttribute(){
          System.out.println(name);
          System.out.println(OuterClassesTest01.this);
          System.out.println(this);
      }
    }

    public static void main(String[] args) {
       OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
       Inner inner2 = new OuterClassesTest01().new Inner();
      inner.printOuterClassAttribute();
       inner2.printOuterClassAttribute();

    }

}
