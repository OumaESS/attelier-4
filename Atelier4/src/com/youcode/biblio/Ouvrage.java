package com.youcode.biblio;

public class Ouvrage {
	
	private String titre;
    private String dateCreation;
    private boolean index;
    
    public Ouvrage(String t,String date,boolean index) {
        this.titre=t;
        this.dateCreation=date;
        this.index=index;
        
    }
    
    
    public String getTitre() {
        return titre;
    }
    
    public void setTitre(String titre) {
        this.titre=titre;
    }
    
    public String getDate() {
        return dateCreation;
    }
    
    public void setDate(String date) {
        this.dateCreation=date;
    }
    
    public boolean getIndex() {
        return index;
    }
    
    public void setIndex(boolean index) {
        this.index=index;
    }
    
    public void afficher() {
        System.out.printf("le titre de ce ouvrage est :"+titre+" la date de creation est :"+dateCreation+"  la disponibilité "+index);
    }


}
