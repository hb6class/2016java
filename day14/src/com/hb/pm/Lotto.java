package com.hb.pm;

public class Lotto {

	public static void main(String[] args) {
		// ��ü ������ ���� 
		// �ζǹ�ȣ ������
				// 2��, 3��
				// main, ���, ��ü
				// ����� ���� 8:30 sbs ��� ����Ȧ ��÷
				// �������� �� 1~45����
				// ���� ���� 5�� 
				// 31, 22, 41, 8, 10
				// ��xxȸ �ζǴ�÷��ȣ�� 8, 10, 22, 31, 41 �Դϴ� ���ϵ帳�ϴ�.
				
				// 1. �� ���� �ߺ� �Ұ�
				// 2. ����
				// 3. sort ����
				// + ���ʽ� ��ȣ
				//
//			Ball[] box2 = new Ball[5];
			Ball[] box = new Ball[45];
			String[] colorName ={"������","�Ķ���","�����","������","�ʷϻ�"};
			for(int i=0; i<45; i++){	// �� ��ü ������ �ڽ��� ���
//				Ball ball = new Ball();
//				ball.num=i+1;
//				ball.color=colorName[(i+1)/10];
				box[i]= new Ball(i+1, colorName[(i+1)/10]);
			}
			int cnt=0;
			while(cnt<5){	// ���� �̾Ƽ� �����ִµ� �ѹ��̾Ҵ� ���� �ٽ� �̴´�
				int idx =(int)(Math.random()*45); // 0~ 44;
				if(box[idx].mark){
					box[idx].show();
					box[idx].setMark();
					cnt++;
				}
			}
//			Ball temp=null;
//			for(int i=0; i<10000; i++){	// �ڽ� ����
//				int idx =(int)(Math.random()*44)+1;
//				temp=box[0]; 
//				box[0] = box[idx];
//				box[idx] = temp;
//			}
//			for(int i=0; i<5; i++){	// 5�� �����ϱ�
//				box2[i]=box[i];
//			}
//			for(int i=0; i<box2.length; i++){	// ����ϱ�
//				box2[i].show();
//			}
	}
}

