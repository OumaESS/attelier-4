package com.youcode.article;

public class ArticleEnSolde extends Article {


	public ArticleEnSolde() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticleEnSolde(String nom, double prix) {
		super(nom, prix);
		// TODO Auto-generated constructor stub
	}

	public double prixApreRemise(int PourcantageRemise) {
		double MontantRemise = getPrix() * PourcantageRemise / 100;
		double prixApresRemise = getPrix() - MontantRemise;
		return prixApresRemise;
	}

	public void afficher() {
		System.out.println("le prix Aprés remise " + prixApreRemise(2) + " DH");
	}
}
