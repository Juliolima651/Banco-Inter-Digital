package enums;

public enum TipoCliente {
	cliente("Cliente Pessoa Fisica"),
	cliente2("Cliente Pessoa Juridica");
	
	private String tipoCliente;

	private TipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}
