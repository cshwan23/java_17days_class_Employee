package com.ccc.erp;

public class EmployeeExe {

	public static void main(String[] args) {
	
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//family 변수 선언하고
		//Family 객체 생성한 후 객체의 메위주를 리턴해서
		//family 변수안에 저장하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//패밀리 객체를 입력하고 아버지 정보를 입력		
		Family family = new Family(); //패밀리 클래스를 객체화 하는 코딩.
		
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//Family 객체가 소유한 setter 메소드 호출하여 데이터 저장하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		// setter 메서드를 통해 객체화.
		family.setRelation("부");
		family.setF_name("홍길동");
		family.setBirth_year(1950);
		
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//employee 변수 선언하고
		//Employee 객체 생성한 후 객체의 메위주를 리턴해서
		//employee 변수안에 저장하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//employee 클래스를 객체화 (employee 객체의 메위주)
		Employee employee = new Employee();	//employee 정보 땡겨온다.
		
		
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//Employee 객체가 소유한 setter 메소드 호출하여 데이터 저장하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		// 클래스명.set+메서드명();
		// 직업정보
		// 직원 번호 저장하기
		employee.setEmp_no(1);
		// 직원 이름 저장하기
		employee.setEmp_name("이소정");
		// 직원 직급 저장하기
		employee.setEmp_jikup("사장");
		// 직원 전화번호 저장하기
		employee.setPhone("010-1234-1234");
		// 직원 주민번호 저장하기
		employee.setJumin_num("960202-2222222");
		// 직원 연봉 저장하기
		employee.setSalary(9000);
		
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		// Family 객체의 메위주 저장하기 *******
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		// 객체의 메위주가 저장되어있는 변수 = (객체참조변수)
		// ***클래스명.set+클래스명();
		// employee객체에 family의 메모리 위치 주소값을 저장.
		// 가족 정보
		employee.setFamily(family);

		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		// Employee 객체가 소유한 getter 메소드 호출하여 얻은 데이터를
		// 지역변수 저장하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//꺼낼꺼면 변수안에 담아놔라.
		// 직원 번호 꺼내기
		int emp_no = employee.getEmp_no();
		// 직원 이름 꺼내기
		String emp_name = employee.getEmp_name();
		// 직원 직급 꺼내기
		String jikup = employee.getEmp_jikup();
		// 직원 전화번호 꺼내기
		String phone = employee.getPhone();
		// 직원 주민번호 꺼내기
		String jumin_num = employee.getJumin_num();
		// 직원 연봉 꺼내기
		int salary = employee.getSalary();		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// Family 객체의 메위주 꺼내기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//family객체 매위주를 꺼내려면 어떻게 꺼내냐? ***어려움***
		Family family2 = employee.getFamily();
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// Family 객체의 getter 메소드를 호출하여 얻은 데이터를
		// 지역변수 저장하기 ******
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		String relation = family2.getRelation();
		String f_name = family2.getF_name();
		int birth_year = family2.getBirth_year();
		
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// Employee 객체가 직원정보 및 가족 정보를 도스창에 출력하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 지역변수로 출력 저장하기 ******
		// 외부에서 들어온 데이터는 변수안에 넣고 써라 ( 표어 )
		// 이퀄왼쪽 변수 오른쪽 데이터 .왼쪽 메위주 .오른쪽 속성변수나 메소드 (표어) 
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("직원 정보");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("직원 번호 = " + emp_no);
		System.out.println("직원 명 = " + emp_name);
		System.out.println("직원 직급 = " + jikup);
		System.out.println("직원 전화번호 = " + phone);
		System.out.println("직원 주민번호 = " + jumin_num);
		System.out.println("직원 연봉 = " + salary);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("가족 정보");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("관계 = " + relation);
		System.out.println("가족명 = " + f_name);
		System.out.println("출생연도 = " + birth_year);

	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		/*
		System.out.println("직원 번호 = " + employee.getEmp_no());
		System.out.println("직원 명 = " + employee.getEmp_name());
		System.out.println("직원 직급 = " + employee.getEmp_jikup());
		System.out.println("직원 전화번호 = " + employee.getPhone());
		System.out.println("직원 주민번호 = " + employee.getJumin_num());
		System.out.println("직원 연봉 = " + employee.getSalary());
		//가족명을 꺼내고싶다 //family객체를 가지고 메위주를 갖고와야한다.
		System.out.println("가족명 = " + employee.getFamily().getF_name());
		System.out.println("출생연도 = " + employee.getFamily().getBirth_year());
		System.out.println("관계 = " + employee.getFamily().getRelation());

	*/	
		
		}

}
