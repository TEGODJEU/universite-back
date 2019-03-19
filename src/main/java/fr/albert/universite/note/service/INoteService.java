package fr.albert.universite.note.service;

import java.util.List;

import fr.albert.universite.note.domaine.NoteDomaine;

public interface INoteService {
	public List<NoteDomaine> findAllusers();
	public NoteDomaine save(NoteDomaine note);
	public NoteDomaine findOne(Integer idEtudiant, Integer idMatiere);
}
