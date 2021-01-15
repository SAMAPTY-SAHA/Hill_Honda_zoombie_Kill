package Main;
import javax.swing.JFrame;
public class Game {
    
    public static boolean loadGame = false;

	public static void main(String[] args)
	{
		JFrame window = new JFrame("Hill Honda Zombie Kill");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
	}

}
