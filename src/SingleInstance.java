import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SingleInstance {
	public static void main(String[] args){
		try {
			Process process = Runtime.getRuntime().exec("C:/windows/system32/ping.exe programcreek.com");
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			while((line = input.readLine())!=null){
				System.out.println(line);
			}
			input.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	

}
