import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		List<int[]> list = Combinatorics.permutate(arr, 3);
		for(int i=0;i<list.size();i++) {
			int[] ret = list.get(i);
			for(int j=0;j<ret.length;j++) {
				System.out.print(ret[j]+" ");
			}
			System.out.println();
		}
	}

}
