package com.whereq.realtor.batch;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.whereq.realtor.batch.persist.ListingPO;
import com.whereq.realtor.batch.persist.Repository;
import com.whereq.realtor.xml.bind.ListingFull;
import com.whereq.realtor.xml.bind.REProperties;
import com.whereq.realtor.xml.bind.ResidentialProperty;

@Component(value="runner")
public class Runner {

	@Inject
	private Repository repository;
	
	public void run() throws JAXBException{
		
		ListingPO listingPO = null;
		List<ListingPO> poList = Lists.newArrayList();
		JAXBContext jaxbContext = JAXBContext.newInstance(REProperties.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		REProperties reProperties = (REProperties) jaxbUnmarshaller.unmarshal( new File("c:/tmp/vow.xml") );
		
		for (ResidentialProperty residentialProperty : reProperties.getResidentialProperties()) {
			for(ListingFull listingFull : residentialProperty.getListings())
			{
				System.out.println(listingFull.getMls());
				listingPO = new ListingPO();
				listingPO.setMLS(listingFull.getMls());
				listingPO.setAddress(listingFull.getAddress());
				listingPO.setListPrice(listingFull.getListPrice());
				listingPO.setSaleLease(listingFull.getSaleLease());
				poList.add(listingPO);
				
				
			}	
		}
		
		repository.save(poList);
		
		
		
		
		
	}
	
}
