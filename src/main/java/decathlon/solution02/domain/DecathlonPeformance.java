package decathlon.solution02.domain;

import com.fasterxml.jackson.databind.JsonNode;

import decathlon.common.DecathlonEvent;

public final class DecathlonPeformance {

	private final JsonNode tree;

	public DecathlonPeformance(JsonNode tree) {
		this.tree = tree;
	}

	public DecathlonScore calculateScore() {
		// @formatter:off
		return new DecathlonScore(
			new TrackEvent(tree.get("result100m").doubleValue(), DecathlonEvent.Event100m),
			new FieldEvent(tree.get("resultLongJump").doubleValue(), DecathlonEvent.EventLongJump),
			new FieldEvent(tree.get("resultShotPut").doubleValue(), DecathlonEvent.EventShotPut),
			new FieldEvent(tree.get("resultHighJump").doubleValue(), DecathlonEvent.EventHighJump),
			new TrackEvent(tree.get("result400m").doubleValue(),  DecathlonEvent.Event400m),
			new TrackEvent(tree.get("result110m").doubleValue(), DecathlonEvent.Event110m ),
			new FieldEvent(tree.get("resultDiscThrow").doubleValue(), DecathlonEvent.EventDiscusThrow),
			new FieldEvent(tree.get("resultPoleVault").doubleValue(), DecathlonEvent.EventPoleVault),
			new FieldEvent(tree.get("resultJavelinThrow").doubleValue(), DecathlonEvent.EventJavelinThrow),
			new TrackEvent(tree.get("result1500m").doubleValue(), DecathlonEvent.Event1500m)
		);
		// @formatter:on
	}

}
