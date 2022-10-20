package tw.east.mypractise;

public class Practise03 {
	//擲骰子 共1000000次，計算1~6點共出現幾次 array版本
	public static void main(String[] args) {
		int []p = new int[7];
		for(int i=0;i<1000000;i++) {
			int point = (int)(Math.random()*6+1); // 1-6
			 p[point]++;
		}
		for(int i=1;i<=6;i++) {
			System.out.printf("%d點出現%d次\n",i,p[i]);
		}

	}

}
