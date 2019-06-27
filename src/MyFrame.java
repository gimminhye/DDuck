import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	// MallardDuck md = new MallardDuck();
	// 정적배열 : 실행도중에 크기변경이 불가능
	// MallardDuck[] arr = new MallardDuck[5];
	// 20마리를 랜덤으로
	


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
	 * (rd.nextInt() % 2 == 0) { //다음정수를 가져옴 arr[i] = new MallardDuck(); } else
	 * if (rd.nextInt() % 3 == 0) { arr[i] = new RedDuck(); } else if
	 * (rd.nextInt() % 4 == 0) { arr[i] = new RubberDuck(); } else { arr[i] =
	 * new DecoyDuck();
	 */
	/*
	 * } } } }
	 */

	
	
	
	@Override // 화면에 있는 내용물을 재정의 해서 내보내기 위하여 재정의. 화면구성은 여기서 해줌.
	public void paint(Graphics g) { // 얘는 프로그램에 그림그릴 수 있는거. 모니터에
									// 출력setvisible하고나서 쓸수 있음 . 화면 내렸다 올리면 새롭게
									// 생김
				if(mgr!=null){
					mgr.displayAllDucks(g);
					mgr.flyAllDucks(g);
					mgr.quackAllDucks(g);
					mgr.swimAllDucks(g);
				}

	/*	//display
		for(int i =0; i<arr.length; i++){
			arr[i].display(g);
			
			if(arr[i] instanceof QuackDuck){ //원래타입조사가능
				((QuackDuck)arr[i]).quack(g); //다운캐스팅
		
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
 * if(md!=null){ //참조할때는 md가 메모리에 있는지 꼭 물어봐야함 / 프로그래밍은 ~ 하지마라는 방식으로는 못하고, ~ 해!
 * 라고 명령을 해야함. md.display(g); //g가 모니터를 그릴수 있는 열쇠.이걸받아서 덕한테 줌 md.swim(g);
 * 
 * 
 * }
 * 
 * } }
 * 
 * };
 */
