import java.util.Random;

public class DuckManager {
	public DuckManager(){
		Duck[] arr = new Duck[20];
		
		public MyFrame() {
			// super(); //new frame()부모생성자를 이용하여 자식에서 확장및 변경

			makeDucks();
			this.setSize(FRAME_WIDTH, FRAME_HEIGTH); // 값유지보수를 생각하면 800,600이라고
														// 고정시켜두지 말고 이름값으로 값을 변수화시키면
														// 좋음
			this.setVisible(true);// 윈도우에게 화면으로 나간다고 얘기하는거
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
		//페인트 옮기고 
		
	}
	
}
