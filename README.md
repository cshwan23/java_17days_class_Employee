# java_17days_class_Employee
Dept/Employee/Family/EmployeeExe/자바 클래스 구조 코딩

1교시
 
복습 - 소스 중심으로 공부. 분석.
예제로 소스 만들고.
강의 중심으로 공부 x
이론보다는 소스중심으로 분석,
 
1. 클래스앞 public이 없으면
   이 클래스를 수입할 수 있는건 동일패키지 클래스밖에 없다.
   수입이 안되면 객체생성이 안된다.
   (모든타겟은 객체생성에 맞춰져있는데)
 
2. class 앞에 abstract가 붙으면
   1) 그 클래스는 객체생성이 불가능하다 **
   객체 생성못하는 클래스를 그럼 왜 만들었냐?
 
   2) 자식이 와서 상속받고 바디없는 메소드를 재정의해서 써라.
   (내가 바디없는 메소드도 없다면 조상중에 바디없는 메소드가 있다.)
   (바디없는메소드를 어떻게 호출해?)
   메소드 이름만 만들고 자식은 내정의를 가저다가 실행구문만 만들어서 사용가능
   자식을 위해서 희생하는것. 자식이 와서 내 멤버를 갖다 쓰라.
   타겟은 내가 아니라 자식이다. 자식을 위해서.
   바디 없는 메소드를 물려받은 거다.
 
3. 내가 바디없는 메소드가 없고 조상 중에도 없는데 abstract가 붙어있다면
   이 클래스는 객체화가 할 수 없다는 뜻. 객체화를 막으려고. 상속 금지.
 
4. 속성변수에 final이 붙어있다면
   1) 갱신이 불가능하다. (절대적인 데이터, 업무 특성상 변하지 않는 데이터)
   2) 자동 초기화가 안되니까 내가 반드시 수동 초기화를 해줘야한다.
   3) 1)속성변수에서 또는 2)생성자에서 수동 초기화 해야한다.
 
5. static이 붙은 속성변수의 특징
   1) 객체 생성을 하지 않고도 호출이 가능하다. 
   2) 2번이상 객체화 했을 때 그 속성변수는 따로따로 있는게 아니라 공유한다.
   static 없이 2번이상 객체화했을때 단독활동.
 
6. 생성자의 특징, 역할
   1) 클래스를 구성하는 멤버중 하나로써 실행구문을 품고있다.
   (=메소드와 흡사.실행구문갖고있다)
   2) 객체 생성 중에 단한번 호출된다.
   (메서드는 호출하고싶을 때 호출할 수 있다.)
   3) 생성자의 실행구문엔 대체로 뭐가 들어있나?**
   주로 속성변수를 초기화시키는 실행구문이 들어있다.
   4) 외부에서 데이터가 들어와야 하는데 안들어오고 초기화가 안됐으면
   메소드를 통해서 초기화를 시켜준다. 
   (생성자에서 초기화를 안해도 메소드에서 초기화를 할 수도 있다.)
   (ex. setKor 수정하는 메소드)
 
7. 속성변수 바로 왼쪽에 붙어있는 것.
자료형/ 변수에 들어가는 데이터 유형
(ex 다이소 그릇 앞에 포장용기,렌지용기) (용도설명) 
 
클래스명 + 속성변수 (ex. Xxx a;)  => 클래스명 혹은 인터페이스다.
a 엔 뭐가들어갈 예정인가?
 
(a 대신에 클래스앞의 대문자를 소문자로 고쳐서 Xxx xxx 로 바꾼다 관용적으로
호근 Xxx xxxobj 클래스 전신의 소문자로 쓰거나 클래스 이름뒤에 obj를 쓰는게
관용적 표현이다. 클래스를 객체화한다는걸 보여주기위해)
지금은 null이지만 xxx의 객체화되었을때 
xxx의 객체 메모리 위치 주소값이 들어갈 예정.
메모리 위치 주소값으로 뭘하려는거야 ?
- 그 클래스 안에 있는속성변수나 메소드를 호출하기위해서
또는**
Xxx의 객체의 후손(조상 안됨) 클래스가 객체화 되서 메위주가 들어갈 수 있다.
 
인터페이스는 바디없는 메소드로 구성되어있다.
실행구문 x 없고 역할이 없다. 
접근지정자도 public으로 다 풀려있다. 보안성x
인터페이스는 객체화 할 수 없다.
인터페이스가 클래스에게 물려주는것을 구현이라고 한다.
(상속은 클래스가 클래스를 객체화하는것 법률적으로 혈연관계에 있는 부모가 자식또는 친족에게 재사늘 그대로 물려주는 행위)
구현 = 창조와 비슷 Xxx(인터페이스)를 구현 받은 클래스를 객체화하는 메모리 위치주소값이 들어갈거다.
* 변수 앞에 붙어있는 자료형의 역할은 변수안에 들어갈데이터의 유형이 뭔지 규정짓는것.
 
8. 메소드 왼쪽에 붙어 있는 건
 
메소드 실행구문이 다 실행되고 (받을 선물의 유형)나오는 데이터 자료형인데
메소드의 return 자료형 (기본자료형/클래스명/인터페이스/void)
(ex 자판기에 동전넣으면 커피가 나온다.)이라고 한다.
메소드의 리턴형을 알아야한다.
선물 받으려면 뭘 던져 줘야한다 (= 매개변수) 무슨 데이터를 줘야 하는가.
 
2교시
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
1. 이론보다는 기존 개발을 결과로 잘 내놓는 것(커스터마이징)
2. 업무능력(돌아가는 능력, 금융권 이자율..)
=> 소스분석, 역할 중심으로 공부했으면 좋겠다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 
메소드 예)
Xxx getX( ) { ~ } 일 때 !
Xxx <- 클래스명 아니면 인터페이스다.
getX() 호출하면 Xxx의 객체의 메위주를 선물받을거다.
{ } 안에 Xxx를 객체화하고 Xxx의 메위주를리턴하는 실행구문이 들어갈거다
Xxx <--가 인터페이스라면
인터페이스를 구현받은 클래스의 메위주를 선물받을거다
객체의 메위주를 가지고 뭐하려고? 그 객체의 속성변수나 메소드를 호출받으려고.
 
 
 
생성자를 하나더 만들겠다. public Sungjhk(){ }
똑같은 이름을 두개 생성자를 만드는 것 => 오버로딩.(overloading)
생성자는 0개이상이여야 한다.
 
메서드 overloading
같은 클래스 내부에 똑같은 이름의 생성자를 두개 이상 만드는 것.
 
<생성자 overloading이 성공하는 규칙>
생성자 이름 똑같이 만들어도 상관없지만
1. => 매개변수의 갯수가 다르거나
2. => 매개변수의 갯수가 똑같으면 매개변수의 자료형이 달라야한다.
=> 안그러면 에러가 난다.
 
메서드 overloading
같은 클래스 내부에 똑같은 이름의 메서드를 두개 이상 만드는 것.
 
<메서드 overloading이 성공하는 규칙>
메서드 이름 또한 똑같이 만들 수 있다.
1. 메서드의 매개변수의 갯수가 다르거나
2. 매서드의 매개변수가 똑같으면 매개변수의 자료형이 다르면 만들 수 있다.
 
3교시
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
si는 고객사로 출근 가끔 본사 회식.
solution는 주로 본사 / 고객사 가끔 왔다갔다 할 수 있다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
public class SungjukExe {
    public static void main(String[] args) {
 
//-------------------------------------------
Sungjuk sjk = new Sungjuk(1, 99, 88, 77);
//-------------------------------------------
// <1> 변수 sjk 선언하기 . 변수 안에 들어갈 데이터의 자료형은 Sungjuk임.
// new의 역할
// <2> new 에 의해 수입된 클래스 중에 Sungjuk(int 매변,int 매변,int 매변,int 매변) 형식의 (Sungjuk은 생성자 명이다.)
// 생성자를 가진 클래스를 찾아 메모리 공간으로 올려버린다.(= 객체화)
// Sungjuk sjk = new Sungjuk(1, 99, 88, 77.7); // 정수형이 아니므로 에러가 난다
//(4)00~
// <3> 메모리체에 올려진 객체에서
// Sungjuk(int 매변,int 매변,int 매변,int 매변)형식의 생성자를
// Sungjuk(1, 99, 88, 77.7)로 호출한다.
// 즉 외부에서 데이터가 주입된다.
// <4> Sungjuk 객체의 메위주를 리턴해서 sjk에 저장하기.
 
간단하게 한줄로 설명하면?
=> 변수 sjk 선언하고 -> 객체화 -> 성적개채의 메위주가 들어있는것
 
메소드 어떻게 호출하는데?
객체 메위주가 변수(sjk) 안에 들어있는데
->  메위주.메소드()
->  sjk.메소드명()
 
 
 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문 1> Sungjuk클래스에서 존재하는 생성자 3개를 모두 주석처리 할 경우
com.aaa.SungjukExe 클래스 안의  아래 코딩에서 에러가 발생하는가?
Sungjuk sjk4 = new Sungjuk();
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
에러발생 하지 않음
클래스 안의 생성자 코딩이 0개면 JVM이 public 생성자명 () { } 을 넣어준다
즉, default 생성자를 넣어준다.
 
 
 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문 2> Sungjuk클래스에서 존재하는 생성자 3개 중
public Sungjuk(){ } 를 주석처리 할 경우
com.aaa.SungjukExe 클래스 안의  아래 코딩에서 에러가 발생하는가?
Sungjuk sjk4 = new Sungjuk();
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
에러발생 함.
클래스 안의 생성자 코딩이 1개 이상이면 JVM이 public 생성자명 () { } 을 넣어주지 않는다.
즉, default 생성자를 넣어주지 않는다.
 
 
 
 
 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
현재 성적 클래스에
학생정보 들어온다. (학생번호, 학생 점수)
성적 클래스는 학생의 점수에 타겟이 맞춰져 있다.
 
1) 새로운 패키지를 만든다. com.ccc.erp
2) 그안에 새로운 클래스 Dept를 만든다. - 부서정보를 관리하는 클래스.
 
//부서 번호
private int dept_no;
//부서 이름
private String dept_name;
//부서 위치
private String dept_loc;
 
생성자는 없어도 된다 0개면 디폴트로 주어지기 때문에.
 
먼저 메소드 부터 만든다.
//부서 번호를입력하는 메소드 만들기.
public int getDept_no() {
return dept_no;
}
//부서이름을 입력하는 메서드 만들기
public String getDept_name() {
return dept_name;
}
//부서위치를 입력하는 메서드 만들기
public String getDept_loc() {
return dept_loc;
}
 
 
 
//부서번호를 수정하는 setter 메서드 만들기
public int setDept_no() {
return dept_no;
}
//부서이름을 입력하는 메서드 만들기
public String setDept_name() {
return dept_name;
}
//부서위치를 입력하는 메서드 만들기
public String setDept_loc() {
return dept_loc;
}
 
getter setter 메서드 다 지우고 
상단 source - generate getters and setters - 변수명 체크- generate 클릭하면
다시 살아난다.
 
4교시
DTO 이삿짐 센터.
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
// 속성변수 xxx, getXxx() {return ~ }, setXxx(){~} 이 한쌍으로 n개 존재하는 클래스를
// 객체화 했을 때 이걸 뭐라고 부르냐 *DTO* 라고 부른다. (= 객체명칭) 
// *DTO란 (Data Transfer Object)라고 부른다. 
// 주로 어디에 많이 써?
// "다량의 데이터"를 저장하여 옮겨 다닐 때 특히 "DB 연동 시" 아주 많이 사용한다. 
// 마치 이삿짐 박스와 유사한 역할을 한다.
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
 
 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
클래스 하나 더만들거야
직원정보 관리하는 클래스
com.ccc.erp;
public class Employee {
 
// 직원정보 (직원번호, 이름, 직급, 전화번호, 주민번호, 연봉 ) 
private int emp_no;
private String emp_name;
private String emp_jikup;
//전화번호(숫자일까 문자일까 전화번호로 곱할거야? 연산할거아니면 문자로취급하면된다)
private String phone;
private String jumin_num;
private int salary;
 
// ?? 
private Family family;
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
클래스 하나 더만들어줘
클래스 이름은 Family
가족정보를 관리하는 클래스
com.ccc.erp;
public class Family{
이걸 직원정보에 집어넣으면 되지 않냐? 직원정보인데 
직원들의 가족도 있지만 고객사의 가족도 있다.
employee에 넣어버리면 고객사때 사용못한다 재사용 불가.
독립시켜놓는게 좋다 근데문제가 있다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 
 
 
package com.ccc.erp;
public class Employee {
 
private int emp_no;
private String emp_name;
private String emp_jikup;
 
private String phone;
private String jumin_num;
private int salary;
 
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// ?? 
// -> Employee 클래스 안으로 객체의 메위주가 들어오기 시작했다. 이걸 참조형 데이터라고 한다.
private Family family; // 패밀리 클래스를 객체화 할거다 거기에 메위주를 집어넣을거다.
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
속성변수 만들면 바로 getter setter 를 만들어야한다
 
5교시_
 
package com.ccc.erp;
public class EmployeeExe {
 
public static void main(String[] args) {
 
// 패밀리 객체를 입력하고 아버지 정보를 입력
Family family = new Family(); //패밀리 클래스를 객체화 하는 코딩.
 
// setter 메서드를 통해 객체화.
family.setRelation("부");
family.setF_name("홍길동");
family.setBirth_year(1950);
 
// employee 클래스를 객체화 (employee 객체의 메위주)
Employee employee = new Employee();
 
// 클래스명.set+메서드명();
// 직업정
employee.setEmp_no(1);
employee.setEmp_name("이소정");
employee.setEmp_jikup("사장");
employee.setPhone("010-1234-1234");
employee.setJumin_num("960202-2222222");
employee.setSalary(9000);
 
// ***클래스명.set+클래스명();
// employee객체에 family의 메모리 위치 주소값을 저장.
// 가족 정보
employee.setFamily(family);
 
System.out.println("직원 번호 = " + employee.getEmp_no());
System.out.println("직원 명 = " + employee.getEmp_name());
System.out.println("직원 직급 = " + employee.getEmp_jikup());
System.out.println("직원 전화번호 = " + employee.getPhone());
System.out.println("직원 주민번호 = " + employee.getJumin_num());
System.out.println("직원 연봉 = " + employee.getSalary());
//가족명을 꺼내고싶다 //family객체를 가지고 메위주를 갖고와야한다.
System.out.println("가족명 = " + employee.getFamily().getF_name());
 
 .(점) 왼쪽은 메모리 주소 값 . 오른쪽은 속성변수나 메소드( ).

// 외부에서 들어온 데이터는 변수안에 넣고 써라 ( 표어 )
// 이퀄왼쪽 변수 오른쪽 데이터 .왼쪽 메위주 .오른쪽 속성변수나 메소드 (표어) 
// 메소드 호출하면 메위주 객체화(표어) (6)-19:00
 
꺼낼꺼면 
int emp_no = employee.getEmp();
변수안에 담아놔라
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
6교시_ 녹음파일 듣고 복습 - 코딩 주석달기
package com.ccc.erp;
 
public class EmployeeExe {
public static void main(String[] args) {
 
family 변수 선언하고
Family 객체 생성한 후 객체의 메위주를 리턴해서
family 변수안에 저장하기
Family family = new Family(); //패밀리 클래스를 객체화 하는 코딩.
 
// setter 메서드를 통해 객체화.
family.setRelation("부");
family.setF_name("홍길동");
family.setBirth_year(1950);
 
// employee 클래스를 객체화 (employee 객체의 메위주)
Employee employee = new Employee(); //employee 정보 땡겨온다.
 
// 클래스명.set+메서드명();
// 직업정보-
employee.setEmp_no(1);
employee.setEmp_name("이소정");
employee.setEmp_jikup("사장");
employee.setPhone("010-1234-1234");
employee.setJumin_num("960202-2222222");
employee.setSalary(9000);
// ***클래스명.set+클래스명();
// employee객체에 family의 메모리 위치 주소값을 저장.
// 가족 정보
employee.setFamily(family);
 
//꺼낼꺼면 변수안에 담아놔라.
int emp_no = employee.getEmp_no();
String emp_name = employee.getEmp_name();
String jikup = employee.getEmp_jikup();
String phone = employee.getPhone();
String jumin_num = employee.getJumin_num();
 
//family객체 매위주를 꺼내려면 어떻게 꺼내냐? ***어려움*
Family family2 = employee.getFamily();
String relation = family2.getRelation();
String f_name = family2.getF_name();
int birth_year = family2.getBirth_year();
 
 
System.out.println("직원 번호 = " + employee.getEmp_no());
System.out.println("직원 명 = " + employee.getEmp_name());
System.out.println("직원 직급 = " + employee.getEmp_jikup());
System.out.println("직원 전화번호 = " + employee.getPhone());
System.out.println("직원 주민번호 = " + employee.getJumin_num());
System.out.println("직원 연봉 = " + employee.getSalary());
//가족명을 꺼내고싶다 //family객체를 가지고 메위주를 갖고와야한다.
System.out.println("가족명 = " + employee.getFamily().getF_name());
 
}
 
}
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
7교시_
교재 17페이지부터 이론.~
 
