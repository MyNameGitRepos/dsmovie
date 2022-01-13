package com.devsupapren.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupapren.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	

}
