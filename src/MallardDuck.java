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
		this.swim(g);
	}
	@Override
	public void quack(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.drawString("²Ð²Ð", x+Duck.SIZE,y+Duck.SIZE);
		this.swim(g);
	}
	@Override
	public void fly(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.drawString("³¯´Ù", x+Duck.SIZE,y);
		this.swim(g);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		
	}
	}
		
	}

}
