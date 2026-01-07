package locadora.controller;

import locadora.model.Filme;

public class FilmeController {
	
	
	public boolean  cadastrarFilmes(String titulo, String genero, String sinopse, Integer duracao) {
		
		if(titulo != null && titulo.length()>0 && genero != null && genero.length()>0 && sinopse != null && sinopse.length()>0 && duracao != null && duracao >0) {
			
			Filme filme = new Filme(titulo, genero, sinopse,duracao);
			filme.cadastrarFilme(filme);
			return true;
			
		}
		return false;
	}
	 

}
