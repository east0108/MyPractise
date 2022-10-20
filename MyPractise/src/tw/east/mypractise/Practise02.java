package tw.east.mypractise;

public class Practise02 {
	//擲骰子 共100000次，計算1~6點共出現幾次 switch版本
	public static void main(String[] args) {

		int p0,p1, p2, p3, p4, p5, p6;
		p0= p1 = p2 = p3 = p4 = p5 = p6 =0;
		 
		for(int i=0 ;i<1000000;i++) {
			int count = (int)(Math.random()*6+1);
			switch (count) {
			case 1: p1++; break;
			case 2: p2++; break;
			case 3: p3++; break;
			case 4: p4++; break;
			case 5: p5++; break;
			case 6: p6++; break;
			default : p0++;break;
			}
			
		}
		
		System.out.printf("%d點出現%d次\n",1,p1);
		System.out.printf("%d點出現%d次\n",2,p2);
		System.out.printf("%d點出現%d次\n",3,p3);
		System.out.printf("%d點出現%d次\n",4,p4);
		System.out.printf("%d點出現%d次\n",5,p5);
		System.out.printf("%d點出現%d次\n",6,p6);
		System.out.printf("錯誤點出現%d次",p0);
		
		
	}

}
