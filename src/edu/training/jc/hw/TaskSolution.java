package edu.training.jc.hw;

/* Задача №4: Написать код для решения задачи. */

public class TaskSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int m = 2;
		
		double SmallBidon = 80 / n;
		double LargeBidon = SmallBidon + 12;
		double TotalLargeBidon = LargeBidon * m;
		
		System.out.println ("В больших бидонах находится " +TotalLargeBidon + " л. молока." );
	}

}
