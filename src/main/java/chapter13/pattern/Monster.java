package chapter13.pattern;

public class Monster implements Rotatable, Movable, Resizable {
    private int x;
    private int y;

    private int width;
    private int height;

    private int angle;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

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
    public int getRotationAngle() {
        return angle;
    }

    @Override
    public void setRotationAngle(int angleInDegrees) {
        this.angle = angleInDegrees;
    }
}
