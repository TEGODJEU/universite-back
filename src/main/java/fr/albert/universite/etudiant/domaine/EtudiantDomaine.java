package fr.albert.universite.etudiant.domaine;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.albert.universite.note.domaine.NoteDomaine;
    

@Entity
@Table (name = "t_etudiant")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EtudiantDomaine implements Serializable {

	
	

		/**
	 * 
	 */
	private static final long serialVersionUID = 4875252433028440296L;

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="Id")
		private Integer id;
		
		@Column(name="numero_etudiant")
		private Integer numero;
		
		@Column(name="nom")
		private String nom;
		
		@Column(name="prenom")
		private String prenom;
	
		@Column(name="date_naissance")
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date dateNaissance;
		
		@Column(name="sexe")
		private Character sexe;
		
		@Column(name="photo")
		private String photo;
		@JsonIgnore
		@OneToMany(mappedBy="etudiant")
		private List<NoteDomaine> notes;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getNumero() {
			return numero;
		}

		public void setNumero(Integer numero) {
			this.numero = numero;
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

		public Date getDateNaissance() {
			return dateNaissance;
		}

		public void setDateNaissance(Date dateNaissance) {
			this.dateNaissance = dateNaissance;
		}

		public Character getSexe() {
			return sexe;
		}

		public void setSexe(Character sexe) {
			this.sexe = sexe;
		}

		public String getPhoto() {
			return photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}

		public List<NoteDomaine> getNotes() {
			return notes;
		}

		public void setNotes(List<NoteDomaine> notes) {
			this.notes = notes;
		}
	
}
