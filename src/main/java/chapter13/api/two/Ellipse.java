package chapter13.api.two;

public class Ellipse implements Resizable {

    private int width;
    private int height;

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setAbsoluteSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void setRelativeSize(int wFactor, int hFactor) {

    }

    @Override
    public void draw() {
        System.out.println(width * width * Math.PI);
    }
}
