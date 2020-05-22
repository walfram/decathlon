package decathlon.solution02.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import decathlon.solution02.domain.DecathlonPeformance;
import decathlon.solution02.domain.DecathlonScore;

@RestController
public class Decathlon02Controller {

	private final ObjectMapper mapper = new ObjectMapper();
	
	@PostMapping(path = "/decathlon02/score", produces = MediaType.APPLICATION_JSON_VALUE)
	public String calculateScore(@RequestBody String request) throws JsonMappingException, JsonProcessingException {
		JsonNode tree = mapper.readTree(request);
		
		DecathlonPeformance performance = new DecathlonPeformance(tree);
		DecathlonScore score = performance.calculateScore();
		
		return score.toJson(mapper);
	}

}
