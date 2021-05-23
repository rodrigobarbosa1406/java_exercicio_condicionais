import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual exercício você quer ver? ");
		int exercicio = sc.nextInt();

		switch (exercicio) {
		case 1:
			exercicio01();
			break;
		
		case 2:
			exercicio02();
			break;
			
		case 3:
			exercicio03();
			break;
		
		case 4:
			exercicio04();
			break;
			
		case 5:
			exercicio05();
			break;
			
		case 6:
			exercicio06();
			break;
			
		case 7:
			exercicio07();
			break;
			
		case 8:
			exercicio08();
			break;
		}
		
		sc.close();
	}

	public static void exercicio01() {
		Scanner sc = new Scanner(System.in);
		
		int valorA = sc.nextInt();

		if (valorA > 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

	public static void exercicio02() {
		Scanner sc = new Scanner(System.in);
		
		int valorB = sc.nextInt();

		if (valorB % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

	public static void exercicio03() {
		Scanner sc = new Scanner(System.in);
		
		int valorC = sc.nextInt();
		int valorD = sc.nextInt();
		double resto;

		if (valorC >= valorD) {
			resto = valorC % valorD;
		} else {
			resto = valorD % valorC;
		}

		if (resto == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

	public static void exercicio04() {
		Scanner sc = new Scanner(System.in);
		
		int valorE = sc.nextInt();
		int valorF = sc.nextInt();
		int tempo = 0;

		if (valorE < valorF) {
			tempo = valorF - valorE;
		} else if (valorE > valorF) {
			tempo = (24 - valorE) + valorF;
		} else if (valorE == valorF) {
			tempo = 24;
		}

		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		
		sc.close();
	}

	public static void exercicio05() {
		Scanner sc = new Scanner(System.in);
		
		double valorProd1 = 4.00;
		double valorProd2 = 4.50;
		double valorProd3 = 5.00;
		double valorProd4 = 2.00;
		double valorProd5 = 1.50;
		double valorProd = 0.00;

		int codProd = sc.nextInt();
		int qtdeProd = sc.nextInt();

		if (codProd == 1) {
			valorProd = valorProd1 * qtdeProd;
		} else if (codProd == 2) {
			valorProd = valorProd2 * qtdeProd;
		} else if (codProd == 3) {
			valorProd = valorProd3 * qtdeProd;
		} else if (codProd == 4) {
			valorProd = valorProd4 * qtdeProd;
		} else if (codProd == 5) {
			valorProd = valorProd5 * qtdeProd;
		}

		System.out.printf("Total: R$ %.2f\n", valorProd);
		
		sc.close();
	}

	public static void exercicio06() {
		Scanner sc = new Scanner(System.in);
		
		double valorG = sc.nextDouble();
		String intervalo = "";

		if (valorG >= 0.00 && valorG <= 25.00) {
			intervalo = "[0,25]";
		} else if (valorG >= 25.01 && valorG <= 50.00) {
			intervalo = "[25,50]";
		} else if (valorG >= 50.01 && valorG <= 75.00) {
			intervalo = "[50,75]";
		} else if (valorG >= 75.01 && valorG <= 100.00) {
			intervalo = "[75,100]";
		} else {
			intervalo = "fora";
		}

		if (intervalo == "fora") {
			System.out.println("Fora de intervalo");
		} else {
			System.out.println("Intervalo " + intervalo);
		}
		
		sc.close();
	}

	public static void exercicio07() {
		Scanner sc = new Scanner(System.in);
		
		double valorX = sc.nextDouble();
		double valorY = sc.nextDouble();
		String saida = "";

		if (valorX == 0 && valorY == 0) {
			saida = "Origem";
		} else if (valorX == 0) {
			saida = "Eixo Y";
		} else if (valorY == 0) {
			saida = "Eixo X";
		} else {
			if (valorX > 0 && valorY > 0) {
				saida = "Q1";
			} else if (valorX < 0 && valorY > 0) {
				saida = "Q2";
			} else if (valorX < 0 && valorY < 0) {
				saida = "Q3";
			} else if (valorX > 0 && valorY < 0) {
				saida = "Q4";
			}
		}

		System.out.println(saida);
		
		sc.close();
	}

	public static void exercicio08() {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double baseImposto = 0;
		double aliqFaixa2 = 8;
		double aliqFaixa3 = 18;
		double aliqFaixa4 = 28;
		double imposto = 0;

		if (salario > 2000.01) {
			// Deduz da base a faixa isenta
			baseImposto = salario - 2000;

			if (baseImposto > 999.99) {
				imposto = 999.99 * (aliqFaixa2 / 100);
				baseImposto = baseImposto - 999.99;
			} else {
				imposto = baseImposto * (aliqFaixa2 / 100);
			}
		}

		if (salario > 3000.01) {
			if (baseImposto > 1499.99) {
				imposto += 1499.99 * (aliqFaixa3 / 100);
				baseImposto = baseImposto - 1499.99;
			} else {
				imposto += baseImposto * (aliqFaixa3 / 100);
			}
		}

		if (salario > 4500.00) {
			imposto += baseImposto * (aliqFaixa4 / 100);
		}

		if (imposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f\n", imposto);
		}
		
		sc.close();
	}

}
