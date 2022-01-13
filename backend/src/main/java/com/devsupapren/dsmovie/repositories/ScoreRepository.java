package com.devsupapren.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupapren.dsmovie.entities.Score;
import com.devsupapren.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
	

}
