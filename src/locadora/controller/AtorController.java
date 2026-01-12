package locadora.controller;

import locadora.model.Ator;

public class AtorController {
	
public boolean  cadastrarAtor(String  nome,String nacionalidade){
		
		if(nome != null && nome.length()>0 && nacionalidade != null && nacionalidade.length()>0 ) {
			
			Ator ator = new Ator(nome, nacionalidade);
			ator.cadastrarAtor(ator);
			return true;
		}
		return false;
	}
	 

}
