import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	// MallardDuck md = new MallardDuck();
	// �����迭 : ���൵�߿� ũ�⺯���� �Ұ���
	// MallardDuck[] arr = new MallardDuck[5];
	// 20������ ��������
	


	DuckManager mgr=new DuckManager();
	
	
	public MyFrame(){
		//super(); //new Frame()
		this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	



	/*
	 * Random rd = new Random();
	 * 
	 * if (arr != null) { for (int i = 0; i < arr.length; i++) { if
	 * (rd.nextInt() % 2 == 0) { //���������� ������ arr[i] = new MallardDuck(); } else
	 * if (rd.nextInt() % 3 == 0) { arr[i] = new RedDuck(); } else if
	 * (rd.nextInt() % 4 == 0) { arr[i] = new RubberDuck(); } else { arr[i] =
	 * new DecoyDuck();
	 */
	/*
	 * } } } }
	 */

	
	
	
	@Override // ȭ�鿡 �ִ� ���빰�� ������ �ؼ� �������� ���Ͽ� ������. ȭ�鱸���� ���⼭ ����.
	public void paint(Graphics g) { // ��� ���α׷��� �׸��׸� �� �ִ°�. ����Ϳ�
									// ���setvisible�ϰ��� ���� ���� . ȭ�� ���ȴ� �ø��� ���Ӱ�
									// ����
				if(mgr!=null){
					mgr.displayAllDucks(g);
					mgr.flyAllDucks(g);
					mgr.quackAllDucks(g);
					mgr.swimAllDucks(g);
				}

	/*	//display
		for(int i =0; i<arr.length; i++){
			arr[i].display(g);
			
			if(arr[i] instanceof QuackDuck){ //����Ÿ�����簡��
				((QuackDuck)arr[i]).quack(g); //�ٿ�ĳ����
		
			}
			}
				*/		
		
	}
}

/*
 * g.setColor(Color.red); g.fillOval(100, 100, 50, 50); //(x.y.w.h)
 */
/*
 * if (arr != null) { for (int i = 0; i < arr.length; i++) { if (arr[i] != null)
 * { arr[i].display(g);
 * 
 * }
 * 
 * if(md!=null){ //�����Ҷ��� md�� �޸𸮿� �ִ��� �� ��������� / ���α׷����� ~ ��������� ������δ� ���ϰ�, ~ ��!
 * ��� ����� �ؾ���. md.display(g); //g�� ����͸� �׸��� �ִ� ����.�̰ɹ޾Ƽ� ������ �� md.swim(g);
 * 
 * 
 * }
 * 
 * } }
 * 
 * };
 */
