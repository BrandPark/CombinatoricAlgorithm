import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Combinatorics {
	public static final List<int[]> permutate(int[] arr, int r) {
		List<int[]> cases = new ArrayList<>();
		boolean[] visited = new boolean[arr.length];
		int[] pickedCase = new int[r];

		permutateImpl(cases, arr, visited, pickedCase, r, 0);

		return cases;
	}

	private static void permutateImpl(List<int[]> cases, int[] arr, boolean[] visited, int[] pickedCase, int r,
			int count) {
		if (count == r) {
			int[] copyArr = Arrays.copyOf(pickedCase, r);
			cases.add(copyArr);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (visited[i])
				continue;
			visited[i] = true;
			pickedCase[count] = arr[i];
			permutateImpl(cases, arr, visited, pickedCase, r, count + 1);
			visited[i] = false;
		}
	}
}
