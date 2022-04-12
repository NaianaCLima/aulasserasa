package fgaBank;

public interface AcessoInterno {
	
	//Os métodos não tem comportamento(corpo), só assinatura.
	
	/**
	 * 
	 * @param usuario = informar um usuaário válido
	 * @param senha = informar uma senha válida com até 255 caracteres alfanuméricos
	 * @return retorna vdd quando a senha estiver correta
	 */
	public boolean autenticar(String usuario, String senha);
	public boolean alterarSenha(String senha, String senhaNova);
	public boolean alterarUsuario(String usuario, String novoUsuario);

}
