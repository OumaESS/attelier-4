package com.youcode.etablissement;

public class Étudiant extends Personne {
    protected String Diplome;

    public Étudiant(String n, String p, String adr, String v, int anneN,String Diplome) {
        super(n, p, adr, v, anneN);
        this.Diplome=Diplome;
    }
    
    public void ecrirePersonne() {
        System.out.println(nom+" "+prenom+" "+adresse+" "+ville+" "+anneNaissance+" "+Diplome);
        
    }
    
    @Override
    public String toString() {
        return "Étudiant [Diplome=" + Diplome + ", toString()=" + super.toString() + "]";
    }
}
