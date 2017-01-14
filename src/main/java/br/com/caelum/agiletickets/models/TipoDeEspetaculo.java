package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public enum TipoDeEspetaculo {

	CINEMA {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0.05;
		}
		
	}, SHOW {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0.05;
		}
	}, TEATRO {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0;
		}
	}, BALLET {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0.5;
		}
	}, ORQUESTRA {

		@Override
		public double ingressosParaVirarLote() {
			// TODO Auto-generated method stub
			return 0.5;
		}
	};
	
	public abstract double ingressosParaVirarLote();
}
