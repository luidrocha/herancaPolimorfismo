package aplicacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Tercerizado;

public class CadEmpregado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Funcionario> lista = new ArrayList<>();

		System.out.println("Sistema de Pagamento");

		System.out.println("Digite o numero de Funcionarios: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print("Tercerizado (S/N) :");

			char resp = sc.next().charAt(0);

			System.out.println("Nome: ");
			String nome = sc.nextLine();
			sc.nextLine();

			System.out.println("Horas Trabalhadas: ");
			int hsTrabalhada = sc.nextInt();

			System.out.println("Valor Hora: ");
			Double valHora = sc.nextDouble();

			if (resp == 's' || resp == 'S') {

				System.out.println(" Despeza Adicional: ");

				Double valDespeza = sc.nextDouble();

				Funcionario emp = new Tercerizado(nome, hsTrabalhada, valHora, valDespeza);

				lista.add(emp);

			} else {

				Funcionario emp = new Funcionario(nome, hsTrabalhada, valHora);

				lista.add(emp);

			}

		}

		for (Funcionario f : lista) {

			System.out.println(f.toString());
			System.out.println("A receber:" + f.Pagamento());

		}

		sc.close();
	}
}