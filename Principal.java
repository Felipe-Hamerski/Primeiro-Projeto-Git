public class Principal {
	public static void main(String[] args) {
		try {
		int a=5, b=0;
		double resultado;
			resultado = a/b;
			System.out.println("O resultado da divisão foi de: "+resultado);
			
		}catch (ArithmeticException e) {
			System.out.println("O sistema não pode dividir por 0");
		}
	}
}