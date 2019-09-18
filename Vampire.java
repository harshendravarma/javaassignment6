package question1;

class Vampire {

	Boolean flag = false;

	/* given a number returns an array of each digits in the number */
	public int[] ConvertNumberToArray(int number) {
		int remainder, i = 0;
		int length = (int) (Math.log10(number) + 1);
		int arr[] = new int[length];
		while (number != 0) {
			remainder = number % 10;
			arr[i] = remainder;
			number = number / 10;
			i++;
		}
		return arr;
	}

	/* given an array pertimutates all possible values of that array */
	void permuteHelper(int[] arr, int index, int number) {
		if (index >= arr.length - 1) {
			// If we are at the last element - nothing left to permute
			if (this.isVampire(arr, number)) {
				flag = true;
			}
		}
		for (int i = index; i < arr.length; i++) { 
			// For each index in the sub array arr[index...end]
			// Swap the elements at indices index and i
			int t = arr[index];
			arr[index] = arr[i];
			arr[i] = t;
			// Recurse on the sub array arr[index+1...end]
			permuteHelper(arr, index + 1, number);
			// Swap the elements back
			t = arr[index];
			arr[index] = arr[i];
			arr[i] = t;
		}
	}

	/*
	 * given an array and a number checkf firsthalf * second half is eual to given
	 * number or not
	 */
	Boolean isVampire(int[] arr, int number) {
		int firstHalfSum = 0;
		int secondHalfSum = 0;
		for (int i = 0; i < (arr.length) / 2; i++) {
			firstHalfSum += arr[i] * Math.pow(10, (arr.length) / 2 - i - 1);
		}
		for (int i = (arr.length) / 2; i < arr.length; i++) {
			secondHalfSum += arr[i] * Math.pow(10, (arr.length - i - 1));
		}
		if (firstHalfSum * secondHalfSum == number) {
			return true;
		}
		return false;
	}

}