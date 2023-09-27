
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);

		String mensagem = autenticou ? "Pode entrar no sistema!" : "Não pode entrar no sistema!";
		System.out.println(mensagem);
	}

}
