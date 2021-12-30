package com.tech.one;

public class LabelBreak {

	public static void main(String[] args) {

		//label
		
		
		output:	//break 문에서 바깥 for문 까지 넘어감
			
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3)
					break output;
				System.out.println("ij" + i + "," + j);
			}
		}

	}

}
