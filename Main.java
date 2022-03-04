public class Main {
    public static void main(String[] args) {
      NewCalculator calculator = new NewCalculator();
      // Try division
      calculator.Divide(100, 12);
      System.out.println(calculator.getLastResult());
      // Try addition
      calculator.Add(10, 35);
      System.out.println(calculator.getLastResult());
      // Try subtraction
      calculator.Subtract(50, 15);
      System.out.println(calculator.getLastResult());
      // Try Multiplication
      calculator.Multiply(10, 30);
      System.out.println(calculator.getLastResult());

    }
}
