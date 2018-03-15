
public class MainSumAndHot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(giveBackSum(2, 3, 4));
		System.out.println(tellMeIfTheTempIsAlright(110, false));
	}

	public static int giveBackSum(int a, int b, int c) {
		int result = 0;
		if (a == b && a == c && c == b) {
			return result;
		} else if (a != b && a != c && b != c) {
			return (a + b + c);
		} else if (a == b) {
			return c;
		} else if (a == c) {
			return b;
		} else
			return a;
	}

	public static boolean tellMeIfTheTempIsAlright(int temperature, boolean isSummer) {

		if (temperature >= 60 && temperature <= 90 && isSummer == false) {
			return true;
		}

		else if (temperature >= 60 && temperature <= 100 && isSummer == true) {
			return true;
		}

		else {
			return false;
		}

	}

}
