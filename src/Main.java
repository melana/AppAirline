package com.Globallogic.GlJavaProCamp.Entrytask.Airline;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	// Class describes GUI of application
	// There are 4 windows, each of which displays information, 
	// the transition from one to another comes by pressing the button

	Scene scene1, scene2, scene3, scene4;

	public static void main(String[] args) {
		launch(args);
	}

	public void init() {
	}
	
	public void start(Stage myStage) {
		
		myStage.setTitle("Airline");
		
	// Create new airline company
		Airline airline = new Airline();
		airline.setName("My company");
		List<Airplane> fleetOfAirplanes = new ArrayList <> ();
		airline.setFleetOfAirplanes(fleetOfAirplanes);
				
	// Fill airline's fleet of aircraft
		airline.fleetOfAirplanes.add(new Boeing747_200B());
		airline.fleetOfAirplanes.add(new Boeing747_200B());
		airline.fleetOfAirplanes.add(new Boeing767_300());
		airline.fleetOfAirplanes.add(new Boeing767_300());
		airline.fleetOfAirplanes.add(new Boeing767_300());
		airline.fleetOfAirplanes.add(new Boeing767_300());
		airline.fleetOfAirplanes.add(new Boeing737_400());
		airline.fleetOfAirplanes.add(new Boeing737_400());
		airline.fleetOfAirplanes.add(new Boeing737_400());
		airline.fleetOfAirplanes.add(new Boeing737_400());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_158());
		airline.fleetOfAirplanes.add(new An_158());
		airline.fleetOfAirplanes.add(new An_158());
		airline.fleetOfAirplanes.add(new An_158());

	// Describe scene1: this scene displays aircompany's aircraft sorted by flight range	
				
		Label label1 = new Label ("The aircompany's aircraft sorted by flight range:" + "\n" 
								  + new SortFlyRange().SortFlyRange(airline)  );
	
	// Buttons for navigation
		
		Button button12 = new Button ( "Get to know total capacity");
		button12.setOnAction(e -> myStage.setScene(scene2));
		Button button13 = new Button ( "Get to know total carrying capacity");
		button13.setOnAction(e -> myStage.setScene(scene3));
		Button button14 = new Button ( "Get to know  airplanes by hourly fuel consumption");
		button14.setOnAction(e -> myStage.setScene(scene4));
		
		VBox layout1 = new VBox (3);
		layout1.getChildren().addAll( button12, button13, button14, label1);
		
	// Scrolling	
		
		ScrollPane scrollPane1 = new ScrollPane();
		scrollPane1.setContent(layout1);
		scrollPane1.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
		scrollPane1.setHbarPolicy(ScrollBarPolicy.NEVER);
 
		scene1  = new Scene(scrollPane1, 515, 400);
		
		
	// Describe scene2: this scene displays the total capacity of all the aircraft in the airline
		
		Label label2 = new Label ("The total capacity  of all the aircraft in the airline is " 
								  + airline.totalCapacity() + " passengers.");
		
	// Buttons for navigation
		
		Button button21 = new Button ( "Get to know The aircompany's aircraft sorted by flight range");
		button21.setOnAction(e -> myStage.setScene(scene1));
		Button button23 = new Button ( "Get to know total carrying capacity");
		button23.setOnAction(e -> myStage.setScene(scene3));
		Button button24 = new Button ( "Get to know  airplanes by hourly fuel consumption");
		button24.setOnAction(e -> myStage.setScene(scene4));
		
		VBox layout2 = new VBox (3); 
		layout2.getChildren().addAll( button21, button23, button24, label2);
		scene2  = new Scene(layout2, 515, 400);
		
	// Describe scene3: this scene displays the	total carrying capacity of all the aircraft in the airline
		
		Label label3 = new Label ("The total carrying capacity of all the aircraft in the airline is "
								 + airline.totalCarryingCapacity() + "kg.");
	
	// Buttons for navigation	
		
		Button button31 = new Button ( "Get to know The aircompany's aircraft sorted by flight range");
		button31.setOnAction(e -> myStage.setScene(scene1));
		Button button32 = new Button ( "Get to know total capacity");
		button32.setOnAction(e -> myStage.setScene(scene2));
		Button button34 = new Button ( "Get to know  airplanes by hourly fuel consumption");
		button34.setOnAction(e -> myStage.setScene(scene4));
		
		VBox layout3 = new VBox (3); 
		layout3.getChildren().addAll(button31, button32, button34, label3);
		scene3  = new Scene(layout3, 515, 400);
		
		
	//	Describe scene4: at this scene user can Find airplanes corresponding to a given range of fuel consumption parameters
		
	// 	Fields for entering parameters
		
		Label label4 = new Label ("Please, enter the range of fuel consumption, kg/hour (min 1000, max 15000): \n");
		Label label41 = new Label ("From:");
		TextField from = new TextField();
		Label label42 = new Label ("To:");
		TextField to = new TextField();
		Button button44 = new Button ( "Check");
		Label label43 = new Label (" ");
		
	 // Processing of received data	
		
		button44.setOnAction(e -> { if (checking(from.getText(), to.getText())) {
			
			label43.setText("Airplanes corresponding to your range of fuel consumption parameters: \n " +
					new FilterFuelConsumption().FilterFuelConsumption(airline, 
					Integer.parseInt(from.getText()), Integer.parseInt(to.getText())));
					} 
					else{
					  label43.setText(" Please, enter correct data");
					}
		});
		
	// Buttons for navigation
		
		Button button41 = new Button ( "Get to know The aircompany's aircraft sorted by flight range");
		button41.setOnAction(e -> myStage.setScene(scene1));
		Button button42 = new Button ( "Get to know total capacity");
		button42.setOnAction(e -> myStage.setScene(scene2));
		Button button43 = new Button ( "Get to know total carrying capacity");
		button43.setOnAction(e -> myStage.setScene(scene3));
		
		VBox layout4 = new VBox (3); 
		layout4.getChildren().addAll(button41, button42, button43, label4, label41, from, label42, to, button44, label43);
		
	//Scrolling	
		
		ScrollPane scrollPane2 = new ScrollPane();
		scrollPane2.setContent(layout4);
		scrollPane2.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
		scrollPane2.setHbarPolicy(ScrollBarPolicy.NEVER);
		
		scene4  = new Scene(scrollPane2, 515, 400);
		
	
	// 	Make all buttons unify
		
		List <Button> buttons = new ArrayList<Button>();
		buttons.add(button12); 
		buttons.add(button13); 
		buttons.add(button14);
		buttons.add(button21); 
		buttons.add(button23); 
		buttons.add(button24);
		buttons.add(button31); 
		buttons.add(button32); 
		buttons.add(button34);
		buttons.add(button41);
		buttons.add(button42); 
		buttons.add(button43); 
		
		for (int i = 0; i < buttons.size(); i++ ) {
			buttons.get(i).setPrefSize(515.0, 40.0);
		}
		
		
		myStage.setScene(scene1);
		myStage.show();
		
	}
		
	// Method checks the input data
	
	public boolean checking (String from, String to) {

		try {
			int a = Integer.parseInt(from);
			int b = Integer.parseInt(to);
				if (a > b || a < 1000 || b > 15000 ) {
					System.out.println("Please, enter correct data");
					return false;
				}
			System.out.println("Correct");
			return true;
			
		}
		catch(NumberFormatException e) {
			System.out.println("Please, enter correct data");
			return false;
			
		}
		
	}
		
	
	public void stop() {
	}


}
