package question1;



public class Main2 {

	public static void main(String[] args) {
		Vampire v = new Vampire();
		int number = 999;
		int count = 0;
		while (count < 100) {
			if (((int) (Math.log10(number) + 1))%2 == 0) {
				int[] arr = v.getArrayOfNumbers(number);
				v.permuteHelper(arr, 0, number);
				if (v.flag) {
					System.out.println(number);
					count++;
					v.flag = false;
				}

			}
			number++;
		}

	}

}
