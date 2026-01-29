/**
 * 
 */
package com.k8smsginservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.k8smsginservice.repository.msginRepository;
import com.k8smsginservice.sysprop.msgbean;

/**
 * 
 */
@Service
public class msginserviceimpl implements msginservice{

	@Autowired
	msginRepository msginrep;
	
	@Override
	public msgbean insertdata(msgbean mbean) {
		
		msginrep.save(mbean);
		
		return mbean;
	}

} // End of msginserviceimpl
