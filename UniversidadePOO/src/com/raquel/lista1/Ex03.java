package com.raquel.lista1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Nome do estudante: ");
        String nome = scan.nextLine();
        
        
        System.out.print("Nota 1: ");
        double n1 = scan.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = scan.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = scan.nextDouble();
        System.out.print("Nota 4: ");
        double n4 = scan.nextDouble();
        
        
        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
        
        
        System.out.printf("Media: %.1f%n", media);
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
           
            System.out.print("Nota do exame: ");
            double notaExame = scan.nextDouble();
            
            
            media = (media + notaExame) / 2;
            
            System.out.println("Aluno: " + nome);
            System.out.printf("Media final: %.1f%n", media);
            
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }

	}

}
