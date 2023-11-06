package week1.day1;

public class SwitchCases {

	public static void main(String[] args) {
		String browser = "chrome";
		switch (browser) {
		case "chrome":
			System.out.println("Open chrome browser");
			break;
		case "ie":
			System.out.println("Open IE browser");
			break;
		case "safari":
			System.out.println("Open safari browser");
			break;
		case "firefox":
			System.out.println("Open firefox browser");
			break;
		default:
			System.out.println("Edge");
			break;
		}

	}

}
