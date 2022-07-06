

                                          // FOR MAKING GAME FRAME



import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
			
        //GamePanel panel = new GamePanel();
	   this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//ADD COMPONENT TO JFRAME
		this.pack(); //
		this.setVisible(true); 
		this.setLocationRelativeTo(null);
		
	}
}