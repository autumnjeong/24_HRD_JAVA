package day01;

public class VarTast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수형 변수 2개 선언하기(i, j)
		//문자열형 변수 1개 선언하기(var1)
		//문자형 변수 1개 선언하기(var2)
		
		//정수형 변수 1개와 문자열 변수 연결해서 출력하기 
		
		//문자열형 변수 출력하기 
		
		int i= 10, j = 20;
		String var1 = "홍길동";
		char var2 = 'A';
		String var3 = "A";
		
		System.out.println(i + var2); // 이 부분이 왜 75가 나오는지? 아마 ASCII일듯
		System.out.println(i + var3);
		
		System.out.println(var1);
		
		// 강제 형 변환
		
		double k = 3.141592;
		
		j = j + (int)k;
		
		System.out.println("j:"+j+"\nk:"+k);
		
		
		
		
		
	}

}
