package com.raquel.lista1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		      
        System.out.println("Cadastro de Usuario\n");

        System.out.print("Digite seu nome completo: ");
        String nome = scan.nextLine();

        System.out.print("Digite sua idade: ");
        byte idade = scan.nextByte();

        System.out.print("Digite seu peso (em kg): ");
        float peso = scan.nextFloat();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scan.nextDouble();

        System.out.print("Possui carteira de motorista? (sim/nao): ");
        String temCarteiraString = scan.next();
        boolean temCarteira = false;
        if (temCarteiraString.equalsIgnoreCase("sim")) {
            temCarteira = true;
        }

        System.out.print("Digite seu saldo bancario: ");
        long saldoBancario = scan.nextLong();

        System.out.print("Digite seu numero de celular: ");
        int numeroCelular = scan.nextInt();

        System.out.print("Digite seu endereco de email: ");
        String email = scan.next();

        System.out.println("\n\nCadastro realizado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Possui carteira de motorista? " + temCarteira);
        System.out.println("Saldo bancario: R$" + saldoBancario);
        System.out.println("Numero de celular: " + numeroCelular);
        System.out.println("Email: " + email);
        
	

	}

}
