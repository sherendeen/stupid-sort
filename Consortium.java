package enterpriseSort;

public class Consortium {
    public static void main(String[] args) {
	int[] array = createRandomArray(1000);
	int[] sortedArray = sort(array);
	System.out.println();
	displayIntegerArray(sortedArray);
    }

    private static int[] sort(int[] array) {
	
	for (int j = 0; j < array.length; j++) {
	    for (int i = 1; i < array.length; i++) {

		if (array[i] < array[i - 1]) {// if the current index is less than the previous index
		    int tmp = array[i];
		    array[i] = array[i - 1];
		    array[i - 1] = tmp;

		}

	    }

	}

	return array;
    }

    /**
     * Creates an array of integers of a specified length containing numbers from
     * between a range of 1 to 10,000
     * 
     * @param n
     * @return
     */
    private static int[] createRandomArray(int n) {
	int[] array = new int[n];
	for (int i = 0; i < array.length; i++) {
	    array[i] = (int) (Math.random() * 10_000) + 1;
	}
	return array;
    }

    private static void displayIntegerArray(int[] array) {
	for (int i = 0; i < array.length; i++) {
	    System.out.println(array[i]);
	}
    }

}
