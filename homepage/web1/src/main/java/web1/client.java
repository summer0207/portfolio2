package web1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class client {
	//클라이언트 - UDP
	public static void main(String[] args) {
		chat_client cc = new chat_client("localhost",8001);

	}

}
class chat_client{
	public String str;
	public BufferedReader br;
	public static int server = 8000;
	
	public chat_client(String ip,int port) {
		try {
			InetAddress ia = InetAddress.getByName(ip);
			DatagramSocket ds = new DatagramSocket(port);
			
			//서버 메세지 보내기
			System.out.println("message : ");
			br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
			byte msg[] = str.getBytes();
			DatagramPacket dp = new DatagramPacket(msg, msg.length,ia,server);
			ds.send(dp);
			
			//서버 메세지 받기
			msg = new byte[1024];
			dp = new DatagramPacket(msg, msg.length);
			ds.receive(dp);
			System.out.println("Servermsg : " + new String(dp.getData()));
			
		} 
		catch (Exception e) {
			
		}
	}
}