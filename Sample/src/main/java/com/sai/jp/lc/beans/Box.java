package com.sai.jp.lc.beans;

import java.util.Objects;

public class Box {
    double width;
    double height;
    double depth;

    public Box () {
    }

    public Box ( double width, double height, double depth ) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    public double getWidth () {
        return width;
    }

    public void setWidth ( double width ) {
        this.width = width;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight ( double height ) {
        this.height = height;
    }

    public double getDepth () {
        return depth;
    }

    public void setDepth ( double depth ) {
        this.depth = depth;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.width, width) == 0 && Double.compare(box.height, height) == 0 && Double.compare(box.depth, depth) == 0;
    }

    @Override
    public int hashCode () {
        return Objects.hash(width, height, depth);
    }

    @Override
    public String toString () {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
