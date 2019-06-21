import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck{
	public RubberDuck(){
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
