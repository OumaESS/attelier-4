package com.youcode.herit3;

public class Epargne extends Compte{

	
	
	
	public void calculer(double intire) {
		double h = this.getSolde() - (this.getSolde()*intire);
		System.out.println("voutre nouveau solde :" + h );
	}


}
