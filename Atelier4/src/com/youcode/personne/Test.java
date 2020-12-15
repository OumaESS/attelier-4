package com.youcode.personne;

public class Test{
	
public static void main(String[] args) {
        
        Employe em1=new Employe("nomEmplo1", "prenomEmploy1", "quartier", "youssoufia", 1979,5000);
        Employe em2=new Employe("nomEmplo2", "prenomEmploy2", "quartier", "youssoufia", 1979,5000);
        Employe em3=new Employe("nomEmplo3", "prenomEmploy3", "quartier", "youssoufia", 1979,5000);
        Employe em4=new Employe("nomEmplo4", "prenomEmploy4", "quartier", "youssoufia", 1979,5000);
        Employe em5=new Employe("nomEmplo5", "prenomEmploy5", "quartier", "youssoufia", 1979,5000);
        
        em1.afficher();
        em2.afficher();
        em3.afficher();
        em4.afficher();
        em5.afficher();
        
        Chef chef1=new Chef("nomchef1","prenomchef1", "quartier", "youssoufia", 1956, 15000, "service1");
        Chef chef2=new Chef("nomchef2","prenomchef2", "quartier", "youssoufia", 1956, 15000, "service2");
        chef1.afficher();
        chef2.afficher();
        
        Directeur D1=new Directeur("nomD1", "PrenomD1", "quartier", "youssoufia", 1976, 1800, "service1", "societe1");
        D1.afficher();
        
        
    }

}
