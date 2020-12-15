package com.youcode.biblio;

public class Video extends Ouvrage {
    private String editeur;
    private double duree;
        
    public Video(String t, String date, boolean index,String editeur,double duree) {
        super(t, date, index);
        this.editeur=editeur;
        this.duree=duree;
    }
    
    
    public String getEditeur() {
        return editeur;
    }
    
    public void setEditeur(String edit) {
        this.editeur=edit;
    }
    
    public double getDuree() {
        return duree;
    }
    public void  setDuree(double duree) {
        this.duree=duree;
    }
    
    public void afficher() {
        System.out.printf("le titre de ce ouvrage est :"+getTitre()+" la date de creation est :"+getDate()+"  la disponibilité "+getIndex()+" l'editeur est "+editeur+" la duree est "+duree);
    }

    

}
