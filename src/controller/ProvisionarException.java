package controller;

/**
 * Classe de exceção criada para tratar erros de entrada do usuário.
 * 
 * @author gustavosotnas
 */
public class ProvisionarException extends IllegalArgumentException {

	private String msg;
	private int cause;

	public ProvisionarException() {
		super("Opção inválida");
	}

	public ProvisionarException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public ProvisionarException(String msg, int cause) {
		super(msg, new Throwable(""+cause));
	}
	
	public ProvisionarException(String msg, String cause) {
		super(msg, new Throwable(cause));
	}
}
