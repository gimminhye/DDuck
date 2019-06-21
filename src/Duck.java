import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	
	public static final int SIZE =30; //모든 덕의 싸이즈는 같기 때문에 static 으로 쓰면 좋음(공유변수)
	
	public Duck(){ //여러 오리의 좌표값을 랜덤으로 찍어주기
		Random rnd = new Random();
		
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;//0~800사이의 픽셀을 뽑아야하는데 디폴트 최소값은 0임 .그래서 최대값은 ()안에 넣어야함
		y = rnd.nextInt(MyFrame.FRAME_HEIGTH-140)+70;//하지만 800까지로하면 객체들이 너무 테두리에 붙어서 나올수가 있음. 
													//x는 50~750 , y 는 제목표시줄.상태바가 있으니 70~530으로 좌표갑사오게 함.
	}
	public Duck(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void swim(Graphics g){
		g.drawString("수영", x-20, y+Duck.SIZE+2);
		
	}
	
	
	
	public abstract void display(Graphics g); //추상메소드로 바디 없에고 클래스에도 abstract 추가
		
	

}
