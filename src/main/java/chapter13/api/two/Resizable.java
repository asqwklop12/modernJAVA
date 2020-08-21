package chapter13.api.two;

public interface Resizable extends Drawable {
    int getWidth();

    void setWidth(int width);

    int getHeight();

    void setHeight(int height);

    void setAbsoluteSize(int width, int height);

    void setRelativeSize(int wFactor, int hFactor);
}
