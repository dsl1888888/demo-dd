package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static double[] multiPros;

	public static void main(String[] args) {
//        multiPros = new double[2];
//        multiPros[0] = 0;
//        multiPros[1] = 1;
//        multiPros[2] = 3;
//        multiPros[3] = 5;
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(0);
//        obj.add(1);
//        obj.add(3);
//        obj.add(5);
		for (int i = 0; i < 10; i++) {
			int k = nextDiscrete(obj);
//            if (k == 1 )
			System.out.println(k);
		}
//        aaaasg();

	}

	public static void aaaasg() {
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);

		obj.forEach(o -> {
			if (o == 3)
				return;

			System.out.println(o);
		});
	}

	public static int nextDiscrete(List<Integer> probs) {
		int sum = 0;
		for (int i = 0; i < probs.size(); i++)
			sum += probs.get(i);

		double r = Math.random() * sum;
		sum = 0;
		for (int i = 0; i < probs.size(); i++) {
			sum += probs.get(i);
			if (sum > r)
				return i;
		}
		return probs.size() - 1;
	}
}
