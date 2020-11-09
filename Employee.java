package com.ccc.erp;
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//[직원정보]를 관리하는 [Employee]클래스 선언하기
//(주의)클래스는 의미있게 주어야하고 관용적으로 대문자로 시작한다
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
public class Employee {
	
	
	// 직원정보 (직원번호, 이름, 직급, 전화번호, 주민번호, 연봉 ) 
	private int emp_no;
	private String emp_name;
	private String emp_jikup;
	//전화번호(숫자일까 문자일까 전화번호로 곱할거야? 연산할거아니면 문자로취급하면된다)
	private String phone;
	private String jumin_num;
	private int salary;
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// ?? 
	// -> Employee 클래스 안으로 객체의 메위주가 들어오기 시작했다. 이걸 참조형 데이터라고 한다.
	private Family family; // 패밀리 클래스를 객체화 할거다 거기에 메위주를 집어넣을거다.
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

	
	

	public int getEmp_no() {
		return emp_no;
	}


	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getEmp_jikup() {
		return emp_jikup;
	}


	public void setEmp_jikup(String emp_jikup) {
		this.emp_jikup = emp_jikup;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getJumin_num() {
		return jumin_num;
	}


	public void setJumin_num(String jumin_num) {
		this.jumin_num = jumin_num;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	public Family getFamily() {
		return family;
	}


	public void setFamily(Family family) {
		this.family = family;
	}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	
//	패밀리 객체를 입력하고 아버지 정보를입력
	
	
	
	
	
	
	
	
	
	
	

}
