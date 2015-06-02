package api01.lang.system;

/*
 IO Stream
 - IO : Input + OutPut 의 약자
 - 프로그램에 속한 데이터를 외부로 보내거나 가지지 않는
 데이터를 내부로 받아들이는 형식
 - 스트림(Stream) 은 FIFO(First input First output) 구조
 	스트림은 단방향 구조를 한쪽으로만 흘러가는 구조
 - InputStream, OutputStream 두가지로 구성됨
 -보조스트림
  	실제 데이터를 입출력하는 기능은 없지만, 스트림의 기능을 향상시키거나
  	새로운 기능을 추가시킴.
 * */

/*
Byte 기반 스트림 : 입출력 단위가 1byte
IputStream, outputStream : 기본 입출력 스트림, 한글처리 불가능
BufferedIputStream, BufferedOutputStream : 버퍼기능 확대
FileIputStream, FileOutputStream : 내부에 파일을 수정 또는 정보 입출력
DataIputStream, DateOutputStream : 데이터 타입을 지정해서 입출력
 * */

/*
문자 기반 스트림 : char 가 2Byte 이므로 문자데이터에 어려움이
	발생하는 Byte 기반 스트림을 대체하기 위해 생성함. 문자데이터 전용스트림
Reader, Writer
 * */
public class IoStreamSyntax {

}
