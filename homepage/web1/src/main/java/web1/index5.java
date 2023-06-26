package web1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class index5 {
	//FileReader = InputStream + InputStreamReader
	//FileWriter(기존데이터에서 추가가능) = OutputStream + OutputStreamWriter
	public static void main(String[] args) throws Exception {
		File f = new File("test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		br.close();
		fr.close();
	
		File z = new File("write.txt");
		FileWriter fw = new FileWriter(z,true); 
		//true : 기존데이터 유지하고 데이터추가(BufferedWriter,OutputStreamWriter는 추가되지않음)
		fw.write("Filewrite로 저장시킴");
		fw.close();
	}

}
