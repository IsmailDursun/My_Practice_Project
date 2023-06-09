package day33_tasks;

public class Rectangle {
    private int length, width;

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "\ncalculatedArea="+width*length+"\ncalculatedPerimeter="+(width+length)*2+
                '}';
    }

    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }
    public int getLength(){
        return length;
    }
    public int getWidth() {
        return width;
    }

    public void setLength(int length){
        if(length>0) this.length = length;
    }

    public void setWidth(int width) {
        if(width>0) this.width = width;
    }

    public int calculatedArea(){
        return length*width;
    }

    public int calculatedPerimeter(){
        return 2*(length+width);
    }

}
