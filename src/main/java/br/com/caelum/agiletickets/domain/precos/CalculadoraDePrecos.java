package br.com.caelum.agiletickets.domain.precos;

import java.math.BigDecimal;

import br.com.caelum.agiletickets.models.Sessao;
import br.com.caelum.agiletickets.models.TipoDeEspetaculo;

public class CalculadoraDePrecos {

	public static BigDecimal calcula(Sessao sessao, Integer quantidade) {
		BigDecimal preco;
		TipoDeEspetaculo espetaculo = getEspetaculo(sessao);
		
		if(verificaSeEspetaculoEhOEsperado(sessao, TipoDeEspetaculo.CINEMA) || verificaSeEspetaculoEhOEsperado(sessao, TipoDeEspetaculo.SHOW)) {
			//quando estiver acabando os ingressos... 
			preco = definePreco(sessao);
		} else if(verificaSeEspetaculoEhOEsperado(sessao, TipoDeEspetaculo.BALLET)) {
			preco = definePreco(sessao);
		} else if(verificaSeEspetaculoEhOEsperado(sessao, TipoDeEspetaculo.ORQUESTRA)) {
			preco = definePreco(sessao);
		}  else {
			//nao aplica aumento para teatro (quem vai é pobretão)
			preco = sessao.getPreco();
		} 

		return preco.multiply(BigDecimal.valueOf(quantidade));
	}

	private static boolean verificaSeEspetaculoEhOEsperado(Sessao sessao, TipoDeEspetaculo tipo) {
		return getEspetaculo(sessao).equals(tipo);
	}
	
	private static TipoDeEspetaculo getEspetaculo(Sessao sessao) {
		
		return sessao.getEspetaculo().getTipo();
	}

	private static BigDecimal definePreco(Sessao sessao) {
		BigDecimal preco;
		
		double ingressosDisponiveis = (sessao.getTotalIngressos() - sessao.getIngressosReservados()) / sessao.getTotalIngressos().doubleValue();
		double ingressosParaVirarLote = getEspetaculo(sessao).ingressosParaVirarLote();
		if( ingressosDisponiveis <= ingressosParaVirarLote ) { 
			preco = sessao.getPreco().add(sessao.getPreco().multiply(BigDecimal.valueOf(getEspetaculo(sessao).porcentagemDeAumento())));
		} else {
			preco = sessao.getPreco();
		}
		if (verificaSeEspetaculoEhOEsperado(sessao, TipoDeEspetaculo.BALLET) || verificaSeEspetaculoEhOEsperado(sessao, TipoDeEspetaculo.ORQUESTRA)) {
			if(sessao.getDuracaoEmMinutos() > 60 ){
				preco = preco.add(sessao.getPreco().multiply(BigDecimal.valueOf(0.10)));
			}	
		}

		return preco;
	}

}