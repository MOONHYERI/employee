package employeepay;

/*
​1) 정규직 사원을 나타내는 자식 클래스

2) 추가로 dept, regpay, regtitle 필드와 RegEmployee()생성자

3) 변수의 값을 연결한 문자열을 반환하는 toString()메소드

4) 월 임금에 10만원을 더하여 급여액을 계산하는 erinings()메소드로 구성된다.
 */
public class RegEmployee extends Employee {
	String dept;
	private long regpay;
	String regtitle;

	public RegEmployee(String ename, String esno, String dept, long regpay,
			String regtitle) {
		super(ename, esno);
		this.dept = dept;
		this.regtitle = regtitle;
	}

	public long getRegpay() {
		return regpay;
	}

	public void setRegpay(long regpay) {
		this.regpay = regpay;
	}

	@Override
	public String toString() {
		return super.toString() + "담당업무 : " + dept ;
	}

	@Override
	public long earnings() {
		return regpay+10;
	}

}
