package tools;

import application.Main;
import javafx.scene.image.Image;
import javafx.scene.text.Font;

/**
 * A class to easily load images and fonts from the resources folder in the application package
 */
public final class Load {
	
	/**
	 * Really basic image loader, loads the image straight from file without cropping
	 * @param path:	Path to the image
	 * @return:		Image
	 */
	public static Image newImage(String name) {
		return new Image(Main.class.getResourceAsStream("resources/" + name));
	}
	
	/**
	 * Loads an image by specified path, includes cropping
	 * @param path:		path to the image, starting at application/resources/
	 * @param startx:	start x coordinate by pixel 
	 * @param starty:	start y coordinate by pixel
	 * @param width:	width of the resulting image
	 * @param height:	height of the resulting image
	 * @return:			Image
	 */
	public static Image newImage(String name, int startx, int starty, int width, int height) {
		Image i = new Image(Main.class.getResourceAsStream("resources/" + name)); 
		return ImageCrop.cropImage(i, startx, starty, width, height);
	}
	
	/**
	 * Loads the requested font object
	 * @param path:		Path starting at application/resources/fonts/
	 * @param size:		Size of the font
	 * @return:			Font Object
	 */
	public static Font newFont(String path, int size) {
		return Font.loadFont(Main.class.getResourceAsStream("resources/fonts/" + path), size);
	}
}
