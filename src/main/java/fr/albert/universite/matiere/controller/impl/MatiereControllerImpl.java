package fr.albert.universite.matiere.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import fr.albert.universite.matiere.controller.IMatiereController;
import fr.albert.universite.matiere.domaine.MatiereDomaine;
import fr.albert.universite.matiere.service.impl.MatiereServiceImpl;


@RestController
public class MatiereControllerImpl implements IMatiereController{
	
	Logger log = LoggerFactory.getLogger(MatiereControllerImpl.class);
	@Autowired		
	MatiereServiceImpl matieresService;
	
	@Override
	@GetMapping("/matieres")
	public List<MatiereDomaine> findAll() {
		List<MatiereDomaine> liste = matieresService.findAllusers();
		
		return liste;
	}

	@Override
	@GetMapping("/matieres/{id}")
	public MatiereDomaine findOne(@PathVariable Integer id) {
		MatiereDomaine m = matieresService.getOne(id);
		return m;
	}

	@Override
	@PostMapping("/matieres")
	public MatiereDomaine save(@RequestBody MatiereDomaine m) {
       MatiereDomaine ma = matieresService.ajouterMatiere(m);
		return ma;
	}

}
