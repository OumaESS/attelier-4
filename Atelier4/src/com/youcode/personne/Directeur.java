package com.youcode.personne;

public class Directeur extends Chef {

	protected String societe;

    public Directeur(String n, String p, String adr, String v, int anneN, double s, String service,String Soc) {
        super(n, p, adr, v, anneN, s, service);
        this.societe=Soc;
    }
    
    public void afficher() {
        System.out.println("le nom: "+nom+" le prenom:  "+prenom+" l'adresse: "+adresse+" la ville est "+ville+" date naissance: "+anneNaissance+" et le salaire "+salaire+" service"+service+" societe "+societe);
        
    }
}
