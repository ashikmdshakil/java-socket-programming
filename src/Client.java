import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		String ip = "127.0.0.1";
		int port = 9995;
		try {
			Socket socket = new Socket(ip, port);
			String name = "Ashik Muhammad";			
			OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
			PrintWriter writer = new PrintWriter(os);
			os.write(name);
			os.flush();
			writer.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
