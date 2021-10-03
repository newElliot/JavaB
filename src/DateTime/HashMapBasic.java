package DateTime;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapBasic {

	public static void main(String[] args) throws ClassCastException{
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		map.put(1, true);
		map.put(2, false);
		map.put(3, false);
		map.put(7, true);
		map.put(5, true);

		Object[] objArray = map.keySet().toArray();
		int length = objArray.length;
		int intArray[] = new int[length];
		for (int i = 0; i < length; i++) {
			intArray[i] = (int) objArray[i];
		}
		
		for(int i = 0 ; i < intArray.length; ++i) {
			System.out.println("Key: " + intArray[i]);
			System.out.println("value: " + map.get(intArray[i]));
		}
		
		
		map = null;
		System.out.println("Map null:  " + map);
		System.out.println("Map size:  " + map.size());
	}

}
