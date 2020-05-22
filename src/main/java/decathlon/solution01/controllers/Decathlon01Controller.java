package decathlon.solution01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import decathlon.solution01.beans.DecathlonResults;
import decathlon.solution01.beans.DecathlonScore;
import decathlon.solution01.services.DecathlonService;

@RestController
public class Decathlon01Controller {

	@Autowired
	private DecathlonService service;

	@PostMapping("/decathlon01/score")
	public DecathlonScore calculateScore(@RequestBody DecathlonResults results) {
		int calculateScore = service.calculateScore(results);

		DecathlonScore score = new DecathlonScore();

		score.setScore(calculateScore);

		return score;
	}

}
