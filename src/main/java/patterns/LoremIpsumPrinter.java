package patterns;

import java.util.function.Function;

public class LoremIpsumPrinter {

	public static final String DOLOR = "dolor";

	void print(Function<String, String> cleaner, Integer lineNum, long timeMs) {
		String cleaned = cleaner.apply(DOLOR + " sit amet, ");
		int offsetedLine = lineNum + 100;
		long timeSec = timeMs / 100;
		printMsg(String.format("%s %d %d", cleaned, offsetedLine, timeSec));
	}

	void printMsg(String msg) {
		System.out.println(msg);
	}

}
