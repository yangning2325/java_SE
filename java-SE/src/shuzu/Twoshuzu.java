package shuzu;

public class Twoshuzu {

	public static void main(String[] args) {
		m1(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
	}

	private static void m1(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i] [j]+" ");
			}
			System.out.println();
		}
		
	}

}
