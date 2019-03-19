package fr.albert.universite.etudiant.service;

import java.util.List;


import fr.albert.universite.etudiant.domaine.EtudiantDomaine;



public interface IEtudiantService {
	public List<EtudiantDomaine> findAllusers();
	public EtudiantDomaine getOne(Integer id) ;
	public EtudiantDomaine ajouterEtudiant(EtudiantDomaine e) ;
	public EtudiantDomaine modifierformulaireEtudiant(EtudiantDomaine e) ;
	public void supprimerEtudiant(Integer id);
}
