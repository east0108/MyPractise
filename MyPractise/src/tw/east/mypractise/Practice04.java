package tw.east.mypractise;
//作弊版 骰骰子陣列
public class Practice04 {

	public static void main(String[] args) {
		int []p = new int[7];//此為骰子的大小1~6空間
		
		for(int i=0;i<1000000;i++) {
			int point = (int)(Math.random()*9+1); //點數 1-9
			 p[point <= 6 ? point : point-3 ]++;
			 //讓789產生的次數加到456,使得456的機率變高
			 
		}
		for(int i=1;i<=6;i++) {
			System.out.printf("%d點出現%d次\n",i,p[i]);
		}

	}

}
