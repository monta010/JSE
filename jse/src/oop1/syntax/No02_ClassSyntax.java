package oop1.syntax;
/*
Date : 2015.05.18
Author : 
Desc : 클래스 선언 syntax
 * */

/*
클래스 선언
- 하나의 클래스는 하나의 파일로 생성된다.
- *.java 파일 하나 안에는 여러개의 클래스를 넣을 수 있는데,
	이런 경우 컴파일을 하면 소스는 하나이나
	컴파일의 결과로 만들어지는 클래스는 2개 이상이다.
- 하나의 파일 안에는 클래스가 2개이상 있게되면 반드시
	Public 키워드로 진입하는 클래스를 명시해야 한다.
- 클래스가 2개 이상 있는 경위 파일명은 public 이 명시된 
	클래스 명으로 저장된다.

 * */

public class No02_ClassSyntax {
	/*오라클 공식 자바 튜토리얼에 명시된 클래스 형식 예문*/
	
}
class MysuperClass{}
interface YourInterface{}
class MyClass extends MysuperClass implements YourInterface{
	//filed, constructor, ...
	//method declarations
}




