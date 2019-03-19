package fr.albert.universite.note.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NoteDomainePk implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -171405353477761059L;

	@Column(name= "ID_ETUDIANT")
	private Integer etudiant;

	@Column(name= "ID_MATIERE")
	private Integer matiere;

	public Integer getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Integer etudiant) {
		this.etudiant = etudiant;
	}

	public Integer getMatiere() {
		return matiere;
	}

	public void setMatiere(Integer matiere) {
		this.matiere = matiere;
	}
}
