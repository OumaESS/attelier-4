package com.youcode.personne;

	public class Personne {
	    protected String nom;
	    protected String prenom;
	    protected String adresse;
	    protected String ville;
	    protected int anneNaissance;
	    
	    public Personne(String n,String p,String adr,String v,int anneN) {
	        this.nom=n;
	        this.prenom=p;
	        this.adresse=adr;
	        this.ville=v;
	        this.anneNaissance=anneN;
	    }
	    
	    public void afficher() {
	        System.out.println("le nom: "+nom+" le prenom:  "+prenom+" l'adresse: "+adresse+" la ville est "+ville+" date naissance: "+anneNaissance);
	        
	    }

}
