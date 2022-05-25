package com.tracert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tracert.model.Avaliation;

public interface AvaliationRepository extends JpaRepository<Avaliation, Long>{

	@Query("SELECT  a.establishment, ROUND(AVG(a.nota))  FROM Avaliation a group by a.establishment.description")
	<T> List<T> findAllAvg();
	
	
	@Query("SELECT  a.establishment, ROUND(AVG(a.nota))  FROM Avaliation a "
			+ "where a.establishment.name = :nameEstab "
			+ "group by a.establishment.name")
	<T> List<T> findByEstabAvg(@Param("nameEstab") String nameEstab);
	
	
	@Query("SELECT  a.establishment, ROUND(AVG(a.nota))  FROM Avaliation a "
			+ "group by a.establishment.name "
			+ "ORDER BY AVG(a.nota)")
	<T> List<T> findTopFiveAvg();
	
}
