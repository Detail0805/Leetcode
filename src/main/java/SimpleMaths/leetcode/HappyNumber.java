package SimpleMaths.leetcode;

public class HappyNumber {

	/**
	 * 202. Happy Number
	 */
	public static void main(String[] args) {
//		System.out.println(isHappy(87));
		isHappy2(87);
	}

	
	public static boolean isHappy2(int n){
		while (n !=1 && n !=4){//進到4就會能確定不是快樂數
			int temp=0;
			while (n!=0){
				temp=(n%10)*(n%10)+temp;
				n=n / 10;
			}
			n=temp;
		}
		return n==1;
	}
	
	public static boolean isHappy(int n){
		if(n<=0){ 
			return false;
		}
		if(n==1){
			return true;
		}
		int happy=sqrt(n);
		if(happy==4){
			return false;
		}
		if(happy==1){
			return true;
		}
		return isHappy(happy);
	}
	public static int sqrt(int nums){
		if(nums<10){
			return nums*nums;
		}
		int sum=0;
		while(nums>10){
			int small=nums%10;
			sum+=small*small;
			nums=nums/10;
		}
		sum+=nums*nums;
		return sum;
	}
	
	
}
