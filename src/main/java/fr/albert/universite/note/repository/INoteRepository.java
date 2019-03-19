package fr.albert.universite.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.albert.universite.note.domaine.NoteDomaine;
import fr.albert.universite.note.domaine.NoteDomainePk;


@Repository
public interface INoteRepository  extends JpaRepository<NoteDomaine , NoteDomainePk>{

}
