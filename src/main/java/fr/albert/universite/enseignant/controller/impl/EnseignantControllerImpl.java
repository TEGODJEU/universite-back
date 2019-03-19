package fr.albert.universite.enseignant.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.albert.universite.enseignant.controller.IEnseignantController;
import fr.albert.universite.enseignant.domaine.EnseignantDomaine;
import fr.albert.universite.enseignant.service.impl.EnseignantServiceImpl;

@RestController
public class EnseignantControllerImpl implements IEnseignantController {


	Logger log = LoggerFactory.getLogger(EnseignantControllerImpl.class);

	@Autowired	
	EnseignantServiceImpl enseignantService;

	@Override
	@GetMapping("/enseignants")
	public List<EnseignantDomaine> findAll() {
		List<EnseignantDomaine> liste = enseignantService.findAllusers();
		log.info("nombre enseignants:{}", liste.size());
		return liste;
	}

	@Override
	@GetMapping("/enseignants/{id}")
	public EnseignantDomaine findOne(@PathVariable Integer id) {
		EnseignantDomaine e = enseignantService.getOne(id);
		return e;
	}

	@Override
	@PostMapping("/enseignants")
	public EnseignantDomaine save(@RequestBody EnseignantDomaine e) {
		EnseignantDomaine  en = enseignantService.ajouterEnseignant(e);
		return en	;
	}

	@Override
	@DeleteMapping("/enseignants/{id}")
	public void delete(@PathVariable Integer id) {
		enseignantService.supprimerEnseignant(id);

	}

	@Override
	@PutMapping("/enseignants/{id}")
	public EnseignantDomaine modifierformulaireEnseignant 

	(@RequestBody EnseignantDomaine e,
			@PathVariable Integer id)
	{
		e.setId(id);

		EnseignantDomaine en = enseignantService.modifierformulaireEnseignant(e);
		return en;

	}



}



