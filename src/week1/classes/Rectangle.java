package week1.classes;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height) {
        // this.field or this.method()
        // this(): constructor
        this(width, height, "Blue");
    }

    public Rectangle(int width, int height, String color)  {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public void draw() {
        String firstLetter = color.substring(0, 1);
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print(firstLetter);
            }
            System.out.println();
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public void setColor(String color) {
        if (color.length() > 2 && color.length() < 20 && (color.charAt(0) >= 'A' && color.charAt(0) <= 'Z')) {
            this.color = color;
        } else {
            this.color = "Blue";
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }
}
