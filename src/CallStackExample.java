
public class CallStackExample {
	public static void main(String[] args) {
		String a = a();
		System.out.println("whatever");
	}

	public static String a() {
		return b();
	}

	public static String b() {
		System.out.println("dsfdfsdsf");
		return "b";
	}
}
