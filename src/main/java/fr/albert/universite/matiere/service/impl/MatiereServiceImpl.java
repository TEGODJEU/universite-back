package fr.albert.universite.matiere.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.albert.universite.matiere.domaine.MatiereDomaine;
import fr.albert.universite.matiere.repository.IMatiereRepository;
import fr.albert.universite.matiere.service.IMatiereService;


@Service
public class MatiereServiceImpl implements IMatiereService{

Logger log = LoggerFactory.getLogger(MatiereServiceImpl.class);
	
	@Autowired
	IMatiereRepository matieresRepository;

	
	
	
	@Override
	public List<MatiereDomaine> findAllusers() {
		List<MatiereDomaine> listeMatiere = matieresRepository.findAll();
		return listeMatiere;
	}


	@Override
	public MatiereDomaine getOne(Integer id) {
		
		MatiereDomaine m = matieresRepository.getOne(id);
		return m;

	
	}


	@Override
	public MatiereDomaine ajouterMatiere(MatiereDomaine m) {
		MatiereDomaine ma = matieresRepository.save(m);
	
		return ma;
	}


	@Override
	public MatiereDomaine modifierMatiere(MatiereDomaine m) {
		MatiereDomaine ma = matieresRepository.save(m);
		return ma;
	}


	
}
