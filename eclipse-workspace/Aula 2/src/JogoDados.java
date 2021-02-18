import java.util.Random;

public class JogoDados {

	public static void main(String[] args) {

		int jogador1 = 0, jogador2 = 0, rodada1 = 0, rodada2 = 0, dado1, dado2, somadados;

		while (rodada1 < 5) {

			Random gerador1 = new Random();
			Random gerador2 = new Random();
			dado1 = gerador1.nextInt(6) + 1;
			dado2 = gerador2.nextInt(6) + 1;
			somadados = dado1 + dado2;
			if (somadados == 7) {
				jogador1++;
			}

			rodada1++;
		}
		System.out.println("O Jogador A fez " + jogador1 + " pontos.");

		while (rodada2 < 5) {

			Random gerador1 = new Random();
			Random gerador2 = new Random();
			dado1 = gerador1.nextInt(6) + 1;
			dado2 = gerador2.nextInt(6) + 1;
			somadados = dado1 + dado2;
			if (somadados == 7) {
				jogador2++;

			}

			rodada2++;
		}
		System.out.println("O Jogador B fez " + jogador2 + " pontos.");
		if (jogador1 > jogador2) {
			System.out.println("O Jogador A venceu a Partida");

		}
		else {
		if (jogador1 == jogador2) {
			System.out.println("a Partida acabou empatada");
		}

		else {
			System.out.println("O Jogador B venceu a Partida");
		}

	}}
}