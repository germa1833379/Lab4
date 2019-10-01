import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

import javax.naming.TimeLimitExceededException;
import java.sql.Time;

public class Soleil {
    private Group gr;
    public Soleil(){
        Line r1=new Line(-10,0,-5,0);
        Line r2=new Line(-7.5,-7.5,-4,-4);
        Line r3=new Line(0,-10,0,-5);
        Line r4=new Line(7.5,-7.5,4,-4);
        Line r5=new Line(10,0,5,0);
        Line r6=new Line(7.5,7.5,4,4);
        Line r7=new Line(0,10,0,5);
        Line r8=new Line(-7.5,7.5,-4,4);
        Line[] rayons = new Line[]{r1,r2,r3,r4,r5,r6,r7,r8};
        for(int i=0;i<rayons.length;i++){
            rayons[i].setStroke(Color.ORANGERED);
        }
        Circle sun = new Circle(0,0,3);
        sun.setFill(Color.YELLOW);
        FillTransition fillTransition=new FillTransition(Duration.seconds(4),sun);
        fillTransition.setFromValue(Color.YELLOW);
        fillTransition.setToValue(Color.ORANGERED);
        fillTransition.setAutoReverse(true);
        fillTransition.setCycleCount(Timeline.INDEFINITE);
        fillTransition.play();

        gr = new Group(sun,rayons[0],rayons[1],rayons[2],rayons[3],rayons[4],rayons[5],rayons[6],rayons[7]);

    }
    public Group getGr(){
        return gr;
    }
}
