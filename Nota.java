import java.util.Scanner;

class Nota{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		float nota1, nota2,nota_final;
		String nome;

		System.out.println("digite o nome do aluno:");
	    nome = sc.next();
	    System.out.println("agora digite a primeira nota:");
	    nota1 = sc.nextFloat();
	    System.out.println("agora digite a segunda:");
	    nota2 = sc.nextFloat();
	    nota_final = nota1 * 40/100 + nota2 * 60/100;

	    System.out.println("nome do aluno:"+ nome);
	    System.out.println("nota final:"+ nota_final);
	}
}