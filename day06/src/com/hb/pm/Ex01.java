package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
		//�񱳿�����
		// >, <, <=, >=, !=, ==
		// true false
		
		boolean a = 3>1;
		int b = 3;
		//b++;
		int c = 1;
		++c;
		++c;
		boolean d=b==c;
		
		//��������
		// and, or 
		// &&, ||
		// ex) 5<5 && 1<=33;
		// && - ���� ��ΰ� true�� ��츸 true, �ƴϸ� false
		// || - ���߿� �ϳ��� true �̸� true, ��ΰ� false�ϰ�츸 false
		boolean e = 3>5&&2-1>0&&4<1||54-1>0;
		
		// ��� - ���ǹ�, �ݺ���
		// ���ǹ� - if�� switch��(case��)
		// if�� - ���� ~~(���� ��) �̶�� ~~~~����
		// if(����1){
		//		if(����2){
		//		}else{
		//		}
		//	}else{
		//		if(����2){
		//		}else{
		//		}
		//	}
		////////////////////////////////
		// if(����1-t && ����2-t){
		//	}else if(����1-t && ����2-f){
		//	}else if(����1-f && ����2-t){
		//	}else{//f,f
		//	}
		
		// Q1. x=5, y=9 , z=3
		// �̵��� �������� ����Ͻÿ�
		// 
		// Q2. x=5, y=9 , z=3
		// �̵��� �������� ����Ͻÿ�
		// �׻������ x < y < z������ ���
		// System.out.println("x < y < z :"+x+"<"+y+"<"+z);
		
		
		if(e){
			System.out.println("d�� ���Դϴ�");
		}
		
		
	}

}
