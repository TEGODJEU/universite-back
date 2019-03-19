package fr.albert.universite.matiere.controller;

import java.util.List;

import fr.albert.universite.matiere.domaine.MatiereDomaine;

public interface IMatiereController {
	public List<MatiereDomaine> findAll();
	public MatiereDomaine findOne(Integer id);
	public MatiereDomaine save(MatiereDomaine m);
}
