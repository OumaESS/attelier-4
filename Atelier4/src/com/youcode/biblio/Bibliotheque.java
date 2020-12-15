package com.youcode.biblio;

import java.util.ArrayList;



/**
 * •	Bibliotheque est caractérisée par un ensemble d’ouvrages, où chaque ouvrage est présent en un seul exemplaire et un ensemble d’abonnés.
Cette classe doit offrir les méthodes suivantes :
o	ajoutOuvrage : qui permet d’ajouter un ouvrage dans la Liste, s’il n’existe pas déjà (la comparaison doit se faire sur le titre)
o	getOuvrage : qui prend comme paramètre un titre et retourne l’ouvrage correspondant.
o	ajoutAbonne : qui permet d’ajouter un abonné, s’il n’existe pas
o	getAbonne : qui prend comme paramètre un numéro d’identité et retourne l’abonné correspondant

 * @author yc
 *
 */

public class Bibliotheque extends Ouvrage {
	
	    private ArrayList<Ouvrage> ouvrages;
	    private ArrayList<Abonne> abonnes;
		

	public Bibliotheque(String t, String date, boolean index, ArrayList<Ouvrage> Ouvrage,ArrayList<Abonne> abonne) {
		super(t, date, index);
		this.ouvrages= Ouvrage;
		this.abonnes=abonne;
	}
	

	
    public void ajoutOuvrage(Ouvrage ouvrage) {
        for (int i = 0; i < this.ouvrages.size(); i++) {
            if (ouvrages.get(i).getTitre()!= ouvrage.getTitre()) {
                this.ouvrages.add(ouvrage);
            }
            
        }
    }
    
    public Ouvrage getOuvrage(String titre) {
        Ouvrage result = null;
        for (int i = 0; i < this.ouvrages.size(); i++) {
            if (this.ouvrages.get(i).getTitre() == titre) {
                result = this.ouvrages.get(i);
                break;
            }
        }
        return result;
    }

    public void ajoutAbonne(Abonne abonne) {
        for (int i = 0; i < this.abonnes.size(); i++) {
            if(this.abonnes.get(i).getNum() != abonne.getNum()) {
                this.abonnes.add(abonne);
            } else {
                this.abonnes.remove(abonne);
            }
        }
    }

    public Abonne getAbonne(int id) {
        Abonne result = null;
        for (int i = 0; i < this.abonnes.size(); i++) {
            if (this.abonnes.get(i).getNum() == this.abonnes.get(id).getNum()) {
                result = this.abonnes.get(i);
                break;
            }
        }
        return result;
    }


}

