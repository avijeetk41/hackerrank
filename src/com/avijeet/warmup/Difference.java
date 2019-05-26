package com.avijeet.warmup;

public class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] elements) {
		this.elements = elements;
	}

	// Add your code here
	void computeDifference() {
		for (int i = 0; i < elements.length - 1; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				int diff = Math.abs(elements[i] - elements[j]);
				if (this.maximumDifference < diff) {
					this.maximumDifference = diff;
				}
			}
		}
	}
}