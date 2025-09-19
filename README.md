# Mini Paint Application

A simple yet powerful drawing application built with pure Java, featuring an intuitive GUI interface for creating and manipulating geometric shapes.

## Features

### Drawing Tools
- **Shape Creation**: Draw various geometric shapes including:
  - Circles
  - Triangles
  - Rectangles
  - Squares
  - Line segments

### Shape Manipulation
- **Resize**: Dynamically resize any drawn shape
- **Move**: Drag and reposition shapes on the canvas
- **Delete**: Remove unwanted shapes from your drawing
- **Recolor**: Change the color of existing shapes

### File Operations
- **Save Drawing**: Export your artwork to your computer for later use
- **Load Drawing**: Import previously saved drawings to continue editing
- **File-based Storage**: Uses I/O file operations as a lightweight database solution

## Technical Architecture

### Backend
- **Language**: Pure Java
- **Architecture**: Object-Oriented Programming (OOP) principles
- **Design Patterns**: Implements various design patterns for clean, maintainable code
- **Purpose**: Handles all business logic, shape calculations, and file operations

### Frontend
- **Interface**: Java GUI (Swing/AWT)
- **Purpose**: Provides user-friendly interface for drawing and shape manipulation

### Data Storage
- **Method**: File I/O operations
- **Purpose**: Serves as a simple database for saving and loading drawing data

### Programming Paradigms
- **Object-Oriented Design**: Utilizes inheritance, encapsulation, and polymorphism
- **Design Patterns**: Implements industry-standard patterns for robust architecture
- **Modular Structure**: Clean separation of concerns between GUI, business logic, and data handling

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

### Installation
1. Clone or download the project files
2. Compile the Java source files:
   ```bash
   javac *.java
   ```
3. Run the application:
   ```bash
   java MainClass
   ```
   *(Replace `MainClass` with your main class name)*

## How to Use

### Creating Shapes
1. Select the desired shape tool from the toolbar/menu
2. Click and drag on the canvas to create the shape
3. Release to finalize the shape

### Manipulating Shapes
- **To Move**: Click and drag the shape to a new position
- **To Resize**: Select the shape and use resize handles or controls
- **To Recolor**: Select the shape and choose a new color from the color palette
- **To Delete**: Select the shape and press delete or use the delete button

### File Operations
- **Save**: Go to File → Save to export your drawing
- **Load**: Go to File → Load to import a previously saved drawing

## File Format
The application uses a custom file format to store:
- Shape types and properties
- Position coordinates
- Size dimensions
- Color information
- Layer order

## Project Structure
```
mini-paint-app/
├── BackEnd/                   # Backend logic and operations
├── FrontEnd/                  # GUI components and user interface
├── Interfaces/                # Interface definitions for OOP design
├── src/
│   ├── MoveShapee.java       # Shape movement functionality
│   ├── Paint.java            # Main paint application logic
│   ├── ResizeCircle.java     # Circle resizing operations
│   ├── ResizeLineSegment.java # Line segment resizing
│   ├── ResizeRectangle.java  # Rectangle resizing operations
│   ├── ResizeSquare.java     # Square resizing operations
│   ├── ResizeTriangle.java   # Triangle resizing operations
│   ├── Circle.java           # Circle shape implementation
│   ├── DrawingEngines.java   # Drawing engine logic
│   ├── LineSegment.java      # Line segment implementation
│   ├── Rectangle.java        # Rectangle shape implementation
│   ├── shapes.java           # Base shapes functionality
│   ├── Square.java           # Square shape implementation
│   ├── Triangle.java         # Triangle shape implementation
│   ├── DrawingEngine.java    # Core drawing engine
│   └── Shape.java            # Base shape class/interface
├── saved_drawings/           # Default save directory
└── README.md
```

## Screenshots

### Main Interface
![Main Interface](screenshots/main-interface.png)
*Caption: The main application window showing the drawing canvas and available tools.*

### Save and Load Windows
![Save Window](screenshots/save-window.png)
*Caption: Save dialog window for exporting drawings to file.*

![Load Window](screenshots/load-window.png)
*Caption: Load dialog window for importing previously saved drawings.*

### Recolor Window
![Recolor Window](screenshots/recolor-window.png)
*Caption: Color selection window for changing shape colors.*

### Move Window
![Move Window](screenshots/move-window.png)
*Caption: Interface showing shape movement functionality.*

### Resize Window
![Resize Window](screenshots/resize-window.png)
*Caption: Window demonstrating shape resizing controls and options.*

### Drawing Example
![Drawing with Shape](screenshots/drawing-example.png)
*Caption: Application window after drawing a shape, showing the canvas with a created shape.*

**To add these screenshots to your README:**

1. Create a `screenshots` folder in your project root directory
2. Take screenshots of each window/functionality and save them with these names:
   - `main-interface.png`
   - `save-window.png`
   - `load-window.png`
   - `recolor-window.png`
   - `move-window.png`
   - `resize-window.png`
   - `drawing-example.png`

## Future Enhancements
- Additional shape types (ellipses, polygons)
- Layer management system
- Undo/Redo functionality
- Export to standard image formats (PNG, JPEG)
- Advanced color picker with gradients
- Shape grouping and ungrouping
- Grid and snap-to-grid functionality

## Contributing
Feel free to fork this project and submit pull requests for any improvements or bug fixes.

## License
This project is open source and available under the [MIT License](LICENSE).
