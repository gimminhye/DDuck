import java.util.Random;

public class DuckManager {
	public DuckManager(){
		Duck[] arr = new Duck[20];
		
		public MyFrame() {
			// super(); //new frame()�θ�����ڸ� �̿��Ͽ� �ڽĿ��� Ȯ��� ����

			makeDucks();
			this.setSize(FRAME_WIDTH, FRAME_HEIGTH); // ������������ �����ϸ� 800,600�̶��
														// �������ѵ��� ���� �̸������� ���� ����ȭ��Ű��
														// ����
			this.setVisible(true);// �����쿡�� ȭ������ �����ٰ� ����ϴ°�
		}

		private void makeDucks() {
			Random rnd = new Random();
			for (int i = 0; i < arr.length; i++) {
				int type = rnd.nextInt(4); // 0,1,2,3

				switch (type) {
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
		//����Ʈ �ű�� 
		
	}
	
}
