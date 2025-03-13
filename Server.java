import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		int port = Integer.parseInt(args[0]);
		
		try (ServerSocket ss = new ServerSocket(port )) {
			Socket s = ss.accept();
			
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			byte b1[] = new byte[100];
			byte b2[] = new byte[100];
			
			while(true) {
				is.read(b1);
				String s1 = new String(b1);
				String s2 = s1.trim();
				System.out.println("From client : : "+s2);
				
				System.out.print("To client : ");
				System.in.read(b2);
				os.write(b2);
			}
		}
	}
}
