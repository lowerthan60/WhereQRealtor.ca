package com.whereq.realtor.batch;

import java.util.Arrays;
import java.util.UUID;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.persist.ListingPO;
import com.whereq.realtor.batch.persist.Repository;

@Component(value="runner")
public class Runner {

	@Inject
	private Repository repository;
	
	public void run(){
		final ListingPO entity1 = new ListingPO(UUID.randomUUID().toString());
		final ListingPO entity2 = new ListingPO(UUID.randomUUID().toString());
		repository.save(Arrays.asList(entity1,entity2));
	}
	
}
