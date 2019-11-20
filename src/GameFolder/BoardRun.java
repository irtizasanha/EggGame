package GameFolder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings({ "unused", "serial" })
public class BoardRun extends JFrame{
	GameBoard b = new GameBoard();
	public BoardRun(){		
		add(b);		
		setSize(1000, 720);
		setResizable(false);		
		setVisible(true);
	}		
}
	
	