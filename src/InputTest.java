import javax.swing.JOptionPane;

public class InputTest {
     public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Enter your name:");
		System.out.println("Hello "+name);
	}
}
