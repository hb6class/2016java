package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
			for(int i=0; i<=10; i++){
				try{
					System.out.println("arr["+i+"]="+arr[i]);
				}catch(ArrayIndexOutOfBoundsException ex){
					ex.printStackTrace(); // 콘솔창에 에러의 상세한 정보를 출력
					System.out.println("---------------");
					System.out.println(ex.toString());
					System.out.println("---------------");
					System.out.println(ex.getMessage());
				}
			}

	}

}
