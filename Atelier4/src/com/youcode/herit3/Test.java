package com.youcode.herit3;


public class Test {
	public static void main(String[] args) {
		Epargne a = new Epargne();
		
		a.setNumeroDeCompte(1234564537456786L);
		a.setSolde(100);
		
		a.affiche();
		a.ajouter(2000);
		a.retire(1000);
		a.calculer(0.1);
		
	}
}
