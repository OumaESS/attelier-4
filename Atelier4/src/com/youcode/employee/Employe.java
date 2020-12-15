package com.youcode.employee;

import java.util.Calendar;

public class Employe {

	private String nom;
	private String prenom;
	private String adress;
	private int anneeNaissance;
	Calendar calendar = Calendar.getInstance();
	private int anneeEncours = calendar.get(Calendar.YEAR);
	int age;

	public Employe(String nm, String pre, String adr, int annNai) {

		this.nom = nm;
		this.prenom = pre;
		this.adress = adr;
		this.anneeNaissance = annNai;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public int getAnneeEncours() {
		return anneeEncours;
	}

	public void setAnneeEncours(int anneeEncours) {
		this.anneeEncours = anneeEncours;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int calculaterAge() {
		age = anneeEncours - anneeNaissance;
		return age;
	}

	public void afficherInfosClient() {
		System.out.println(nom + " né le " + anneeNaissance + " habitant à " + adress + " age " + calculaterAge());
	}
}
