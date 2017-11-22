package br.mg.puc.devops.conversorNumeroExtenso;

public class ConversorExtenso {
	
	String[] arrUnidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
	String[] arrPrimeiraDezena = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "desesseis", "desessete", "desoito", "desenove"};
	String[] arrDezena = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
	String[] arrCentena = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};

	public String converter(Double d) {
		
		// TODO Auto-generated method stub
		Integer i = d.intValue();
		String retorno = "";
		
		if(d - i > 0 || d - 999 > 0 || d < 0) {
			return "inválido";
		} else if(d.intValue() == 0){
			return "zero";
		} else if(d.intValue() == 100){
			return "cem";
		} else {
			
			int centena = d.intValue()/100;
			int dezena =  d.intValue()%100;
			int unidade = dezena%10;
			
			if(centena >= 1){
				retorno += arrCentena[centena-1];
			} if(centena >= 1 && dezena > 0) {
				retorno += " e ";
			}
			if(dezena >= 10 && dezena <= 19){
				retorno += arrPrimeiraDezena[dezena - 10];
				return retorno;
			} else if(dezena > 19) {
				retorno += arrDezena[(dezena/10) - 2];
				if(unidade > 0)
					retorno += " e ";
			}
			if(unidade > 0)
				retorno += arrUnidades[unidade];
						
			return retorno;
		}
	}

}
