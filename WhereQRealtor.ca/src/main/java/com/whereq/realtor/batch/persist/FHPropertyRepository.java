package com.whereq.realtor.batch.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author bacon
 */
@Component
public interface FHPropertyRepository extends JpaRepository<FH_PropertyPO, Long> {
	
	
}
