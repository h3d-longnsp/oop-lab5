package com.oop.lab5.ex1.point;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), this.z};
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", this.getX(), this.getY(), this.z);
    }
}
