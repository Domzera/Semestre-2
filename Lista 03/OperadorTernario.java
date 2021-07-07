  public class OperadorTernario {
      public static void main(String[] args) {
          int a = (int)(Math.random() * 100);
          int b = (int)(Math.random() * 100);

          System.out.println( a + "\n" );
          System.out.println( b + "\n" );
          System.out.println( a < b ? " A<B " : " A >= B " );
}
}
