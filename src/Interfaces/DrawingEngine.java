
package Interfaces;
import BackEnd.shapes;
import java.awt.*;
import java.io.File;
public interface DrawingEngine {
    public void addShape(shapes shape);
    public void removeShape(shapes shape);
    public  void saveShapes(File file);
    public shapes[] getShapes();
    public void clear();
    public void refresh(java.awt.Graphics canvas);
}
