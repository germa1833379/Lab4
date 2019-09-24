import com.sun.scenario.effect.Glow;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.stage.Stage;


public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setFullScreen(false);
        primaryStage.setResizable(true);
        primaryStage.setMaxHeight(1080);
        primaryStage.setMaxWidth(1920);
        primaryStage.setScene(
                new Scene(rootSetUp())
        );
        primaryStage.show();

    }
    public static Group rootSetUp(){
        DropShadow dropShadow=new DropShadow();
        dropShadow.setRadius(3);
        dropShadow.setOffsetX(-10);
        dropShadow.setOffsetY(20);
        dropShadow.setColor(Color.rgb(0,0,0,0.5));
        Group house1=new Mison().getGr();
        house1.setEffect(dropShadow);
        Group house2=new Mison().getGr();
        house2.setTranslateX(900);
        Rectangle rec1 = new Rectangle(960,0,960,1080);
        rec1.setFill(Color.BLACK);
        //JOur nuit
        Label jr = new Label("Jour");
        jr.setTranslateX(510);
        jr.setTranslateY(770);
        jr.setScaleX(10);
        jr.setScaleY(10);
        jr.setTextFill(Color.BLACK);
        Label nt = new Label("Nuit");
        nt.setTranslateX(880+510);
        nt.setTranslateY(770);
        nt.setScaleX(10);
        nt.setScaleY(10);
        nt.setTextFill(Color.WHITE);

        //Etoile
        Group e1 = new Etoile(2).getGr();
        e1.setTranslateX(200);
        e1.setTranslateY(200);



        //Lune
        Circle moon = new Circle(1700,180,100);
        LinearGradient grad=new LinearGradient(0,0,1,1,true,CycleMethod.NO_CYCLE,new Stop(1,Color.BLACK),new Stop(0,Color.GRAY));
        moon.setEffect(new javafx.scene.effect.Glow(0.7));
        moon.setFill(grad);
        Group root=new Group(house1,rec1,house2,moon,jr,nt,e1);
        return root;
    }
}
