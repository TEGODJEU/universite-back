package fr.albert.universite.etudiant.controller.impl;

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

import fr.albert.universite.enseignant.domaine.EnseignantDomaine;
import fr.albert.universite.etudiant.controller.IEtudiantController;
import fr.albert.universite.etudiant.domaine.EtudiantDomaine;
import fr.albert.universite.etudiant.service.impl.EtudiantServiceImpl;

@RestController
public class EtudiantControllerImpl implements IEtudiantController{
       
	Logger log = LoggerFactory.getLogger(EtudiantControllerImpl.class);
	@Autowired
     EtudiantServiceImpl etudiantService;

	@Override
	@GetMapping("/etudiants")
	public List<EtudiantDomaine> findAll() {
		List<EtudiantDomaine> liste = etudiantService.findAllusers();
		
		log.info("nombre etudiants:{}", liste.size());
		return liste;
	}

	@Override
	@GetMapping("/etudiants/{id}")
	public EtudiantDomaine findOne(@PathVariable Integer id) {
		EtudiantDomaine e  = etudiantService.getOne(id);
		
		
		return e;
	}

	@Override
	@PostMapping("/etudiants")
	public EtudiantDomaine save(@RequestBody EtudiantDomaine e) {
		
		EtudiantDomaine en = etudiantService.ajouterEtudiant(e);
		
		return en;
	}

	@Override
	@DeleteMapping("/etudiants/{id}")
	public void delete(@PathVariable Integer id) {
		etudiantService.supprimerEtudiant(id);
		
	}

	@Override
	 
		@PutMapping("/etudiants/{id}")
		public EtudiantDomaine modifierformulaireEtudiant 

		(@RequestBody EtudiantDomaine e,
				@PathVariable Integer id)
		{
			e.setId(id);

			EtudiantDomaine et = etudiantService.modifierformulaireEtudiant(e);
			return et;
	}

	
	

	
		
	}


	
