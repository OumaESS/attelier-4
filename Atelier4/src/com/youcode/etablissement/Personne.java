package com.youcode.etablissement;

public abstract class Personne {
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
    
    
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville
                + ", anneNaissance=" + anneNaissance + "]";
    }
    
    public void modifiePersonne(String adr,String v) {
        this.adresse=adr;
        this.ville=v;
        
    }
    
    public abstract void ecrirePersonne();


}


