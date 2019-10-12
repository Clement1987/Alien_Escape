public class Colors {

	public static String red (String str) {

		return "\033[31m" + str + "\033[0m";

	}

	public static String cyan (String str) {

		return "\033[36m" + str + "\033[0m";

	}

	public static String green (String str) {

		return "\033[32m" + str + "\033[0m";

	}

	public static String pink (String str) {

		return "\033[35m" + str + "\033[0m";

	}

	public static String blink (String str) {

		return "\033[0;5m" + str + "\033[0m";

	}
}