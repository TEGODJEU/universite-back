package fr.albert.universite.enseignant.service;

import java.util.List;


import fr.albert.universite.enseignant.domaine.EnseignantDomaine;




public interface IEnseignantService {
	public List<EnseignantDomaine> findAllusers();
	public EnseignantDomaine getOne(Integer id) ;
	public EnseignantDomaine ajouterEnseignant(EnseignantDomaine e) ;
	public EnseignantDomaine modifierformulaireEnseignant(EnseignantDomaine e) ;
	public void supprimerEnseignant(Integer id);
}
