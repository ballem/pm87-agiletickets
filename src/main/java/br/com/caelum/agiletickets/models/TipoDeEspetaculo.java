package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public enum TipoDeEspetaculo {

	CINEMA {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0.05;
		}

		@Override
		public double porcentagemDeAumento() {
			// TODO Auto-generated method stub
			return 0.1;
		}
		
	}, SHOW {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0.05;
		}

		@Override
		public double porcentagemDeAumento() {
			// TODO Auto-generated method stub
			return 0.1;
		}
	}, TEATRO {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double porcentagemDeAumento() {
			// TODO Auto-generated method stub
			return 0;
		}
	}, BALLET {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0.5;
		}

		@Override
		public double porcentagemDeAumento() {
			// TODO Auto-generated method stub
			return 0.2;
		}
	}, ORQUESTRA {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0.5;
		}

		@Override
		public double porcentagemDeAumento() {
			// TODO Auto-generated method stub
			return 0.2;
		}
	};
	
	public abstract double ingressosParaVirarLote();
	public abstract double porcentagemDeAumento();
}
