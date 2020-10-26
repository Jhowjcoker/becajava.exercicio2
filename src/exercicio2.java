import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		/*Rejuste salarial:
		Faça um algoritmo que calcule o reajuste de um salário.
 		O usuário deverá informar o salário e o percentual de reajuste para a realização do cálculo.*/
		Scanner scanf = new Scanner(System.in);
		float valorUsuario;
		float porcentagem;
		float reajuste;
		
		System.out.println("SALARIO: ");
		valorUsuario = scanf.nextFloat();
		
		System.out.println("REAJUSTE: ");
		porcentagem = scanf.nextFloat();
		
		reajuste =  ((valorUsuario/100)*(porcentagem))+valorUsuario;
		
		System.out.println("Aumento de $ : "+ reajuste);
		
	}

}