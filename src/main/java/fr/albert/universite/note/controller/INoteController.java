package fr.albert.universite.note.controller;

import java.util.List;

import fr.albert.universite.note.domaine.NoteDomaine;

public interface INoteController {
	public List<NoteDomaine> findAllusers();
	public NoteDomaine findOne(Integer idEtudiant,Integer idMatiere);
	public NoteDomaine save(NoteDomaine note);
}
