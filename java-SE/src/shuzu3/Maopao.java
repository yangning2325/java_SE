package shuzu3;

public class Maopao {
//第一次循环：
//5 7 3 4 1
//5 3 7 4 1
//5 3 4 7 1
//5 3 4 1 7
//第二次循环：
//3 5 4 1
//3 4 5 1
//3 4 1 5
//第三次循环：
//3 4 1
//3 1 4
//第四次循环：
//1 3
	public static void main(String[] args) {
		int[] a= {5,7,3,4,1};
		for(int i=a.length-1;i>0;i--) {//外层循环4次
			for(int j=0;j<i;j++) {//内层借助 i 循环 i 次；
				if(a[j]>a[j+1]) {
					int m=a[j];
					a[j]=a[j+1];
					a[j+1]=m;
				}
				//遍历数组
				for (int k=0;k<a.length;k++) {
					int b=a[k];
					System.out.print(b+" ");
			}
				System.out.println("");
		}
			System.out.println("");
		}
	}

}
