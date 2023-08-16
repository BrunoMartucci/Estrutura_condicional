import java.util.Locale;
import java.util.Scanner;


public class exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		System.out.printf("Nota final é: %.1f%n", notaFinal );
		
		if (notaFinal < 60 ) {
			System.out.println("Aluno Reprovado");
		}else {
			System.out.println("Aluno Aprovado");
		}
		sc.close();
	}

}
