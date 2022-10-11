package com.kanban.kanbantask2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface registrationrepository extends JpaRepository< registration, Integer>{
	
	

}
