/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.text.Font; 
import javafx.scene.text.Text; 
import javafx.scene.paint.Color; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout. GridPane;
import javafx.scene.text.FontPosture;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
/**
 *
 * @author ayza0
 */
public class AP_PROJECT extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
       
        
        Scene home ;
        Scene Confirmation7;  
        Scene sweet ;
        Scene sweetMenu ;
        Scene shooping;
        Scene pastriesMenu;
        Scene DYOC;
        
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Desing your own cake scene !!!!!!!!!!!!!!!!!!!!!!!!!!!!         
        BorderPane rooot4 =new BorderPane();
       Button Back4 = new Button("<-Back[sweet]"); // go to seen cart
       Back4.setStyle("-fx-background-color:Pink;  -fx-border-width: 5px; -fx-font-size: 1.5em; -fx-font-family: Monospace; ");
        
        Button Home4 = new Button("Home page"); // go to Home page
        Home4.setStyle("-fx-background-color:Pink; -fx-border-width: 5px; -fx-font-size: 1.5em;  -fx-font-family: Monospace;");
        
        
        Button shcart = new Button("Shopping Cart"); // send the order
        shcart.setStyle("-fx-background-color:Pink; -fx-font-size: 2em; -fx-font-family: Monospace;" );
        
         
         
         
HBox h4= new HBox();
h4.setSpacing(10);
h4.setAlignment(Pos.CENTER);
h4.setPadding( new Insets(15,15,15,15));
h4.getChildren().addAll(shcart);

HBox h24= new HBox();
h24.setSpacing(10);
h24.setAlignment(Pos.CENTER);
h24.setPadding( new Insets(15,15,15,15));
h24.getChildren().addAll(Back4,Home4);
    
        rooot4.setTop(h4);
        rooot4.setBottom(h24);
        StackPane root4=new StackPane();
         root4.getChildren().add(rooot4);
         root4.setStyle("-fx-background-image: url(bb.jpg);");
         //send order
         shcart.setOnAction(e -> {
             
        });

        // go to Back(cart page)
        Back4.setOnAction(e -> {
            //primaryStage.setTitle("hhhhh");
           // primaryStage.setScene(scene1);
        });
        // go to home page
        Home4.setOnAction(e -> {
            //primaryStage.setTitle("Clinics Reception");
            //primaryStage.setScene(HomeScene);
        });
        
      
       
         DYOC = new Scene(root4, 700, 600);
        
        primaryStage.setTitle("Desing your own cake");
        
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // pastries menu !!!!!!!!!!!!!!!!!!!!!!!!!!!!  
  Button bh = new Button(" Home");
  bh.setStyle("-fx-border-color: BLACK; -fx-border-width: 2px;-fx-font-size: 2em; -fx-background-color: FFE4E1; -fx-text-fill: BLACK;");
  
   StackPane sp = new StackPane();
        sp.getChildren().addAll(bh);
      pastriesMenu = new Scene( sp,700, 600);
         sp.setStyle("-fx-background-image:url('bb.jpg'); -fx-background-repeat: no-repeat; -fx-background-size: 700 700; -fx-background-position: center center;");    
        
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // sweet menu !!!!!!!!!!!!!!!!!!!!!!!!!!!!       
    
        
        
       BorderPane rooot5 =new BorderPane();
       Button Back5 = new Button("<-Back[sweet]"); // go to seen cart
       Back5.setStyle("-fx-background-color:Pink;  -fx-border-width: 5px; -fx-font-size: 1.5em; -fx-font-family: Monospace; ");
        
        Button Home5 = new Button("Home page"); // go to Home page
        Home5.setStyle("-fx-background-color:Pink; -fx-border-width: 5px; -fx-font-size: 1.5em;  -fx-font-family: Monospace;");
        
        
        Button shcart1 = new Button("Shopping Cart"); // send the order
        shcart1.setStyle("-fx-background-color:Pink; -fx-font-size: 2em; -fx-font-family: Monospace;" );
        
         
         
         
HBox h5= new HBox();
h5.setSpacing(10);
h5.setAlignment(Pos.CENTER);
h5.setPadding( new Insets(15,15,15,15));
h5.getChildren().addAll(shcart1);

HBox h25= new HBox();
h25.setSpacing(10);
h25.setAlignment(Pos.CENTER);
h25.setPadding( new Insets(15,15,15,15));
h25.getChildren().addAll(Back5,Home5);
    
        rooot5.setTop(h5);
        rooot5.setBottom(h25);
        StackPane root5=new StackPane();
         root5.getChildren().add(rooot5);
         root5.setStyle("-fx-background-image: url(bb.jpg);");
         
      
       
         sweetMenu = new Scene(root5, 700, 600);
        
        primaryStage.setTitle("menue for sweets");
         
        
            
  
  
  
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Shooping Cart Scene !!!!!!!!!!!!!!!!!!!!!!!!!!!!
       
        
        //to add text 
        Text tx = new Text(); //Creating a Text object
        tx.setText("Shooping Cart"); //Setting the text to be added.
        tx.setX(55); //setting the position of the text
        tx.setY(350); //setting the position of the text 
        tx.setFont(Font.font("Times New Roman" ,FontWeight.BOLD,FontPosture.ITALIC, 50));
        VBox vb4=new VBox();
        vb4.getChildren().addAll(tx);
        //vb4.setAlignment(Pos.BOTTOM_CENTER);
        vb4.setPadding(new Insets(150, 20,120,140));
        
        
        //buttons
        Button bt1 = new Button("Edit Cart(delete)");
        Button bt2 = new Button("Back Home");
        Button bt3 = new Button("Confirmation");
        
        bt1.setStyle("-fx-border-color: BLACK; -fx-border-width: 2px;-fx-font-size: 2em; -fx-background-color: FFE4E1; -fx-text-fill: BLACK;");
        bt2.setStyle("-fx-border-color: BLACK; -fx-border-width: 2px;-fx-font-size: 2em; -fx-background-color: FFE4E1; -fx-text-fill: BLACK;");
        bt3.setStyle("-fx-border-color: BLACK; -fx-border-width: 2px;-fx-font-size: 2em; -fx-background-color: FFE4E1; -fx-text-fill: BLACK;");
        
        //Create VBox
        VBox vb1=new VBox(10);
        vb1.getChildren().addAll(bt1);
        vb1.setAlignment(Pos.CENTER);
        vb1.setPadding(new Insets(0, 0, 0,360));

        VBox vb2=new VBox(10);
        vb2.getChildren().addAll(bt2);
        vb2.setAlignment(Pos.CENTER);
        vb2.setPadding(new Insets(0, 0, 0, 200));
        
        VBox vb3=new VBox(10);
        vb3.getChildren().addAll(bt3);
        vb3.setAlignment(Pos.CENTER);
        vb3.setPadding(new Insets(0, 30, 30, 20));
        
        Group gr = new Group(vb1,vb2,vb3);
        
        BorderPane bp=new BorderPane();
        bp.setTop(vb4);
        bp.setBottom(gr);
        
        
        
        StackPane pn = new StackPane();
        pn.getChildren().addAll(bp);
        shooping = new Scene( pn,700, 600);
        pn.setStyle("-fx-background-image:url('bb.jpg'); -fx-background-repeat: no-repeat; -fx-background-size: 700 700; -fx-background-position: center center;");

        
        
        
        
        
        
         
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
         //scene Confirmation7
        
          BorderPane rooot =new BorderPane();
          Button Back = new Button("<-Back"); // go to seen cart
          Back.setStyle("-fx-font-size: 4em; -fx-background-color: FFE4E1; -fx-text-fill: BLACK;-fx-font-family: Monospace; ");
         
          Button Home = new Button("Home page"); // go to Home page
          Home.setStyle("-fx-font-size: 4em; -fx-background-color: FFE4E1; -fx-text-fill: BLACK;-fx-font-family: Monospace;");
          Button pay = new Button("pay"); // send the order
          pay.setStyle("-fx-font-size: 4em; -fx-background-color: FFE4E1; -fx-text-fill: BLACK;-fx-font-family: Monospace;" );
        
         Label fpay = new Label(" Send to order :");
         fpay.setStyle("-fx-font-size: 4em; -fx-font-family: Monospace; -fx-font-weight: 5px; -fx-font-weight: bold;" );
         
         
         HBox h= new HBox();
         h.setSpacing(10);
         h.setAlignment(Pos.CENTER);
         h.setPadding( new Insets(15,15,15,15));
         h.getChildren().addAll(fpay,pay);

         HBox h2= new HBox();
         h2.setSpacing(10);
         h2.setAlignment(Pos.CENTER);
         h2.setPadding( new Insets(15,15,15,15));
         h2.getChildren().addAll(Back,Home);
    
         rooot.setCenter(h);
         rooot.setBottom(h2);
         StackPane root2=new StackPane();
         root2.getChildren().add(rooot);
         root2.setStyle("-fx-background-image:url('bb.jpg'); -fx-background-repeat: no-repeat; -fx-background-size: 700 700; -fx-background-position: center center;");
         Confirmation7 = new Scene(root2, 700, 600);
        
         // primaryStage.setTitle("Confirmation");
/////////////////////////////////////////////////////////////////////////////////////////////         
            //scene 2 sweets
      // 2- scene Sweets
   BorderPane root3 = new  BorderPane();
    Text txx = new Text("Choose your sweet way "); 
    txx.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 60)); 
    root3.setTop(txx);
    Button ms = new Button("Menu");
    ms.setFont(new Font("Times New Roman", 40));
    ms.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, new CornerRadii(10), Insets.EMPTY)));
    Button ds = new Button("Design your own Cake");
    ds.setFont(new Font("Times New Roman", 40));
    ds.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, new CornerRadii(10), Insets.EMPTY)));
    HBox hb = new HBox(100);
    hb.setAlignment(Pos.CENTER);
    hb.getChildren().addAll(ms,ds);
    root3.setCenter(hb);
    
    Button ht = new Button("Home");
    ht.setFont(new Font("Times New Roman", 30));
    ht.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, new CornerRadii(5), Insets.EMPTY)));
    root3.setBottom(ht);
    root3.setStyle("-fx-background-image:url('bb.jpg'); -fx-background-repeat: no-repeat; -fx-background-size: 700 700; -fx-background-position: center center;");
     sweet = new Scene(root3, 700, 600);
         
/////////////////////////////////////////////////////////////////////////////////////////////
         //HOME SCENE
         
         //text
         Text text = new Text("      welcome to\n   sweet moment \n         bakery"); 
         text.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 80)); 
                  //Setting the position of the text 
         text.setX(55); 
         text.setY(350); 
                 //Setting color to the text 
         text.setFill(Color.BLACK); 
                 // text.setStrokeWidth(0.5); 
                 // text.setStroke(Color.BLACK); 
         VBox pane1 = new VBox();
         pane1.getChildren().addAll(text );
         pane1.setPadding(new Insets(80, 0, 0, 100));
       
     
         //buttons
         Button buttonsweet = new Button(" SWEETS-> ");
         Button buttonbaked = new Button(" <-PASTRIES ");
           //  buttonsweet.setMaxSize(400, 400);
           // buttonsweet.setMaxHeight(300);
           // buttonbaked.setMaxSize(400, 400);
           // buttonbaked.setMaxHeight(300);
         buttonsweet.setStyle("-fx-border-color: BLACK; -fx-border-width: 0px;-fx-font-size: 4em; -fx-background-color: FFE4E1; -fx-text-fill: BLACK;"); 
         buttonbaked.setStyle("-fx-border-color: BLACK; -fx-border-width: 0px;-fx-font-size: 4em; -fx-background-color: FFE4E1; -fx-text-fill: BLACK;"); 
       
         //pane for buttons
         VBox pane = new VBox();
         pane.getChildren().addAll(buttonsweet);
         pane.setPadding(new Insets(160, 50, 50, 450));
         // pane.setSpacing(5);
         VBox pane2 = new VBox();
         pane2.getChildren().addAll(buttonbaked);
         pane2.setPadding(new Insets(160, 60, 50, 50));
         // pane2.setSpacing(5);
         
         
       
         
         
         //group for pane button
         Group group = new Group(pane,pane2);
         
         //pane for group and text
         BorderPane p = new  BorderPane();
           p.setBottom(group);
           p.setTop(pane1);
         
           //stack pane for all scene
         StackPane root = new StackPane();
         root.getChildren().addAll(p );
        
        //scene home
         home = new Scene(root, 700, 600);
         root.setStyle("-fx-background-image:url('bb.jpg'); -fx-background-repeat: no-repeat; -fx-background-size: 700 700; -fx-background-position: center center;");
       //  primaryStage.setTitle("HOME PAGE");
       //  primaryStage.setScene(home );
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////   
         //ACTION BUTTON
         //action button sweet
         buttonsweet.setOnAction(e-> {
         primaryStage.setTitle("sweet");
         primaryStage.setScene(sweet);
         });
         
         //action button baked
         buttonbaked.setOnAction(e-> {
         primaryStage.setTitle("PASTRIES");
         primaryStage.setScene(pastriesMenu);
         });
 ///////////////////////////////////////////////////////////////////////       
         
          //send order
         pay.setOnAction(e -> {
           primaryStage.setTitle("HOME PAGE");
            primaryStage.setScene(home);  
        });

        // go to Back(cart page)
        Back.setOnAction(e -> {
            primaryStage.setTitle("shooping cart");
            primaryStage.setScene(shooping);
        });
        // go to home page
        Home.setOnAction(e -> {
            primaryStage.setTitle("HOME PAGE");
            primaryStage.setScene(home);
        });
 ///////////////////////////////////////////////////////////////////////           
        //action button back to Home Scene
        bt2.setOnAction(e->{
             primaryStage.setTitle("HOME PAGE");
            primaryStage.setScene(home);
                });
        bt1.setOnAction(e->{  //delet
            primaryStage.setTitle("HOME PAGE");
            primaryStage.setScene(home);
                });
        bt3.setOnAction(e->{
             primaryStage.setTitle("Confirmation");
            primaryStage.setScene(Confirmation7);
                });
 ///////////////////////////////////////////////////////////////////////           
         //////action (scene sweet)
         //action button mene 
         ms.setOnAction(e-> {
       primaryStage.setScene(sweetMenu);
        primaryStage.setTitle("Menu for Sweet");
         });
         //action button design
          ds.setOnAction(e-> {
       primaryStage.setScene(DYOC);
        primaryStage.setTitle("Design your own Cake");
         });
       //action button home
       ht.setOnAction(e-> {
           primaryStage.setTitle("HOME PAGE");
           primaryStage.setScene(home);
         });
 ///////////////////////////////////////////////////////////////////////           
         //////action (scene sweet menu)      
       
        
        
        //send order
         shcart1.setOnAction(e -> {
             primaryStage.setTitle("shooping cart");
            primaryStage.setScene(shooping);
        });

        // go to Back(cart page)
        Back5.setOnAction(e -> {
            primaryStage.setTitle("SWEET");
            primaryStage.setScene(sweet);
        });
        // go to home page
        Home5.setOnAction(e -> {
            primaryStage.setTitle("HOME PAGE");
            primaryStage.setScene(home);
        });
        
        
///////////////////////////////////////////////////////////////////////           
         //////action (scene pastries menu)      
       
        bh.setOnAction(e->{
            primaryStage.setTitle("HOME PAGE");
            primaryStage.setScene(home);
                }); 
 ///////////////////////////////////////////////////////////////////////           
         //////action scene DYOC        
        // go to Back(cart page)
        Back4.setOnAction(e -> {
            primaryStage.setTitle("sweets");
            primaryStage.setScene(sweet);
        });
        // go to home page
        Home4.setOnAction(e -> {
            primaryStage.setTitle("HOME PAGE");
            primaryStage.setScene(home);
        });
        
         shcart.setOnAction(e -> {
            primaryStage.setTitle("shooping cart");
            primaryStage.setScene(shooping);
        });
 //////////////////////////////////////////////////////////////////////////////////////////////////          
        
        
        
        //show scene
         primaryStage.setScene(home);
       //   primaryStage.setScene(sweetMenu);
         primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
