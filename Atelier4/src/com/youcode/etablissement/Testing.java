package com.youcode.etablissement;

public class Testing {

	   public static void main(String[] args) {
	        Secretaire S1=new Secretaire("ESSAFIR","Oumaima", "nouveau lotissement", "youssoufia", 1997, 123);
	        System.out.println(S1.toString());
	        S1.modifiePersonne("mamam", "safi");
	        S1.ecrirePersonne();
	        
	        Enseignant E1=new Enseignant("ens1", "ensprenom", "hhhh", "fes", 1979, "physique");
	        System.out.println(E1.toString());
	        E1.modifiePersonne("quartier","casablanca");
	        E1.ecrirePersonne();
	        
	        Étudiant et1=new Étudiant("et1","etPrenom", "hhkkk", "marrekch", 1998, "developpement informatique");
	        et1.modifiePersonne("nouveau", "berrechide");
	        et1.ecrirePersonne();
	        System.out.println(et1.toString());

	    }
}
