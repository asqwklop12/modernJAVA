package chapter13.pattern;

public class Sun implements Movable, Rotatable {
    private int x;
    private int y;

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
    public int getRotationAngle() {
        return angle;
    }

    @Override
    public void setRotationAngle(int angleInDegrees) {
        angle = angleInDegrees;
    }
}
