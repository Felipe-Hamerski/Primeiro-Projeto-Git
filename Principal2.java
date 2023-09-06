import java.util.*;

public class Principal2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		double media;
		
		try {
		System.out.println("Digite dois valores");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		media = n1/n2;
		System.out.println("A média foi de: "+media);
		
		}catch (InputMismatchException | ArithmeticException e) {
			System.out.println("Colocastes o valor com o tipo errado ou "
					+ "tentastes fazer uma operação impossível");
		}
	}
}