package samples.patterns.Command.usingfunctional;

/**
 * The Command functional interface.<br/>
 */
@FunctionalInterface
public interface Command {
	public void apply();
}