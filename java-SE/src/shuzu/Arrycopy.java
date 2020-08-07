package shuzu;

public class Arrycopy {

	public static void main(String[] args) {
		int[] a= {2,5,6,7,8,1,9};
		int[] b= {11,12,5,7,9,20,30};
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//src原数组，src起始下标，dest被覆盖的数组，destpos被覆盖的数组的下标；length要拷贝的元素个数；
		System.arraycopy(a,1,b,2,3);
		for(int i=0;i<b.length;i++) {
			int c=b[i];
			System.out.println(c);
		}

	}

}
