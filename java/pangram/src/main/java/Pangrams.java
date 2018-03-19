import java.util.stream.IntStream;

public class Pangrams {

	public static boolean isPangram(String string) {
		PangramChecker pangramChecker = new PangramChecker();
		return pangramChecker.isPangram(string);
	}

}
