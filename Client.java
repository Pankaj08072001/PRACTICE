import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {

		String addr = args[0];
		int port = Integer.parseInt(args[0]);

		try (Socket s = new Socket(addr, port)) {
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();

			byte b1[] = new byte[100];
			byte b2[] = new byte[100];

			while (true) {
				System.out.print("To server : ");
				System.in.read(b1);
				os.write(b1);

				is.read(b2);
				String s1 = new String(b2);
				String s2 = s1.trim();
				System.out.println("From server  : " + s2);
			}
		}

	}
}