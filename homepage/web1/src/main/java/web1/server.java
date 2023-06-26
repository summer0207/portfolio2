package web1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class server {
	//서버 - UDP
	public static void main(String[] args) {
		chat_server cs = new chat_server(8000);

	}

}
class chat_server{
	public chat_server(int port) {
		try {
			//UDP - port 오픈
			/*
			 1. DatagramPacket
			 2. port 지정(서버포트) <-> (클라이언트 별도 포트)
			 3. receive (받는 메세지), send (보내는 메세지)
			 4. byte단위로 전송
			 5. getData : 전송된 메세지를 String 문자열로 받음
			 */
			DatagramSocket ds = new DatagramSocket(port);
			while(true) {
				byte chat[] = new byte[1024];
				DatagramPacket dp = new DatagramPacket(chat, chat.length);
				System.out.println("START SERVER");
				ds.receive(dp);	//DatagramSocket 호출방식
				//문자 배열화 된 변수
				String msg = new String(dp.getData());
				//클라이언트에서 받은 메세지 출력
				System.out.println("POSTMESSAGE :" + msg);
				
				//접속자 아이피 확인
				InetAddress ia = dp.getAddress();
				port = dp.getPort();
				System.out.println("client_ip : " + ia + ", client_port : " + port);
				
				System.out.println("Server : ");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				byte svg[] = str.getBytes();
				dp = new DatagramPacket(svg, svg.length,ia,port);
				ds.send(dp);
			}
		} 
		catch (Exception e) {
			
		}
	}
}