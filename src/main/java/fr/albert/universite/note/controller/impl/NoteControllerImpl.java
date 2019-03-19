package fr.albert.universite.note.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.albert.universite.matiere.domaine.MatiereDomaine;
import fr.albert.universite.matiere.service.impl.MatiereServiceImpl;
import fr.albert.universite.note.controller.INoteController;
import fr.albert.universite.note.domaine.NoteDomaine;
import fr.albert.universite.note.service.impl.NoteServiceImpl;


@RestController
public class NoteControllerImpl implements INoteController {

	@Autowired		
	NoteServiceImpl noteService;
	@Override
	@GetMapping("/notes")
	public List<NoteDomaine> findAllusers() {
		List<NoteDomaine> liste = noteService.findAllusers();
		return liste;
	}
	@Override
	@GetMapping("/notes/{idEtudiant}/{idMatiere}")
	public NoteDomaine findOne(
			@PathVariable Integer idEtudiant, 
			@PathVariable Integer idMatiere
			) {
		NoteDomaine n = noteService.findOne(idEtudiant, idMatiere);
		return n;
	}
	@Override
	@PostMapping("/notes")
	public NoteDomaine save(@RequestBody NoteDomaine note) {
		NoteDomaine n = noteService.save(note);
		return n;
	}


}
