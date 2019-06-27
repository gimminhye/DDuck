import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class DuckManager {

	Duck[] arr = new Duck[20];

	public DuckManager() {
		makeDucks();
	}
	/*
	 * public MyFrame() { // super(); //new frame()부모생성자를 이용하여 자식에서 확장및 변경
	 * 
	 * makeDucks(); this.setSize(FRAME_WIDTH, FRAME_HEIGTH); // 값유지보수를 생각하면
	 * 800,600이라고 // 고정시켜두지 말고 이름값으로 값을 변수화시키면 // 좋음 this.setVisible(true);//
	 * 윈도우에게 화면으로 나간다고 얘기하는거
	 */

	private void makeDucks() {
		Random rnd = new Random();
		for (int i = 0; i < arr.length; i++) {
			 
			switch ( rnd.nextInt(4)) {
			case 0:
				arr[i] = new MallardDuck();
				break;
			case 1:
				arr[i] = new RedDuck();
				break;
			case 2:
				arr[i] = new RubberDuck();
				break;
			case 3:
				arr[i] = new DecoyDuck();
				break;
			default:

			}
		}
	}

	public void displayAllDucks(Graphics g) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].display(g);
		}
	}

	public void swimAllDucks(Graphics g) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].swim(g);
		}
	}

	public void quackAllDucks(Graphics g) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof QuackDuck){
			((QuackDuck)arr[i]).quack(g);
			}
		}
	}

	public void flyAllDucks(Graphics g) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof FlyDuck){
			((FlyDuck)arr[i]).fly(g);

			g.setColor(Color.black);
			}
		}
	}

};
