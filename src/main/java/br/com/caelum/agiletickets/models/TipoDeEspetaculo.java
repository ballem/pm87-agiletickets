package br.com.caelum.agiletickets.models;

public enum TipoDeEspetaculo {
	
	CINEMA {
		double porcentagemIngressosDisponiveis = 0.05;
		
	}, SHOW {
		double porcentagemIngressosDisponiveis = 0.05;
	}, TEATRO {
		double porcentagemIngressosDisponiveis = 0.5;
	}, BALLET {
		double porcentagemIngressosDisponiveis = 0.5;
	}, ORQUESTRA {
		double porcentagemIngressosDisponiveis = 0.5;
	};
	
	
	
}
