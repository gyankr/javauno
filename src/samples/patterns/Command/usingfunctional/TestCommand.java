package samples.patterns.Command.usingfunctional;



public final class TestCommand {
	
	public static void main(final String[] arguments) {
		final CommandFactory cf = CommandFactory.init();
		
		cf.executeCommand("Light on");
		cf.listCommands();
	}
}