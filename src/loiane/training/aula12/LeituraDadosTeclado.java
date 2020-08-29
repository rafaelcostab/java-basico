package loiane.training.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = leitor.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = leitor.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite sua idade: ");
		int idade = leitor.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Sua altura: ");
		double altura = leitor.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação");
		String nome = leitor.next();
		byte suaIdade = leitor.nextByte();
		byte quantidadeFilhos = leitor.nextByte();
		float suaAltura = leitor.nextFloat();
		boolean temBichinho = leitor.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Nome: " + nome);
		System.out.println("Sua idade: " + suaIdade);
		System.out.println("Quantidade de filhos: " + quantidadeFilhos);
		System.out.println("Altura: " + suaAltura);
		System.out.println("Tem bichinho: " + temBichinho);
		
		
		leitor.close();
	}

}
