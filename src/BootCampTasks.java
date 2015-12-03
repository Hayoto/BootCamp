
public class BootCampTasks {

	public static int smallest(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int[] populateArray(int left, int right, int count) {
		int[] arr = new int[count];
		for (int i = left; i < right; ++i) {
			arr[i] = (int) (Math.random() * 10);
		}
		return arr;
	}

	public static double[] populateArray(double left, double right, int count) {
		double[] arr = new double[count];
		for (int i = (int) left; i < right; ++i) {
			arr[i] = Math.random() * 10;
		}
		return arr;
	}
	
	public static int[] grow(int[] arr){
		int[] tmp = new int[2 * arr.length];
		for (int i = 0; i < arr.length; ++i){
			tmp[i] = arr[i];
		}
		return tmp;
	}
	
	public static int[] shrink(int[] arr){
		int[] tmp = new int[arr.length / 2];
		for (int i = 0; i < tmp.length; ++i){
			tmp[i] = arr[i];
		}
		return tmp;
	}
	public static double[] grow(double[] arr){
		double[] tmp = new double[2 * arr.length];
		for (int i = 0; i < arr.length; ++i){
			tmp[i] = arr[i];
		}
		return tmp;
	}
	
	public static double[] shrink(double[] arr){
		double[] tmp = new double[arr.length / 2];
		for (int i = 0; i < arr.length; ++i){
			tmp[i] = arr[i];
		}
		return tmp;
	}
}
