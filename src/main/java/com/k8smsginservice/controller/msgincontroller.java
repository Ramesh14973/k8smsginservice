/**
 * 
 */
package com.k8smsginservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.k8smsginservice.service.msginservice;
import com.k8smsginservice.sysprop.msgbean;

/**
 * 
 */
@RestController
public class msgincontroller {
    private static final Logger logger = LogManager.getLogger(msgincontroller.class);

	@Autowired
	private msginservice mservice;
	
	@PostMapping("/savedata")
	public msgbean insertdata(@RequestBody msgbean mbean) {
		info(mbean.getCustid());
		mservice.insertdata(mbean);
		return mbean;
	} // end of msgbean
	
	
	private void info(String strPrint) {
		logger.info(strPrint);
	}
} // End of msgincontroller
