
public class IdleState implements State{
	public void doAction(Context context) {
		System.out.println("Player is idle.");
		context.setState(this);
	}
	public String toString() {
		return "Idle state";
	}
}
