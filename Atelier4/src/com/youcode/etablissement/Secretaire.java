package com.youcode.etablissement;

public class Secretaire extends Personne {

    protected int numeroBureau;
    public Secretaire(String n, String p, String adr, String v, int anneN,int NB) {
        super(n, p, adr, v, anneN);
        this.numeroBureau=NB;
    }
    

    public void ecrirePersonne() {
        System.out.println(nom+" "+prenom+" "+adresse+" "+ville+" "+anneNaissance+" "+numeroBureau);
        
    }


    
    @Override
    public String toString() {
        return "Secretaire [numeroBureau=" + numeroBureau + ", toString()=" + super.toString() + "]";
    }
}
