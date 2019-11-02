package z_exam;

public class P_Exam03 {

	public static void main(String[] args) {
		


		
/*		 *
		 	[3-1]
		 	다음 연산의 결과를 적으시오.
		 	
			class Exercise3_1 {
			public static void main(String[] args) {
			int x = 2;
			int y = 5;
			char c = 'A'; // 'A' 의 문자코드는 65
			System.out.println(1 + x << 33);				: 6
			System.out.println(y >= 5 || x < 0 && x > 2);	: false
			System.out.println(y += 10 - x++);				: 13
			System.out.println(x+=2);						: 5
			System.out.println( !('A' <= c && c <='Z') );	: flase
			System.out.println('C'-c);						: 2
			System.out.println('5'-'0');					: 5
			System.out.println(c+1);						: B
			System.out.println(++c);						: B
			System.out.println(c++);						: C
			System.out.println(c);							: D
	}
}
*/
/*			[3-2]
			아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
			만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의
			바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
			
			class Exercise3_2 {
			public static void main(String[] args) {
			int numOfApples = 123; // 사과의 개수
			int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
			int numOfBucket = (  (1) ); // 모든 사과를 담는데 필요한 바구니의 수
			System.out.println(" :"+numOfBucket); 필요한 바구니의 수
			}
			}
			[ 실행결과 ] 13
			
			= (1) (numOfApples / sizeOfBuket) + (numOfApples % sizeOfBuket == 0 ? 0 : 1) 
			*/
			
/*			[3-3]
			아래는 변수 num값에 따라 '양수','음수','0'을 출력하는 코드이다.
			삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
			[Hint] 삼항 연산자를 두 번 사용하라.
			
			class Exercise3_3 {
			public static void main(String[] args) {
			int num = 10;
			System.out.println( (1) );
			}
			}
			[ 실행결과 ] 양수
			
			= (1) num > 0 ? "양수" : num == 0 ? 0 : "음수"
			*/
			
/*			[3-4]
			아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이
			'456'이라면 '400'이 되고, '111' 이라면 '100'이 된다. (1)에 알맞은 코드를 넣으시오.
			
			class Exercise3_4 {
			public static void main(String[] args) {
			int num = 456;
			System.out.println( (1) );
			}
			}
			[ 실행결과 ] 400
			
			= (1) num / 100 * 100

*/
/*			[3-5]
			아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다.
			만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다.
			(1)에 알맞은 코드를 넣으시오.
			
			class Exercise3_5 {
			public static void main(String[] args) {
			int num = 333;
			System.out.println( (1) );
			}
			}
			[ 실행결과 ] 331 
			
			= (1) num / 10 * 10 + 1
			*/
			
			
/*			[3-6]
			아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다.
			예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 19의 경우 20이고, 81의 경우 90이 된다.
			30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다.
			(1)에 알맞은 코드를 넣으시오.
			[Hint] 나머지 연산자를 사용하라.

			class Exercise3_6 {
			public static void main(String[] args) {
			int num = 24;
			System.out.println( (1) );
			}
			}	
			[ 실행결과 ] 6
			
			= (1) 10 - (num % 10)
*/
			
	/*		[3-7] 
			아래는 화씨(Fahrenhelt)를 섭씨(Celclus)로 변환하는 코드이다. 변환공식이
			'C = 5/9 * (F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 
			

			class Exercise3_7 {
			public static void main(String[] args) {
			int fahrenheit = 100;
			float celcius = ( (1) );
			System.out.println("Fahrenheit:"+fahrenheit);
			System.out.println("Celcius:"+celcius);
			}
			}
			[ 실행결과 ]
			Fahrenheit:100
			Celcius:37.78
			
			= (1) celcius = 5/9.0 * (100 - 32f)
*/
			/*
		int fahrenheit = 100;
		float celcius = ((5/9.0 * (fahrenheit - 32.0) / 100 + 0.5) * 100.0);
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		*/
		
		
		
			
/*			[3-8]
			아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
			
			class Exercise3_8 {
			public static void main(String[] args) {
			byte a = 10;
			byte b = 20;
			byte c = a + b;
			char ch = 'A';
			ch = ch + 2;
			float f = 3 / 2;
			long l = 3000 * 3000 * 3000;
			float f2 = 0.1f;
			double d = 0.1;
			boolean result = d==f2;
			System.out.println("c="+c);
			System.out.println("ch="+ch);
			System.out.println("f="+f);
			System.out.println("l="+l);
			System.out.println("result="+result);
			}
			}
			[ 실행결과 ]
			c=30
			ch=C
			f=1.5
			l=27000000000
			result=true
			
			=
			byte c = (byte) a + b;
			ch = (ch) ch + 2;
			float f = 3 / 2f;
			long l = 3000 * 3000 * 3000L;
			boolean result = (float)d==f2;
			
			*/
			
	/*		
			[3-9]
			다음은 문자형 변수 가 영문자 대문자 또는 소문자 이거나 숫자일 때만 변수 b의 값이 true가
			되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
			
			class Exercise3_9 {
			public static void main(String[] args) {
			char ch = 'z';
			boolean b = ( (1) );
			System.out.println(b);
			}
			}
			[ 실행결과 ]
			true
			
			= (1) ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9')  
			
			
			*/
			
/*			[3-10]
			다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
			문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를 들어 'A'의 코드는 65이고 ' a'의 코드는 97이다.
			(1)~(2)에 알맞은 코드를 넣으시오.
			
			class Exercise3_10 {
			public static void main(String[] args) {
			char ch = 'A';
			char lowerCase = ( (1) ) ? ( (2) ) : ch;
			System.out.println("ch:"+ch);
			System.out.println("ch to lowerCase:"+lowerCase);
			}
			}
			[ 실행결과 ]			
			ch:A
			ch to lowerCase:a
			
			= (1) 'A' <= ch && ch <= 'Z'
			  (2) (char) ch + 32
			  
			   */
			



		
		
		
	}

}











