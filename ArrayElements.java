
public class ArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Toyota", "Honda", "Ford", "Mazda"};
		System.out.println("Toyota : " + cars [0]);
		System.out.println("Honda : " + cars [1]);
		System.out.println("Ford : " + cars [2]);
		System.out.println("Mazda : " + cars [3]);
		//Car: Honda
		
		cars[1] = "BMW";
		cars[3] = "Tesla";
		System.out.println("The second element : " + cars[1]);
		System.out.println("The fourth element : " + cars[3]);
		System.out.println("The number elements : " + cars.length);
	}

}
