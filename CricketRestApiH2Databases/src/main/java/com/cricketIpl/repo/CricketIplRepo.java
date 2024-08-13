package com.cricketIpl.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import com.cricketIpl.enetites.CircketIplEntity;


/**
 * @author Raquif Roshan
 *
 */
@RepositoryRestController(path = "circketipl")
public interface CricketIplRepo extends JpaRepository<CircketIplEntity, Integer>{

}
