package program;

/*
beecrowd | 1144 - Sequência Lógica

Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão
apresentadas na execução do programa, seguindo a lógica do exemplo abaixo.
Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d\n%d %d %d\n",i, i*i, i*i*i, i, (i*i)+1, (i*i*i)+1);
		}
		sc.close();
	}
}
