package com.paramati.citiesautocompleteservice.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.paramati.citiesautocompleteservice.constant.CityServiceConstant;
import com.paramati.citiesautocompleteservice.service.CityServiceI;

@RestController
public class CityServiceController {

	@Autowired
	private CityServiceI cityService;
	public static final Logger logger = LoggerFactory.getLogger(CityServiceController.class);
	
	 @RequestMapping(value = "/suggest_cities", method = RequestMethod.GET ,produces = "text/plain" , headers = "Accept=*")
	 public ResponseEntity<String> getCities(@RequestParam("start") String prefix,@RequestParam("atmost") Integer atmost) {
		 logger.info("[start:"+prefix+",atmost:"+atmost+"CityServiceController getCities method started");
		 HttpHeaders httpHeaders = new HttpHeaders();
         httpHeaders.setContentType(org.springframework.http.MediaType.TEXT_PLAIN);
		 if((null == prefix  || !prefix.trim().isEmpty())||  null ==atmost || atmost<0 ) {
			 return new ResponseEntity<String>(CityServiceConstant.ERROR_REQUEST_INPUT_NOT_VALID,httpHeaders,HttpStatus.BAD_REQUEST);
		 }
         String cities= cityService.getCities(prefix,atmost);
         logger.info("[start:"+prefix+",atmost:"+atmost+"CityServiceController getCities method ended");
         return new ResponseEntity<String>(cities,httpHeaders,HttpStatus.OK);
     }
	
}
