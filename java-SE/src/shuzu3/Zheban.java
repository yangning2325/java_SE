package shuzu3;

import java.util.Scanner;

public class Zheban {
	public static void main(String[] args) {
		System.out.print("当前的元素有:");
		int[] a= {1,2,3,5,6,8,9,11,20,24};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
while(true) {
	Scanner s=new Scanner(System.in);
	System.out.print("请输入你要查找的数字：");
	int mb=s.nextInt(); //要查的目标元素
	int xb=way(a,mb);//xb为数组的下标
	System.out.println((xb==-1)?mb+"元素不存在":mb+"在数组中元素的下标为："+xb);
}
	}
//折半查找的算法
	private static int way(int[] a, int mb) {
//定义数组的上下限
		int begin=0;
		int end=a.length-1;
	//下面的循环意思是当要查找的元素在此数组时一定会返回输出，
	//当查找的元素不在此数组时end会不断减一或者是beging不断加一直到循环条件不成立跳出循环返回-1；
	while(begin<=end) {
		int mid=(begin+end)/2;//进行折半分析
		if(a[mid]==mb) {//折半后的元素等于目标元素
			return mid;
		}
		if(a[mid]>mb) {	//说明目标元素在折半后的元素的左面
			end=mid-1;
		}else if(a[mid]<mb) {////说明目标元素在折半后的元素的右面
			begin=mid+1;
		}
	}
	return -1;
		
	}

}
