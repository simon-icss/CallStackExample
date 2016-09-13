
public class CallStackExample {
	public static void main(String[] args) {
		String a = a();
		System.out.println("whateverrrr");
    // hi!
	}

	public static String a() {
    return "hello";
	}

	public static String b() {
		return "b";
    // this is a comment
	}
}
