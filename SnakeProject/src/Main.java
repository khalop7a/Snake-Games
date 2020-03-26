import javax.swing.JFrame;

public class Main {
	public Main() {
		
		JFrame frame = new JFrame(); // khoi tao cua so
		Gamepanel gamepanel = new Gamepanel();
		
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hanh dong mac dinh khi close Frame
		frame.setTitle("SNAKECODDING"); // khoi tao tieu de
		
		
		frame.pack(); //dong goi theo kich thuoc
		frame.setVisible(true); 
		frame.setLocationRelativeTo(null); // center on screen
	}
	public static void main(String[] args) {
		
		new Main();
	}

}
