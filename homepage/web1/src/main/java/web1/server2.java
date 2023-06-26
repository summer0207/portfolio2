package web1;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server2 {
	//TCP - server
	public static void main(String[] args) {
		chat_server2 cs = new chat_server2(8000);

	}

}
class chat_server2{
	ServerSocket sk = null;
	Socket so = null;
	InputStream is = null;
	OutputStream os = null;
	OutputStreamWriter osw = null;
	String msg = null;
	
	public chat_server2(int port) {
		try {
			this.sk = new ServerSocket(port);
			System.out.println("SERVER START");
			while(true) {
				this.so = this.sk.accept();
				this.os = this.so.getOutputStream();
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				String msg = new String(data,0,n);
				System.out.println(msg);
			}
		} 
		catch (Exception e) {
		
		}
	}
}