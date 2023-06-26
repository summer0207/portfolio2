package web1;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class client2 {
	//TCP - client
	public static void main(String[] args) {
		new chat_client2("localhost",8000);

	}

}
class chat_client2{
	//InputStream is = null;
	//InputStreamReader isr = null;
	BufferedReader br = null;
	String msg = null;
	Socket sk = null;
	OutputStream os = null;
	OutputStreamWriter osw = null;
	Scanner sc = null;
	public chat_client2(String ip,int port) {
		try {
		while(true) {
			this.sk = new Socket();
			Scanner sc = new Scanner(System.in);
			System.out.println("message : ");
			String msg = sc.nextLine();
			this.os = this.sk.getOutputStream();
			this.os.write(msg.getBytes());
		}
		}
		catch(Exception e) {
			
		}
	}
}

/*
 [server]
InputStream -> byte ->출력

[client]
OutputStream -> byte ->전송

통신 - Socket
getInputStream,getOutputStream : byte단위

Socket포함 getInputStream() -> InputStream
Socket포함 getOutputStream(); -> OutputStream
 */
