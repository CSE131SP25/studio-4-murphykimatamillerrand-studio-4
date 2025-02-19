package studio4;

import java.awt.Color;
import java.awt.Font;
import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		StdDraw.setCanvasSize(1250, 750);
		StdDraw.setPenColor(Color.BLACK);

		StdDraw.setPenColor(new Color(0, 255, 255));
		StdDraw.filledCircle(0.5, 0.5, 0.85);

		StdDraw.setPenColor(new Color(137, 207, 240));
		StdDraw.filledCircle(0.5, 0.5, 0.75);

		StdDraw.setPenColor(new Color(115, 147, 179));
		StdDraw.filledCircle(0.5, 0.5, 0.65);

		StdDraw.setPenColor(new Color(100, 149, 237));
		StdDraw.filledCircle(0.5, 0.5, 0.55);

		StdDraw.setPenColor(new Color(0, 71, 171));
		StdDraw.filledCircle(0.5, 0.5, 0.45);

		StdDraw.setPenColor(new Color(111, 143, 175));
		StdDraw.filledCircle(0.5, 0.5, 0.35);

		StdDraw.setPenColor(new Color(20, 52, 64));
		StdDraw.filledCircle(0.5, 0.5, 0.25);

		Font font = new Font("Times New Roman", Font.BOLD, 35);
		StdDraw.setFont(font);

		StdDraw.setPenColor(Color.WHITE);
		StdDraw.text(0.5, 0.5, "String countryName = in.nextString();");

	}
}