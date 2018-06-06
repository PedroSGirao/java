package br.com.projeto.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int nota,nota2,nota3,media;
		
		System.out.println("digite sua nota: ");
		Scanner alfa = new Scanner(System.in);
		nota= alfa.nextInt();
		
		System.out.println("digite sua nota2: ");
		alfa = new Scanner(System.in);
		nota2= alfa.nextInt();
		
		System.out.println("digite sua nota3: ");
		alfa = new Scanner(System.in);
		nota3= alfa.nextInt();
		
		media=((nota+nota2+nota3)/3);
		
		System.out.println("Suas notas até o momento: " + nota +","+nota2+","+nota3);
		System.out.println(media);
		
		
		
			
		}
	
	}


