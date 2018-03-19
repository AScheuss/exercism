public class HelloWorld {

	static public String hello(final String name) {
		if (name == null || name.isEmpty()) {
			return constructGreeting("World");
		} else {
			return constructGreeting(name);
		}
	}

	private static String constructGreeting(final String name) {
		return "Hello, " + name + "!";
	}

}
