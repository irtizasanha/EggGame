package GameFolder;

public class EggMover extends Thread {	
	GameBoard gb;
    Egg egg;	   
    public EggMover(GameBoard gb,Egg egg){   	
    	this.gb = gb;
    	this.egg = egg;   	
    }    
    public void run(){    	
    	while(egg.getY_egg() < 900){    		
    		egg.setY_egg(egg.getY_egg() + 1);
    		gb.repaint();   		
    		try {
				Thread.sleep(7);
			} catch (Exception e) {				
				e.printStackTrace();
			}
    	} 	
    	  	
    }
}