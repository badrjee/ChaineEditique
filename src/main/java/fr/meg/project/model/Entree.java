package fr.meg.project.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class Entree {
	
	private String type ;
	private double montant ; 
	private String date ; 
	private String description ;
	private double soldeAncien ; 
	private double soldeActuel ; 
	
	public double getSoldeAncien() {
		return soldeAncien;
	}

	@XmlElement
	public void setSoldeAncien(double soldeAncien) {
		this.soldeAncien = soldeAncien;
	}

	public double getSoldeActuel() {
		return soldeActuel;
	}

	@XmlElement
	public void setSoldeActuel(double soldeActuel) {
		this.soldeActuel = soldeActuel;
	}

	public String getType() {
		return type;
	}
	
	@XmlAttribute
	public void setType(String transactionType) {
		this.type = transactionType;
	}
	public double getMontant() {
		return montant;
	}
	@XmlAttribute
	public void setMontant(double transactionAmount) {
		this.montant = transactionAmount;
	}
	public String getDate() {
		return date;
	}
	
	@XmlAttribute
	public void setDate(String transactionDate) {
		this.date = transactionDate;
	}
	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String transactionDescription) {
		this.description = transactionDescription;
	} 

}
