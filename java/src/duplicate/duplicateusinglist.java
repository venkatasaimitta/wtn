package duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicateusinglist {

	public static void main(String[] args) {
			int[] arr = {12, 34, 12, 45, 67, 89};
			List<Integer> Array = new ArrayList<>();
			
			for (int i : arr) {
				if (!Array.contains(i))
					Array.add(i);
			}
			
			System.out.println(Arrays.toString(Array.toArray()));

	}

}
