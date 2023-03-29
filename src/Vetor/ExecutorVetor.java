package Vetor;

import java.util.Scanner;

public class ExecutorVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacidade, aux;

        System.out.println("Informe a capacidade do Vetor: ");
        capacidade = scanner.nextInt();
        Vetor vetor = new Vetor(capacidade);
        System.out.println("Verificando se o Vetor está vazio:");
        System.out.println(vetor.vazio());
        System.out.println(vetor.cheio());
        System.out.println("Informe um indice do vetor para saber seu valor:");
        /*aux = scanner.nextInt();
        aux = vetor.buscaElemento(aux);
        System.out.println(aux);*/
        System.out.println(vetor.buscaElemento(scanner.nextInt()));
    }
}