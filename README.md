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

* **INPUT\_** : the PPM file given to students.
* **circle\_** : in these examples each pixel in the PPM is converted to grayscale, and then an SVG `<circle/>` element is generated.  
The circle's radius is proportional to the gray level of the pixel.
