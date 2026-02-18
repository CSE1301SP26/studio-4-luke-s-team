package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5,0.5,0.4,0.25);
		StdDraw.setPenColor(193, 235, 255);
		StdDraw.filledRectangle(0.2,0.35,0.1,0.1);
		StdDraw.filledRectangle(0.8,0.35,0.1,0.1);
		StdDraw.filledRectangle(0.2,0.65,0.1,0.1);
		StdDraw.filledRectangle(0.8,0.65,0.1,0.1);
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledEllipse(0.5,0.5,0.2,0.2);
		StdDraw.setPenColor(0,204,0);
		StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.1);
	}
}