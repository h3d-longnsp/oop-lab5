package com.oop.lab5.ex2.point;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public void setBegin(Point begin) {
        begin.setXY(super.getX(), super.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public int getBeginY() {
        return super.getY();
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setX(x);
        super.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        double xDiff = getEndX() - getBeginX();
        double yDiff = getEndY() - getBeginX();

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        double xDiff = getEndX() - getBeginX();
        double yDiff = getEndY() - getBeginX();

        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return String.format("Line[start = %s, end = %s]", super.toString(), end.toString());
    }
}
