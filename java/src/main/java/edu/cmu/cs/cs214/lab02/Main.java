package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape tegshontsogt = new Rectangle(23, 11);
        Shape booronhii= new Circle(6);
        Shape kwadrat = new Square(5);

        Renderer renderer = new Renderer(tegshontsogt);
        renderer.draw();
        Renderer renderer2 = new Renderer(booronhii);
        renderer2.draw();
        Renderer renderer3 = new Renderer(kwadrat);
        renderer3.draw();
    }
}