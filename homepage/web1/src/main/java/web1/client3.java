package web1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class client3 {
//InputStream -> InputStremaReader -> BufferReader (TCP - 통신)
//Client
	public static void main(String[] args) {
		new chat_client3();
	}
}
class chat_client3{
	Socket sk = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	Scanner sc = new Scanner(System.in);
	
	public chat_client3() {
		try {
			//서버로 접속
			this.sk = new Socket("localhost",8000);
			//서버에 메세지 전달 및 받기
			this.br = new BufferedReader(new InputStreamReader(this.sk.getInputStream()));
			this.bw = new BufferedWriter(new OutputStreamWriter(this.sk.getOutputStream()));
			
			//서버 데이터 전송
			while(true) {
				//메세지 보내는 사항
				System.out.println("sendmessage : ");
				String msg = this.sc.nextLine();
				if(msg.equals("exit")) {
					this.br.close();
					this.bw.close();
					break;
				}
				this.bw.write(msg+"\n");	//줄바꿈 필수
				this.bw.flush();
				
				//서버에서 받는 메세지
				String msg2 = this.br.readLine();
				System.out.println("message : " + msg2);
			}
		} 
		catch (Exception e) {
			System.out.println("Server Error");
		}
		finally {
			try {
				this.sc.close();
				this.sk.close();
				this.br.close();
				this.bw.close();
			} 
			catch (Exception e) {
				System.out.println("Program Error");
			}
		}
	}
}
