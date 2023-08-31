package ImageLoader;

import ImageLoader.adapter.AdapterImages;
import ImageLoader.images.ImageJPG;
import ImageLoader.images.ImagePNG;
import ImageLoader.images.Images;

public class AppRunner {
    public static void main(String[] args) {
        Images image1 = new ImagePNG("Dog", "png");
        Images image2 = new ImageJPG("Monkey", "jpg");

        AdapterImages adapter = new AdapterImages(image1);
        adapter.showImages(image1.getImage());
        adapter.showImages(image2.getImage());

    }
}
