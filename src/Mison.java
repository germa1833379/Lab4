import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Mison extends Group{
    private Group gr;
    public Mison(){


        Rectangle rec1 = new Rectangle(360,500,300,200);
        rec1.setFill(Color.BEIGE);
        rec1.setStroke(Color.BLACK);
        rec1.setStrokeWidth(3);

        Rectangle door = new Rectangle(380,600,50,100);
        door.setFill(Color.SADDLEBROWN);
        door.setStrokeWidth(3);
        door.setStroke(Color.BLACK);

        Circle doorKnob = new Circle(420,650,9,Color.YELLOWGREEN);
        doorKnob.setStrokeWidth(1);
        doorKnob.setStroke(Color.BLACK);

        Polygon toit = new Polygon(510,350,350,500,670,500);
        toit.setFill(Color.RED);
        toit.setStrokeWidth(3);
        toit.setStroke(Color.rgb(0,0,0));

        Rectangle fen = new Rectangle(500,560,120,80);
        fen.setFill(Color.LIGHTBLUE);
        fen.setStroke(Color.rgb(0,0,0,0.5));
        fen.setStrokeWidth(2);
        Line fenL1 = new Line(560,560,560,640);
        fenL1.setStrokeWidth(2);
        fenL1.setStroke(Color.rgb(0,0,0,0.5));
        Line fenL2 = new Line(500,600,620,600);
        fenL2.setStrokeWidth(2);
        fenL2.setStroke(Color.rgb(0,0,0,0.5));

        gr =new Group(rec1,door,doorKnob,toit,fen,fenL1,fenL2);
    }
    public Group getGr(){
        return gr;
    }
}
