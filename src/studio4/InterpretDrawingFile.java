package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File

		String shape = in.next();
		int blueValue = in.nextInt();
		int redValue = in.nextInt();
		int greenValue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double dOne = in.nextDouble();
		double dTwo = in.nextDouble();
		double dThree = in.nextDouble();
		double dFour = in.nextDouble();

		if (isFilled != true) {
			StdDraw.setPenColor(new Color(blueValue, redValue, greenValue));
			StdDraw.rectangle(dOne, dTwo, dThree, dFour);
		} else {
			StdDraw.setPenColor(new Color(blueValue, redValue, greenValue));
			StdDraw.filledRectangle(dOne, dTwo, dThree, dFour);
		}

	}
}