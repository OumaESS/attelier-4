package com.youcode.biblio;

import java.util.ArrayList;



/**
 * �	Bibliotheque est caract�ris�e par un ensemble d�ouvrages, o� chaque ouvrage est pr�sent en un seul exemplaire et un ensemble d�abonn�s.
Cette classe doit offrir les m�thodes suivantes :
o	ajoutOuvrage : qui permet d�ajouter un ouvrage dans la Liste, s�il n�existe pas d�j� (la comparaison doit se faire sur le titre)
o	getOuvrage : qui prend comme param�tre un titre et retourne l�ouvrage correspondant.
o	ajoutAbonne : qui permet d�ajouter un abonn�, s�il n�existe pas
o	getAbonne : qui prend comme param�tre un num�ro d�identit� et retourne l�abonn� correspondant

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

