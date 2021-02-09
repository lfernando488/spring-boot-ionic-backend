package com.ajaxdev.cursomc.domain.enums;

public enum EstadoPagamento {
	PENDENTE (1, "Pendente"),
	QUITADO (2, "Quitado"),
	CANCELADO (3 , "Cancelado");
	
	private int codigo;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao){
		this.codigo = cod;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}	
	
	public static EstadoPagamento toEnum(Integer cod) throws IllegalAccessException{
		if(cod == null) {
			return null;
		}
		for(EstadoPagamento x : EstadoPagamento.values()){
			if(cod.equals(x.getCodigo())){
				return x;
			}
		}
		
		throw new IllegalAccessException("Id inválido:" + cod);
	}
	
}