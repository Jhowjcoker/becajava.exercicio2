import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		/*Rejuste salarial:
		Fa�a um algoritmo que calcule o reajuste de um sal�rio.
 		O usu�rio dever� informar o sal�rio e o percentual de reajuste para a realiza��o do c�lculo.*/
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