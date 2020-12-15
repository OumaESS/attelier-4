package com.youcode.herit3;

public class Compte {

	private long numeroDeCompte;
	private double solde;
	
	
	
	public long getNumeroDeCompte() {
		return numeroDeCompte;
	}
	public void setNumeroDeCompte(long numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	void affiche() {
		System.out.println("nemero de compte :" + numeroDeCompte );
		System.out.println("solde : " + solde);
	}
	void ajouter(double add) {
			this.solde = this.solde + add;
			System.out.println("solde : " + solde);
	}
	void retire(double moin) {
		if(this.solde > moin){
			this.solde = this.solde - moin;
			System.out.println("solde : " + solde);
		} else {
			System.out.println("Impossible, votre solde est insuffisant !");
		}
	}
	
	
	 
}
