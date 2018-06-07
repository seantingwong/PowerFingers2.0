package logic;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.System;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import org.junit.jupiter.api.Test;

import javafx.scene.Scene;

class ScoreMenuTest {
	
	@Test
	void test() {
		GridPane grid = new GridPane();
		int height = 600;
		int width = 500;
		
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);
		
		ScoreMenu M = new ScoreMenu();
		
		final Scene scene = new Scene(grid, height, width, Color.DIMGRAY);
		final Stage stage = new Stage();
		stage.setScene(scene);
		M.Score(stage, scene);
		
		assertEquals("top score button clicked", os.toString());
		
		PrintStream originalOut = System.out;
		System.setOut(originalOut);
	}

}
