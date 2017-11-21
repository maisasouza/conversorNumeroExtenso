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
			int semCentena = (centena > 0) ? d.intValue() - (centena*100) : 0;
			int dezena =  (centena > 0) ? (d.intValue() - (centena*100))/10 : d.intValue()/10;
			int unidade = (d.intValue() - (centena*100) - (dezena*10));
			
			if(centena >= 1){
				retorno += arrCentena[centena-1];
			}
			if(centena >= 1 && (dezena >= 1 || unidade > 0)) {
				retorno += " e ";
			}
			if(dezena >= 1){
				if(semCentena <= 19 || semCentena >= 10){
					retorno += arrPrimeiraDezena[semCentena - 10];
					return retorno;
				} else {
					retorno += arrDezena[dezena - 2];
				}
			}
			if(dezena > 1 && unidade > 0)
				retorno += " e ";
			if(unidade > 0)
				retorno += arrUnidades[unidade];
						
			return retorno;
		}
	}

}
