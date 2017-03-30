package com.whereq.realtor.batch.persist;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author bacon
 */
@Component
public interface Repository<T extends Serializable, ID extends Serializable> extends JpaRepository<T, Long> {
	
	
}
