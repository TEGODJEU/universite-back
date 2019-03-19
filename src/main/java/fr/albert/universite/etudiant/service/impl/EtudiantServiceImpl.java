package fr.albert.universite.etudiant.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.albert.universite.enseignant.domaine.EnseignantDomaine;
import fr.albert.universite.etudiant.domaine.EtudiantDomaine;
import fr.albert.universite.etudiant.repository.IEtudiantRepository;
import fr.albert.universite.etudiant.service.IEtudiantService;

@Service
public class EtudiantServiceImpl implements IEtudiantService {

	
	Logger log = LoggerFactory.getLogger(EtudiantServiceImpl.class);
	
	@Autowired
	IEtudiantRepository etudiantRepository;

	@Override
	public List<EtudiantDomaine> findAllusers() {
		
		
		List<EtudiantDomaine> listeEtudiant = etudiantRepository.findAll();
		
		
		//verifier pour chaque etudiant
		//si l 'etudiant ne possede pas d image, on lui donne l image par defaut
		//https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdF340kXdMHZBJSyaVfcWwZaoAFoc19wvFctAeE3Y1b_va7Ee_
		
		for (int i = 0; i <listeEtudiant.size(); i++) {;
		EtudiantDomaine e = listeEtudiant.get(i);
		log.info("Image de l 'etudiant: {}", e.getPhoto());
		if (e.getPhoto() == null || e.getPhoto().equals("")) {
			listeEtudiant.get(i).setPhoto("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdF340kXdMHZBJSyaVfcWwZaoAFoc19wvFctAeE3Y1b_va7Ee_");
		}
		}
		return listeEtudiant;
	}

	@Override
	public EtudiantDomaine getOne(Integer id) {
		
		EtudiantDomaine e = etudiantRepository.getOne(id);
		if (e.getPhoto() == null || e.getPhoto().equals("")) {	
		e.setPhoto("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdF340kXdMHZBJSyaVfcWwZaoAFoc19wvFctAeE3Y1b_va7Ee_");	
		}
		return e;
	}

	
	
	@Override
	public EtudiantDomaine ajouterEtudiant(EtudiantDomaine e) {
		EtudiantDomaine en = etudiantRepository.save(e);
	
		return en;
	}

	@Override
	public EtudiantDomaine modifierformulaireEtudiant(EtudiantDomaine e) {
		EtudiantDomaine et = etudiantRepository.save(e);
		return et;
		
	}

	@Override
	public void supprimerEtudiant(Integer id) {
		etudiantRepository.deleteById(id);
		
	}
}
