package decathlon.solution01.services;

import org.springframework.stereotype.Component;

import decathlon.common.DecathlonEvent;
import decathlon.solution01.beans.DecathlonResults;

@Component
public class DecathlonService {

	public int calculateScore(DecathlonResults results) {
		int score = 0;

		score += trackPoints(results.getResult100m(), DecathlonEvent.Event100m);
		score += fieldPoints(results.getResultLongJump(), DecathlonEvent.EventLongJump);
		score += fieldPoints(results.getResultShotPut(), DecathlonEvent.EventShotPut);
		score += fieldPoints(results.getResultHighJump(), DecathlonEvent.EventHighJump);
		score += trackPoints(results.getResult400m(), DecathlonEvent.Event400m);

		score += trackPoints(results.getResult110m(), DecathlonEvent.Event110m);
		score += fieldPoints(results.getResultDiscThrow(), DecathlonEvent.EventDiscusThrow);
		score += fieldPoints(results.getResultPoleVault(), DecathlonEvent.EventPoleVault);
		score += fieldPoints(results.getResultJavelinThrow(), DecathlonEvent.EventJavelinThrow);
		score += trackPoints(results.getResult1500m(), DecathlonEvent.Event1500m);

		return score;
	}

	int fieldPoints(double result, DecathlonEvent event) {
		double score = event.a * (Math.pow((result - event.b), event.c));
		return (int) score;
	}

	int trackPoints(double result, DecathlonEvent event) {
		double score = event.a * (Math.pow((event.b - result), event.c));
		return (int) score;
	}

}
