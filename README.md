This is a collection of samples for the Nifty assignment "Converting PPM images to SVG images: a nifty assignment" 
at the 2017 CCSC:SE Conference to be held at Furman University November 3-4, 2017. 

The **source_images** folder contains the original images downloaded from the internet (attribution can be found in the folder). 
These files are often SVG images or large images that don't work well with the PPM/SVG assignment.  Therefore, the source files 
are converted to the images in **original_images** folder. Large images are scaled down and the original SVG images are exported 
as small PNG images.  The **original_images** are used to create the PPM files for the students.

The **example\_&ast;** folders contain examples of the PPM file that students are given as well as several possible conversions.
Inside each folder are a set of files, one PPM and several SVG files.  The PPM file is the file given to the students.  The SVG 
files are created by the students' programs.

In these examples, the files begin with common prefixes:

* **INPUT\_&ast;** : the PPM file given to students.
* **circle\_&ast;** : in these examples each pixel in the PPM is converted to grayscale, and then an SVG `<circle/>` element is generated. The circle's radius is proportional to the gray level of the pixel.
* **colorCircle\_&ast;** : in these examples the color of each PPM pixel is used to create an SVG `<circle/>` element element with the same color.
* **hatchOne\_&ast;** : in these examples the colors are reduced to 5 levels of gray.  Then for each color a particular set of lines are drawn.
    * 0 (white) - no lines are drawn
    * 1 - one horizontal line
    * 2 - Same as 1 with an added vertical line.  Result looks like a plus sign.
    * 3 - Same as 2 with an added diagonal line from top left to bottom right. Result looks like a plus sign with a slash though it.
    * 4 (Black/darkest gray)- Same as 3 with an added diagonal line from top right to bottime left. Result looks like a plus sign overlaid with an X.
* **hatchTwo\_&ast;** : in these examples the colors are reduced to 4 levels of gray, and these are used to draw several short random lines.  The number of lines drawn are based on the levels of gray.
* **hatchThree\_&ast;** : in these examples, 10,000 random lines are drawn at angles between 35 and 55 degrees.  The lines are longer than the square that holds the pixel.  A line's color is determined by color of the pixel coordinate closest to the line's midpoint  
