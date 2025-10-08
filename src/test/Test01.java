package test;

public class Test01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum += i;
			System.out.println(i + "回目の合計＝" + sum);
		}
		System.out.println("1～9の合計＝" + sum);
	}

}
