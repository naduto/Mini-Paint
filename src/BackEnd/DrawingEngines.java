
package BackEnd;
import Interfaces.DrawingEngine;
import Interfaces.Shape;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

public class DrawingEngines implements DrawingEngine {
    private ArrayList<shapes>shapes;
    public DrawingEngines()
    {
        this.shapes=new ArrayList<>();
    }
      @Override
    public void addShape(shapes shape1) {
        if (shape1 != null) {
            shapes.add(shape1);
        }
    }

    @Override
    public void removeShape(shapes shape1) {
        shapes.remove(shape1);
    }
    @Override
    public  void saveShapes(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (shapes shape : this.shapes) {
                String S=shape.tostring();
                writer.write(S);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Shapes saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving shapes!!!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    @Override
    public shapes[] getShapes() {
        shapes[]arr=shapes.toArray(new shapes[0]);
        return arr; 
    }
    public void clear()
    {
        this.shapes.clear();
    }

    @Override
    public void refresh(Graphics canvas) {
        for (shapes it : shapes) {
            it.draw(canvas);
        }
    }
}

