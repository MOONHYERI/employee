package employeepay;

import java.util.Scanner;

/*
1. 입력 자료 수는main(String[] args) 이용하여 입력 받는다.

2. 사원번호, 이름을 입력

3. 사원의 근무유형은 관리직(1), 정규직(2), 임시직(3)으로 구분한다.
   사원번호가 잘 못 입력되면 “근무유형 오류 재입력….”을 출력하고 다시 입력을 받는다.

4. 관리자 - 직책과 임금을 입력
   정규직 - 부서, 업무, 임금을 입력
   임시직 - 부서, 월 근무시간수

5. 직무 유형에 따라 수당
   관리자 : 20만원 정규직 : 10만원을 더해서 급여액을 더하여 출력한다.
   임시직 : 시간당 3만원으로 정하고 시간 수에 월급여액을 구해서 출력한다.
 */
public class TestEmployee {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 필드 선언시 클래스타입 - 임시직, 정규직
		System.out.println("입력 자료 수");
		int n = in.nextInt();
		// 필드선언시 기본 변수 - String no, name
		TempEmployee tp;
		RegEmployee rg;
		Employee[] emp = new Employee[n];
		String no , name;
		// main메서드 매개변수인 args를 배열선언 한다.
		// 부모의 클래스를 입력하는 갯수로 배열만든다.

		// 1. 입력 자료수 만큼 반복문 for 변수 i
		// 2. System.out.print("사원번호,이름...");
		for (int i = 0; i < n; i++) {
			System.out.println("사원번호, 이름...");
			String a = in.next();
			String b = in.next();
			System.out.println("사원의 근무유형 ((1.CEO, 2.정규직, 3.임시직)");
			int no1 = in.nextInt();

			if (no1 < 1 || no1 > 3) {
				System.out.println("근무유형 오류 재입력....");
				i--;
				continue;
			}
			switch (no1) {
			case 1:
				System.out.println("직책, 월 임금....");
				String title = in.next();
				long pay = in.nextLong();
				Staff sa = new Staff(b, a, title, pay);
				emp[i] = sa;
				break;

			case 2:
				System.out.println("부서, 업무, 월임금....");
				String dept = in.next();
				String regtitle = in.next();
				long regpay = in.nextLong();
				rg = new RegEmployee(b, a, dept, regpay, regtitle);
				emp[i] = rg;
				break;

			case 3:
				System.out.println("부서, 월근무시간....");
				String hdept = in.next();
				long temphour = in.nextLong();
				tp = new TempEmployee(b, a, hdept, temphour);
				emp[i] = tp;
				break;
			default:
			}

		}

		// 3. no, name에 사원번호와 이름을 넣는다.
		// 4. System.out.print("사원의 근무유형 (1.CEO, 2.정규직, 3.임시직))
		// 5. int eno = scan.nextInt();
		// 6. 입력된 eno 1과 3사이에 있어야된다.-> if(no < 1 || no > 3) 근무유형 오류 재입력.

		// 7. switch(eno) {
		// 8. case 1 : Staff 클래스 적용
		// 입력은 직책 title, 급여 pay
		// Staff sa = new Staff(name, no, title, pay);
		// emp[i] = sa;
		// break;

		// 9. case 2 : RegEmployee 클래스 적용
		// 10. case 3 : TempEmployee 클래스 적용
		// 11. default : }
		System.out.println("\n 급여 보고서");
		for (Employee e : emp) {
			System.out.println(e + " 급여액 : " + e.earnings() + "만원");

		}
		

		// 급여 보고서
		// 향상된 for(데이터타입 변수 : 배열 emp){
		// System.out.println(변수 + "급여액 : " + 변수.earningd( + "만원")}
	
	}
	
}
