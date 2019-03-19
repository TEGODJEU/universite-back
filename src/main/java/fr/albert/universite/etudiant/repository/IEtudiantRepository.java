package fr.albert.universite.etudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.albert.universite.etudiant.domaine.EtudiantDomaine;



@Repository
public interface IEtudiantRepository

extends JpaRepository<EtudiantDomaine , Integer> {

}
