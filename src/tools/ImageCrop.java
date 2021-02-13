package tools;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.shape.Rectangle;

public final class ImageCrop {

	/**
	 * Crops an input image by the specified rectangle
	 * @param image:	input image to crop
	 * @param startX:	start x coordinate
	 * @param startY:	start y coordinate
	 * @param width:	width of the resulting image
	 * @param height:	height of the resulting image
	 * @return:			The new cropped image
	 */
	public static Image cropImage(Image image, int startX, int startY, int width, int height) {
		PixelReader pr = image.getPixelReader();
		if (pr != null) {
			WritableImage write = new WritableImage(pr, startX, startY, width, height);
			return write;
		} else {
			ImageView view = new ImageView(image);
			view.setClip(new Rectangle(startX, startY, width, height));
			return view.getImage();
		}
	}

}
