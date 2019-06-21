import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck{
	public RedDuck(){
		super();
	}

	@Override
	public void display(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		this.swim(g);
	}

}
