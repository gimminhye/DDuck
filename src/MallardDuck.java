import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements QuackDuck, FlyDuck {
	
	public MallardDuck(){
		super();
	}

	@Override
	public void display(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		
	}
	@Override
	public void quack(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("²Ð²Ð", x+Duck.SIZE,y+Duck.SIZE);
		
	}
	@Override
	public void fly(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("³¯´Ù", x+Duck.SIZE,y);
		
	}


		

}
