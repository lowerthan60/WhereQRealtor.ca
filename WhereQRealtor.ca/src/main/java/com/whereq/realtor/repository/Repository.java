package com.whereq.realtor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.persist.ListingPO;

/**
 *
 * @author bacon
 */
@Component
public interface Repository extends JpaRepository<ListingPO, Long> {
	
	
}
