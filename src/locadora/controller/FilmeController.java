package locadora.controller;

import java.util.ArrayList;

import locadora.dao.ExceptionDAO;
import locadora.dao.FilmeDAO;
import locadora.model.Filme;

public class FilmeController {
	
	/*
	 * Metodo que vai cadastrar filmes e fazer uma validação dos campos. 
	 */
	public boolean  cadastrarFilmes(String titulo, String genero, String sinopse, Integer duracao) throws ExceptionDAO {
		
		if(titulo != null && titulo.length()>0 && genero != null && genero.length()>0 && sinopse != null && sinopse.length()>0 && duracao != null && duracao >0) {
			
			Filme filme = new Filme(titulo, genero, sinopse,duracao);
			filme.cadastrarFilme(filme);
			return true;
			
		}
		return false;
	}
	
	public ArrayList<Filme>listarFilmes(String nome) throws ExceptionDAO{
		return new Filme().listarFilmes(nome);
	}

}
