import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {

	public static void main(String[] args) throws IOException {
		while (true) {
			// TODO Auto-generated method stub
			BufferedReader reader = new BufferedReader(new InputStreamReader(new ServerSocket(9995).accept().getInputStream()));
			String name = reader.readLine();
			System.out.println("client name is : " + name);
		}

	}

}
