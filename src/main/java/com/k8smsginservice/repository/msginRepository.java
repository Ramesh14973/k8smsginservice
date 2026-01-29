/**
 * 
 */
package com.k8smsginservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.k8smsginservice.sysprop.msgbean;



/**
 * 
 */
@Repository
public interface msginRepository extends MongoRepository<msgbean,String>{
	
	List<msgbean> findByMsginid(String msginid);
	
	List<msgbean> findByMsisdn(String msisdn);
	
} // End of msginRepository
