package ImageLoader.adapter;

import ImageLoader.images.Images;
import ImageLoader.service.ServiceLoader;


public class AdapterImages implements ServiceLoader{
    Images images;
    public AdapterImages(Images images) {
        this.images = images;
    }

    @Override
    public void showImages(String images) {
        System.out.println(images);


    }
}
