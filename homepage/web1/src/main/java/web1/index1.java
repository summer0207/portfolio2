package web1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class index1 {
	/*
	 Stream - byte 단위
	 Reader - char 형태
	 Exception을 사용 또는 try ~ catch
	 
	 Input : 입력
	 Output : 출력
	 Buffered : 메모리에 등록시켜서 사용하는 방식(단독 사용금지)
	 */

	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("문자를 입력하세요");
		/*
		InputStream is = System.in;
		int a;
		a = is.read();	//사용자가 입력값을 읽어옴 (int, byte)
		System.out.println(a);
		*/
		
		/*
		InputStream is2 = System.in;
		InputStreamReader ir = new InputStreamReader(is2);
		
		char c[] = new char[2];
		ir.read(c);
		System.out.println(c);
		*/
		
		//inputStream -> StreamReader -> BufferedReader
		/*
		InputStream is3 = System.in;
		InputStreamReader ir = new InputStreamReader(is3);
		BufferedReader br = new BufferedReader(ir);

		String result = br.readLine();
		System.out.println(result);
		*/
		
		//InputStreamReader = Stream + Reader
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String result = br.readLine();
		System.out.println(result);
	}
}
