package Exercicios;

import java.util.Scanner;
//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
public class Exercicio01 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias, totalDias;
				
		System.out.println("Digite quantos anos você tem: ");
		anos = leia.nextInt();
		System.out.println("Agora digite os meses: ");
		meses = leia.nextInt();
		System.out.println("Agora digite os dias: ");
		dias = leia.nextInt();
		
		totalDias = (anos*365)+(meses*30)+dias;
		
		System.out.println("Você tem "+ totalDias+ " Dias de vida");
	}

}
