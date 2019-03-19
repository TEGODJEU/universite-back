package fr.albert.universite.enseignant.controller;

import java.util.List;

import fr.albert.universite.enseignant.domaine.EnseignantDomaine;

public interface IEnseignantController {

	public List<EnseignantDomaine> findAll();
	public EnseignantDomaine findOne(Integer id);
	public EnseignantDomaine save( EnseignantDomaine  e);
	public void delete(Integer id);
	public EnseignantDomaine modifierformulaireEnseignant(EnseignantDomaine e, Integer id) ;
	}
