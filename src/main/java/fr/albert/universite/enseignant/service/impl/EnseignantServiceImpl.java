package fr.albert.universite.enseignant.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.albert.universite.enseignant.controller.impl.EnseignantControllerImpl;
import fr.albert.universite.enseignant.domaine.EnseignantDomaine;
import fr.albert.universite.enseignant.repository.IEnseignantRepository;
import fr.albert.universite.enseignant.service.IEnseignantService;


@Service
public class EnseignantServiceImpl implements IEnseignantService{


	Logger log = LoggerFactory.getLogger(EnseignantControllerImpl.class);

	@Autowired
	IEnseignantRepository enseignantRepository;

	@Override
	public List<EnseignantDomaine> findAllusers() {


		List<EnseignantDomaine> listeEnseignant = enseignantRepository.findAll();
		//verifier pour chaque enseignant
		//si l 'enseignant ne possede pas d image, on lui donne l image par defaut
		//https://https://https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Milla2008cropped.jpg/1200px-Milla2008cropped.jpg

		for (int i = 0; i <listeEnseignant.size(); i++) {;
		EnseignantDomaine e = listeEnseignant.get(i);
		log.info("Image de l 'enseignant: {}", e.getPhoto());
		if (e.getPhoto() == null || e.getPhoto().equals("")) {
			listeEnseignant.get(i).setPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Milla2008cropped.jpg/1200px-Milla2008cropped.jpg");
		}
		}
		return listeEnseignant;

	}

	@Override
	public EnseignantDomaine getOne(Integer id) {
		EnseignantDomaine e = enseignantRepository.getOne(id);
		if (e.getPhoto() == null || e.getPhoto().equals("")) {	
			e.setPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Milla2008cropped.jpg/1200px-Milla2008cropped.jpg");
		}
		return e;

	}

	@Override
	public EnseignantDomaine ajouterEnseignant(EnseignantDomaine e) {
		EnseignantDomaine en = enseignantRepository.save(e);
		return en;
	}

	@Override
	public EnseignantDomaine modifierformulaireEnseignant(EnseignantDomaine e) {
		EnseignantDomaine ee = enseignantRepository.save(e);
		return ee;
	}

	@Override
	public void supprimerEnseignant(Integer id) {
		enseignantRepository.deleteById(id);
		
	}
}
