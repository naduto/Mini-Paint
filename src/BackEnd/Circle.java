package BackEnd;

import java.awt.*;
import java.util.*;

public class Circle extends shapes {

    public Circle(double radius) {
        super();
        this.addproperty("radius", radius);
    }

    @Override
    public String tostring() {
        String ret = "1-"+this.getshapename() + "-" + this.getRadius() + "-" + this.getColor() + "-" + this.getFillColor() + "-" + this.getposition().x + "-" + this.getposition().y;
        return ret;
    }

    @Override
    public void toshape(String []S) {
        this.setradius(Double.parseDouble(S[2]));
        this.setshapename(S[1]);
        S[3]=S[3].replaceAll("[^0-9,]", "");
        S[4]=S[4].replaceAll("[^0-9,]", "");
        String[] rgb = S[3].split(",");
        int r = Integer.parseInt(rgb[0]);
        int g = Integer.parseInt(rgb[1]);
        int b = Integer.parseInt(rgb[2]);
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255) {
            this.setColor(new Color(r, g, b));
        }
         rgb = S[4].split(",");
         r = Integer.parseInt(rgb[0]);
         g = Integer.parseInt(rgb[1]);
         b = Integer.parseInt(rgb[2]);
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255) {
            this.setFillColor(new Color(r, g, b));
        }
        this.setPosition(new Point(Integer.parseInt(S[5]),Integer.parseInt(S[6])));
        
    }

    public void setradius(double radius) {
        this.addproperty("radius", radius);
    }

    public double getRadius() {
        return this.getproperty("radius");
    }

    @Override
    public void move(int newx, int newy) {
        this.setPosition(new Point(newx, newy));
    }

    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2d = (Graphics2D) canvas;
        int diameter = (int) (2 * getRadius());

        g2d.setColor(this.getFillColor());
        g2d.fillOval(this.getposition().x - diameter / 2, this.getposition().y - diameter / 2, diameter, diameter);

        g2d.setColor(this.getColor());
        g2d.drawOval(this.getposition().x - diameter / 2, this.getposition().y - diameter / 2, diameter, diameter);
    }

    public void resize(double newradius) {
        this.setradius(newradius);
    }

}
