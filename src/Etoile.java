import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class Etoile {
    int dur;
    public Etoile(int dur){
        this.dur=dur;
    }
    public Group getGr(){
        Group gr;
        Polygon star = new Polygon(0,-10,2.2,-3.1,9.5,-3.1,3.6,1.2,5.9,8.1,0,3.8,-5.9,8.1,-3.6,1.2,-9.5,-3.1,-2.2,-3.1);//http://www.songho.ca/math/line/files/StarGenerator01.png
        star.setFill(Color.LIGHTGOLDENRODYELLOW);
        FadeTransition fade = new FadeTransition(Duration.seconds(dur),star);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.setCycleCount(Timeline.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();
        gr = new Group(star);
        return gr;
    }
}
