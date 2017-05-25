import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;

import java.lang.reflect.Constructor;
import java.util.Random;


import javax.imageio.ImageIO;


/**
 * Searchs the current directory for images and converts them
 * to PPM images, with one pixel per line
 **/

public class SimplePPMConverter {

    public static void main(String[] args) {

        // search current directory for images.
        File sourceDirectory = new File(".");

        File[] sourceImages = sourceDirectory.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                String tmp = name.toLowerCase();
                return tmp.endsWith("jpg") || tmp.endsWith("gif")
                || tmp.endsWith("bmp") || tmp.endsWith("png");
                }
                });


        for (File file: sourceImages) {
            try {
                toPPM(file);
            } catch (Exception e) {
                System.err.println("-------------------------");
                System.err.println("ERROR processing " + file);
                e.printStackTrace(System.err);
                System.err.println("-------------------------");

            }
        }
    }

    public static void toPPM(File sourceFile) throws IOException {
        System.out.println("Processing " + sourceFile);


        BufferedImage colorImage = ImageIO.read(sourceFile);

        int height = colorImage.getHeight();
        int width = colorImage.getWidth();

        String sourceImage = sourceFile.getName();
        sourceImage = sourceImage.substring(0, sourceImage.lastIndexOf('.')); 
        String ppmFilename = sourceImage + ".ppm";

        PrintWriter out = new PrintWriter(ppmFilename);
        out.println("P3");
        out.println(width + " " + height);
        out.println("255" );

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color pixel = new Color(colorImage.getRGB(x, y)); 
                out.println(pixel.getRed() + " " + pixel.getGreen() + " " + pixel.getBlue());
            }
        }

        out.close();
    }


}

