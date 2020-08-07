package shuzu3;

public class Xuanze {
	/*
	 * 选择排序：找出最小值，然后和最前面数据交换位置
	 * 数列：5 4 3 2 1 ；
	 * 第一次：1 5 4 3 2
	 * 第二次：5 4 3 2---2 5 4 3
	 * 第三次：5 4 3---3 5 4
	 * 第四次：5 4---4 5
	 */	
	public static void main(String[] args) {
		int[] a= {5,4,3,2,1};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]>a[j]) {
					int min=a[i];
					a[i]=a[j];
					a[j]=min;

				}
				for(int k=0;k<a.length;k++) {
					System.out.print(a[k]+" ");
			}	
			System.out.println();
		}
			System.out.println();
		}
	}

}
