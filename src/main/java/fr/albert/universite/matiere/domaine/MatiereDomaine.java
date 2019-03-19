package fr.albert.universite.matiere.domaine;



import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.albert.universite.enseignant.domaine.EnseignantDomaine;
import fr.albert.universite.note.domaine.NoteDomaine;

@Entity
@Table (name = "t_matiere")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MatiereDomaine implements Serializable  {

	
	

		/**
	 * 
	 */
	private static final long serialVersionUID = 6883480968221888317L;


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="ID")
		private Integer id;
		
		
		@Column(name="NUMERO_MATIERE")
		private Integer numero;
		
		
		@Column(name="NOM")
		private String nom;
		
		
		@Column(name="COEF")
		private Integer coef;
		
		@ManyToOne
		@JoinColumn(name="id_enseignant")
		private EnseignantDomaine enseignant;
        
		@OneToMany(mappedBy="matiere")
		@JsonIgnore
        private List<NoteDomaine> note;
		
		public List<NoteDomaine> getNote() {
			return note;
		}

		public void setNote(List<NoteDomaine> note) {
			this.note = note;
		}

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

		public Integer getCoef() {
			return coef;
		}

		public void setCoef(Integer coef) {
			this.coef = coef;
		}

		public EnseignantDomaine getEnseignant() {
			return enseignant;
		}

		public void setEnseignant(EnseignantDomaine enseignant) {
			this.enseignant = enseignant;
		}
		
		

		

}
