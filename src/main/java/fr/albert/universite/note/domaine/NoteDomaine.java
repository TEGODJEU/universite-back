package fr.albert.universite.note.domaine;



import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import fr.albert.universite.etudiant.domaine.EtudiantDomaine;
import fr.albert.universite.matiere.domaine.MatiereDomaine;

@Entity
@Table (name = "t_note")

public class NoteDomaine implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1533237740309678185L;

	@EmbeddedId
	private  NoteDomainePk notePk;
	
	@Column(name= "note")
	private Double note;
	
	@ManyToOne
	@JoinColumn(name="ID_ETUDIANT", insertable=false, updatable=false)
	private EtudiantDomaine etudiant;
	
	@ManyToOne
	@JoinColumn(name="ID_MATIERE", insertable=false, updatable=false)
	private MatiereDomaine matiere;

	public NoteDomainePk getNotePk() {
		return notePk;
	}

	public void setNotePk(NoteDomainePk notePk) {
		this.notePk = notePk;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public EtudiantDomaine getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(EtudiantDomaine etudiant) {
		this.etudiant = etudiant;
	}

	public MatiereDomaine getMatiere() {
		return matiere;
	}

	public void setMatiere(MatiereDomaine matiere) {
		this.matiere = matiere;
	}

	
	

	
	
}
