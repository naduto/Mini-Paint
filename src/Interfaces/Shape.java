
package Interfaces;
import java.awt.*;
import java.util.*;
public interface Shape {
    public void setPosition(Point Position);
    public Point getposition();
    
    public void setProPerties(Map<String,Double>properties);
    public Map<String,Double> getproperties();
    
    public void setColor(Color color);
    public Color getColor ();
    
    public void setFillColor(Color color);
    public Color getFillColor();
    public void move(int newx,int newy);
    public void draw (java.awt.Graphics canvas);
            
}

