
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >=2;
		boolean acompanhado;
		
		if(quantidadePessoas >=2){ 
			acompanhado = true;
		} else {
			 acompanhado = false;
		}
		
		
		if (idade >= 18 && acompanhado) {
			System.out.println("voncê tem mais de 18 anos");
			System.out.println("seja em vindo!");
			System.out.println("O valor de acompanhado é = " + acompanhado);

			} else {
				System.out.println("infelimente voce não pode entrar");

			}
		}
	}