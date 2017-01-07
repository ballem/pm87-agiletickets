package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public enum TipoDeEspetaculo {

	CINEMA {

		@Override
		double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		BigDecimal porcentagemIngressosDisponiveis() {
			// TODO Auto-generated method stub
			return null;
		}
		porcentagemIngressosDisponiveis = 0.05;
		
	}, SHOW {
		double porcentagemIngressosDisponiveis = 0.05;

		@Override
		double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		BigDecimal porcentagemIngressosDisponiveis() {
			// TODO Auto-generated method stub
			return null;
		}
	}, TEATRO {
		double porcentagemIngressosDisponiveis = 0.5;

		@Override
		double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		BigDecimal porcentagemIngressosDisponiveis() {
			// TODO Auto-generated method stub
			return null;
		}
	}, BALLET {
		double porcentagemIngressosDisponiveis = 0.5;

		@Override
		double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		BigDecimal porcentagemIngressosDisponiveis() {
			// TODO Auto-generated method stub
			return null;
		}
	}, ORQUESTRA {
		double porcentagemIngressosDisponiveis = 0.5;

		@Override
		double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		BigDecimal porcentagemIngressosDisponiveis() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	abstract double ingressosParaVirarLote();
	abstract BigDecimal porcentagemIngressosDisponiveis();
}
