package com.youcode.etablissement;

public class Enseignant extends Personne {

    protected String Specialite;
    public Enseignant(String n, String p, String adr, String v, int anneN,String Sp) {
        super(n, p, adr, v, anneN);
        this.Specialite=Sp;
    }
    
    public void ecrirePersonne() {
        System.out.println(nom+" "+prenom+" "+adresse+" "+ville+" "+anneNaissance+" "+Specialite);
        
    }
    
    @Override
    public String toString() {
        return "Enseignant [Specialite=" + Specialite + ", toString()=" + super.toString() + "]";
    }
}
