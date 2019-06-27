import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck  implements QuackDuck{
	public RubberDuck(){
		super();
	}
	@Override
	public void display(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);

	}

	@Override
	public void quack(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.drawString("»à»à", x+Duck.SIZE,y+Duck.SIZE);
		g.setColor(Color.black);
		
	}
}
