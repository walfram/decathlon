package decathlon.solution02.domain;

import decathlon.common.DecathlonEvent;

public final class TrackEvent implements CalculatedScore {

	private final double performance;
	private final DecathlonEvent event;

	public TrackEvent(double performance, DecathlonEvent event) {
		this.performance = performance;
		this.event = event;
	}

	@Override
	public int calculateScore() {
		return (int) (event.a * (Math.pow((event.b - performance), event.c)));
	}

}
