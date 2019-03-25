package com.paramati.citiesautocompleteservice.service;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.paramati.citiesautocompleteservice.repository.CityRepository;

@Service("cityservice")
public class CityServiceImpl  implements CityServiceI{

	public static final Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);
	@Autowired
	private CityRepository CityRepository;
	public String getCities(String prefix,Integer atmost) {
		logger.info("[start:"+prefix+",atmost:"+atmost+"CityServiceImpl getCities method started");
		List<String> cities = CityRepository.fetchCitiesByPrefix(prefix,new PageRequest(0, atmost));
		logger.info("[start:"+prefix+",atmost:"+atmost+"CityServiceImpl getCities method ended");
		return getCitiesInString(cities);
	}
	
	private String  getCitiesInString(List<String> cities) {
		logger.info("[cities:"+cities+"CityServiceImpl getCitiesInString method started");
		StringBuffer result = new StringBuffer();
		for(String city : cities) {
			result.append(city+ "\n");
		}
		logger.info("[cities:"+cities+"CityServiceImpl getCitiesInString method started");
		return result.toString();
	}
	
	
	
	
	

}
