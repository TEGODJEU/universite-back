package fr.albert.universite.enseignant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.albert.universite.enseignant.domaine.EnseignantDomaine;


@Repository
public interface IEnseignantRepository

extends JpaRepository<EnseignantDomaine , Integer> {
}
