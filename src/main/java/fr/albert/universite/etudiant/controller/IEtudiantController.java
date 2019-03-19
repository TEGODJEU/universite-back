package fr.albert.universite.etudiant.controller;

import java.util.List;

import fr.albert.universite.enseignant.domaine.EnseignantDomaine;
import fr.albert.universite.etudiant.domaine.EtudiantDomaine;


public interface IEtudiantController {
	public List<EtudiantDomaine> findAll();
	public EtudiantDomaine findOne(Integer id);
	public EtudiantDomaine save(EtudiantDomaine e);
	public void delete(Integer id);
	public EtudiantDomaine modifierformulaireEtudiant(EtudiantDomaine e, Integer id) ;
}
