package it.polito.tdp.porto.model;

import java.util.List;

public class Model {
	
	private List<Article> articles ;
	private List<Creator> creators ;

	public loadPorto() {
		
		PortoDAO dao = new PortoDAO() ;
		
		// carico tutti articoli ed autori
		// in modalità LAZY
		this.articles = dao.readAllArticles() ;
		this.creators = dao.readAllCreators() ;
		
		.....
		.....
		interroga il database (dao) e completa tutte le 
		relazioni Article.creators e Creator.articles
		.....
		
	}
}
