import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class DuckManager {

	Duck[] arr = new Duck[20];

	public DuckManager() {
		makeDucks();
	}
	/*
	 * public MyFrame() { // super(); //new frame()�θ�����ڸ� �̿��Ͽ� �ڽĿ��� Ȯ��� ����
	 * 
	 * makeDucks(); this.setSize(FRAME_WIDTH, FRAME_HEIGTH); // ������������ �����ϸ�
	 * 800,600�̶�� // �������ѵ��� ���� �̸������� ���� ����ȭ��Ű�� // ���� this.setVisible(true);//
	 * �����쿡�� ȭ������ �����ٰ� ����ϴ°�
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
