package vetores;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a data (dd/mm/YYYY): ");
		String data = entrada.next();
		
		String replaceData = data.replace("/", "");
		
		if (data.length() < 10 || !data.contains("/") || replaceData.toUpperCase().matches("[A-Z]*")) {
			System.out.println("Data Inválida");
		} else {
			String vetor[] = {replaceData.substring(0, 2), replaceData.substring(2, 4), replaceData.substring(4, 8)};
			System.out.println("\nDia: " + vetor[0]);
			System.out.println("Mês: " + vetor[1]);
			System.out.println("Ano: " + vetor[2]);
		}
		
		entrada.close();
	}

}
