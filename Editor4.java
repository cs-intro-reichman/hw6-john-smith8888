import java.awt.Color;
public class Editor4 {

    /**
     * Demonstrates the morphing operation featured by Runigram.java. 
     * The program recieves 2 command-line arguments: a string representing the name
     * of the PPM file of a source image,
     * and the number of morphing steps (an int). 
     * For example, to morph ironman to greyscale in 50 steps, use:
     * java Editor4 ironman.ppm 50
     * Note: There is no need to scale the target image to the size of the source
     * image, since Runigram.morph performs this action.
     */
    
    
        public static void main (String[] args) {
            String source = args[0];
            int n = Integer.parseInt(args[1]);
            Color[][] sourceImage = Runigram.read(source);
            Color[][] targetImage = Runigram.grayScaled(sourceImage);
            Runigram.setCanvas(sourceImage);
            Runigram.morph(sourceImage, targetImage, n);
        }
    
}
