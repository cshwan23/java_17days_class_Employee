//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// 소속패키지 선
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
package com.ccc.erp;

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//[부서정보]를 관리하는 클래스 선언하기
//(주의)클래스는 의미있게 주어야하고 관용적으로 대문자로 시작한다
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
public class Dept {

	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 속성변수 선언
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	//부서 번호 저장
	private int dept_no; // 기본적으로 디폴트값0 이 들어있다.
	//부서 이름 저장
	private String dept_name; // 기본적으로 string은 null이 들어있다.
	//부서 위치 저장
	private String dept_loc;
	

	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// [getter 메소드] 선언
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	// 부서번호 리턴하는 메소드 선언
	public int getDept_no() {
		return dept_no;
	}
	// 부서명 리턴하는 메소드 선언

	public String getDept_name() {
		return dept_name;
	}
	// 부서위치 리턴하는 메소드 선언

	public String getDept_loc() {
		return dept_loc;
	}

	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// [setter 메소드] 선언
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 부서번호 세팅하는 메소드 선언

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	// 부서명 세팅하는 메소드 선언
	
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	// 부서위치 세팅하는 메소드 선언

	public void setDept_loc(String dept_loc) {
		this.dept_loc = dept_loc;
	}
	
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// DTO(Data Transfer Object)? DTO의 약자
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 속성변수 xxx, 메소드 getXxx(){~}, 메소드 setXxx(~){~} 이 한쌍으로 n개 존재하는 클래스를
	// 객체화 했을 때 이걸 뭐라고 부르냐 *DTO* 라고 부른다. (= 객체명칭) 
	// *DTO란 (Data Transfer Object)라고 부른다. 
	// 주로 어디에 많이 써?
	// "다량의 데이터"를 저장하여 옮겨 다닐 때 특히 "DB 연동 시" 아주 많이 사용한다. 
	// 마치 이사짐 박스와 유사한 역할을 한다.
	// DTO 를 VO(Value Object)라고 부르기도 한다 (주로 값을 갖고있다 라고해서 VO라고 부르기도 한다)
	// DTO 클래스의 이름은 보통 "클래스 이름 뒤"에 DTO를 붙이기도 한다.
	// 예) EmployeeDTO 클래스는 무슨소리냐? 고용된 사람을 지칭하는데 "직원들의 다량의 정보를 담는 클래스"를 의미.
	// DTO 클래스 안의 속성변수명이 DB의 테이블 컬러명과 일치하는 경우가 많다.
	// 특히 스프링(Spring)에서 DTO 클래스의 역할은 어마무시하다.(작업이 굉장히 편해지는것)
	// 이사할때 하나하나 나르는게 아니라 박스안에 담아서 나르는것과 같다.
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// DAO(Data Access Object)? DAO의 약자
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 직접 DB 연동을 하는 클래스의 객체를 지칭한다,
	// 주로 DB에 입력, 수정, 삭제, 검색하는 기능을 가진다.
	
	
	
	
	
	
	
	
}
