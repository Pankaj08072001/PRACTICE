package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws InterruptedException, AWTException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your msg !!");
		String s1 = sc.nextLine();
		System.out.println("How Many time you Send msg or call !");
		int time = sc.nextInt();

		StringSelection ss = new StringSelection(s1);
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(ss, null);

		Thread.sleep(3000);

		Robot r = new Robot();

		for (int i = 0; i < time; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);

			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

			sc.close();
			
			Thread.sleep(3000);
		}
	}
}
