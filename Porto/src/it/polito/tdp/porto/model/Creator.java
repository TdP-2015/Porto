package it.polito.tdp.porto.model;

import java.util.HashSet;
import java.util.Set;

public class Creator {

	private int idCreator ;
	private String familyName ;
	private String givenName ;
	
	private Set<Article> articles ;
	
	
	public Creator(int idCreator, String familyName, String givenName) {
		super();
		this.idCreator = idCreator;
		this.familyName = familyName;
		this.givenName = givenName;
		
		this.articles = new HashSet<Article>() ;
	}


	public int getIdCreator() {
		return idCreator;
	}


	public void setIdCreator(int idCreator) {
		this.idCreator = idCreator;
	}


	public String getFamilyName() {
		return familyName;
	}


	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}


	public String getGivenName() {
		return givenName;
	}


	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}


	public Set<Article> getArticles() {
		return articles;
	}
	
	public void addArticle(Article a) {
		this.articles.add(a) ;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCreator;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creator other = (Creator) obj;
		if (idCreator != other.idCreator)
			return false;
		return true;
	}
	
	
	
}
