package question1;


public class VampireMain {

	public static void main(String[] args) {
		
		Vampire v = new Vampire();
		int number = 999;
		int count = 0;
		//loops every even number and checks if vampire until hundred numbers
		while (count < 100) {
			if (((int) (Math.log10(number) + 1))%2 == 0) {
				int[] arr = v.ConvertNumberToArray(number);
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
