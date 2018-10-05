package fr.meg.project.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(propOrder = {"civ","nom","prenom","adr_11","adr_12","adr_13","cp","ville","releve"})
public class Client {
	
	private Integer num ;
	private Integer agence ; 
	private Integer civ ;
	private String nom ; 
	private String prenom ; 
	private String adr_11 ; 
	private String adr_12 ;
	private String adr_13;
	private String cp ; 
	private String ville ; 
	private List<Entree> entree = new ArrayList<>() ;
	
	public Integer getNum() {
		return num;
	}
	@XmlAttribute
	public void setNum(Integer id) {
		this.num = id;
	}
	public Integer getAgence() {
		return agence;
	}
	
	@XmlAttribute
	public void setAgence(Integer idAgency) {
		this.agence = idAgency;
	}
	public Integer getCiv() {
		return civ;
	}
	
	@XmlElement
	public void setCiv(Integer civility) {
		this.civ = civility;
	}
	public String getNom() {
		return nom;
	}
	
	@XmlElement
	public void setNom(String familyName) {
		this.nom = familyName;
	}
	public String getPrenom() {
		return prenom;
	}
	@XmlElement
	public void setPrenom(String firstName) {
		this.prenom = firstName;
	}
	public String getAdr_11() {
		return adr_11;
	}
	
	@XmlElement
	public void setAdr_11(String mainAdress) {
		this.adr_11 = mainAdress;
	}
	public String getAdr_12() {
		return adr_12;
	}
	
	@XmlElement
	public void setAdr_12(String complementAdress1) {
		this.adr_12 = complementAdress1;
	}
	public String getAdr_13() {
		return adr_13;
	}
	
	@XmlElement
	public void setAdr_13(String complementAdress2) {
		this.adr_13 = complementAdress2;
	}
	public String getCp() {
		return cp;
	}
	
	@XmlElement
	public void setCp(String postalCode) {
		cp = postalCode;
	}
	public String getVille() {
		return ville;
	}
	
	@XmlElement
	public void setVille(String city) {
		this.ville = city;
	}
	
	public List<Entree> getReleve() {
		return entree;
	}
	
	@XmlElementWrapper(name = "releve")
	@XmlElement(name="entree")
	public void setReleve(List<Entree> accountStat) {
		this.entree = accountStat;
	} 
	
	
	

}
