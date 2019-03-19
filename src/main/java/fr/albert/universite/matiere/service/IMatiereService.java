package fr.albert.universite.matiere.service;

import java.util.List;



import fr.albert.universite.matiere.domaine.MatiereDomaine;

public interface IMatiereService {
	public List<MatiereDomaine> findAllusers();
	public MatiereDomaine getOne(Integer id) ;
	public MatiereDomaine ajouterMatiere(MatiereDomaine m) ;
	public MatiereDomaine modifierMatiere(MatiereDomaine m);
	
	
}
