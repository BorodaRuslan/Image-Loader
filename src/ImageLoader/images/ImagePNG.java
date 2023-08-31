package ImageLoader.images;


public record ImagePNG(String nameImage, String formatImage) implements Images {
    @Override
    public String getImage() {
        return "Name file: " + nameImage + "," +  " Format file: " + "." + formatImage();
    }

}
