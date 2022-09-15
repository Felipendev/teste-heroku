package br.com.elo7.contraladorsondas.planeta.domain;

public enum Direcao {
	N("N"), E("E"), S("S"), W("W");
	
	private final String valorString;
	
	Direcao (String valorReal){
		valorString = valorReal;
	}
	public String getValorReal() {
        return valorString;
    }
}
