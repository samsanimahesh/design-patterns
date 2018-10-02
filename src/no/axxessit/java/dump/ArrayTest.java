package no.axxessit.java.dump;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] nums = {{20},{30},{40}};
		int sum = 0;
		for(int[] row: nums){
			for(int val:row){
				sum+=val;
			}
			
		}
		System.out.println(sum);
	}

}
