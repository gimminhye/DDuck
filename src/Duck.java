import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	
	public static final int SIZE =30; //��� ���� ������� ���� ������ static ���� ���� ����(��������)
	
	public Duck(){ //���� ������ ��ǥ���� �������� ����ֱ�
		Random rnd = new Random();
		
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;//0~800������ �ȼ��� �̾ƾ��ϴµ� ����Ʈ �ּҰ��� 0�� .�׷��� �ִ밪�� ()�ȿ� �־����
		y = rnd.nextInt(MyFrame.FRAME_HEIGTH-140)+70;//������ 800�������ϸ� ��ü���� �ʹ� �׵θ��� �پ ���ü��� ����. 
													//x�� 50~750 , y �� ����ǥ����.���¹ٰ� ������ 70~530���� ��ǥ������� ��.
	}
	public Duck(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void swim(Graphics g){
		g.drawString("����", x-20, y+Duck.SIZE+2);
		
	}
	
	
	
	public abstract void display(Graphics g); //�߻�޼ҵ�� �ٵ� ������ Ŭ�������� abstract �߰�
		
	

}
