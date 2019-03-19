package fr.albert.universite.note.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.albert.universite.note.domaine.NoteDomaine;
import fr.albert.universite.note.domaine.NoteDomainePk;
import fr.albert.universite.note.repository.INoteRepository;
import fr.albert.universite.note.service.INoteService;
@Service
public class NoteServiceImpl implements INoteService {
@Autowired
	INoteRepository noteRepository;
	
	
	@Override
	public List<NoteDomaine> findAllusers() {
		List<NoteDomaine> liste = noteRepository.findAll();
		return liste;
	
	
	}


	@Override
	public NoteDomaine save(NoteDomaine note) {
		NoteDomaine no = noteRepository.save(note);
		return no;
	}


	@Override
	public NoteDomaine findOne(Integer idEtudiant, Integer idMatiere) {
		NoteDomainePk npk = new NoteDomainePk();
		npk.setEtudiant(idEtudiant);
		npk.setMatiere(idMatiere);
		NoteDomaine no = noteRepository.getOne(npk);
		return no;
	}


	
	}


