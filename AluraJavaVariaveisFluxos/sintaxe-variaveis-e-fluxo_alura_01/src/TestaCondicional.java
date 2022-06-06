
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("voncê tem mais de 18 anos");
			System.out.println("seja em vindo!");
		}

		else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce não tem 18, mas pode entrar, pois está acompanhado");

			} else {
				System.out.println("infelimente voce não pode entrar");

			}
		}
	}

}
