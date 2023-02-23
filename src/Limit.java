
public class Limit {

	public static void main(String[] args) {
		for (double x = 1000; x <= 1000000000; x += 1000) {
			double s = Math.sqrt(x + x*x) - x;
			System.out.println(s);
		}

	}

}
