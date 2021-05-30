import java.util.ArrayList;
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    int quant;
    int num1 = 1, num2 = 0;

    ArrayList<Integer> fibonacci = new ArrayList<>();
    fibonacci.add(0);
    fibonacci.add(1);

    System.out.print("Digite a quantidade de elementos para a sequência: ");
    quant = ent.nextInt();
    quant = quant - 2;

    for (int i = 0; i < quant; i++) {
      num1 = num1 + num2;
      num2 = num1 - num2;
      fibonacci.add(num1);
    }
    System.out.print("Sequência de Fibonacci: ");
    for (int i = 0; i < fibonacci.size(); i++) {
      System.out.print(fibonacci.get(i) + " ");
    }
  }
}
