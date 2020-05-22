package decathlon.solution02.domain;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public final class DecathlonScore {

	private final List<CalculatedScore> events;

	public DecathlonScore(CalculatedScore... events) {
		this.events = Arrays.asList(events);
	}

	public int scoreValue() {
		return events.stream().mapToInt(event -> event.calculateScore()).sum();
	}

	public String toJson(ObjectMapper mapper) {
		ObjectNode json = mapper.createObjectNode();

		json.put("score", scoreValue());

		return json.toString();
	}

}
