package decathlon.common;

public enum DecathlonEvent {

	Event100m(25.4347, 18, 1.81),
	EventLongJump(0.14354, 220, 1.4),
	EventShotPut(51.39, 1.5, 1.05),
	EventHighJump(0.8465, 75, 1.42),
	Event400m(1.53775, 82, 1.81),
	Event110m(5.74352, 28.5, 1.92),
	EventDiscusThrow(12.91, 4, 1.1),
	EventPoleVault(0.2797, 100, 1.35),
	EventJavelinThrow(10.14, 7, 1.08),
	Event1500m(0.03768, 480, 1.85);

	public final double a;
	public final double b;
	public final double c;

	private DecathlonEvent(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

}
