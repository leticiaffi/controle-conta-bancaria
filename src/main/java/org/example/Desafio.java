package org.example;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Letícia Israel";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao =0;

        System.out.println("************************");
        System.out.println("\nNome do cliente : " +nome);
        System.out.println("Tipo da conta : " +tipoConta);
        System.out.println("O saldo atual é : " +saldo);
        System.out.println("\n************************");

        String menu = """
                ** Digite sua opção**
                1- Consultar valor
                2- Transferir valor
                3- Receber valor
                4- Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
         System.out.println(menu);
         opcao = leitura.nextInt();

         if (opcao == 1) {
             System.out.println("O saldo atualizado é : " + saldo);

         } else if (opcao == 2) {
             System.out.println("Qual valor que deseja transferir? " );
             double valor = leitura.nextDouble();
             if (valor > saldo){
                 System.out.println("O saldo é menor que o valor a ser transferido : ");
             } else {
                 saldo = saldo - valor;
                 System.out.println("Novo saldo : " + saldo);

             }
         } else if (opcao == 3) {
             System.out.println("Valor recebido: ");
             double valor = leitura.nextDouble();
             saldo = saldo + valor;
             System.out.println("Novo saldo : " + saldo);
         } else if (opcao != 4) {
             System.out.println("Essa opção é inválida! : ");
             
         }
        }
    }
}
