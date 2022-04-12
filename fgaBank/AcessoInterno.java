package fgaBank;

public interface AcessoInterno {
	
	//Os m�todos n�o tem comportamento(corpo), s� assinatura.
	
	/**
	 * 
	 * @param usuario = informar um usua�rio v�lido
	 * @param senha = informar uma senha v�lida com at� 255 caracteres alfanum�ricos
	 * @return retorna vdd quando a senha estiver correta
	 */
	public boolean autenticar(String usuario, String senha);
	public boolean alterarSenha(String senha, String senhaNova);
	public boolean alterarUsuario(String usuario, String novoUsuario);

}
