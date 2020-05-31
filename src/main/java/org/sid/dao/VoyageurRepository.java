package org.sid.dao;

import org.sid.web.Voyageur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin("*")
@RepositoryRestResource
public interface VoyageurRepository extends JpaRepository<Voyageur,Integer> {

}

