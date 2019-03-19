package fr.albert.universite.matiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.albert.universite.matiere.domaine.MatiereDomaine;

public interface IMatiereRepository 
	extends JpaRepository<MatiereDomaine , Integer> {

	
}
