import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Etoile {
    int dur;
    public Etoile(int dur){
        this.dur=dur;
    }
    public Group getGr(){
        Group gr;
        Polygon star = new Polygon(0,-10,2.2,-3.1,9.5,-3.1,3.6,1.2,5.9,8.1,0,3.8,-5.9,8.1,-3.6,1.2,-9.5,-3.1,-2.2,3.1);
        star.setFill(Color.WHITE);

        gr = new Group(star);
        return gr;
    }
}
