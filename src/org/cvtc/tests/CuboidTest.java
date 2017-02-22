package org.cvtc.tests;

import static org.junit.Assert.*;

//import org.junit.Test;
import org.cvtc.shapes.*;
import org.cvtc.tests.substitutes.MessageBoxSub;
import org.junit.Test;

public class CuboidTest {

	// Tests the width of the Cuboid class
	@Test
	public void widthOfCuboid() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, 2.0f, 2.0f, 2.0f);
		float expected = 2.0f;
		
		//2.Act
		float actual = cuboid.getWidth();
		
		//3.Assert
		assertTrue("Error with cuboid width", actual==expected);
		
		
	}
	
	// Tests the height of the Cuboid class
	@Test
	public void heightOfCuboid() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, 3, 3, 3);
		float expected = 3.0f;
		
		//2.Act
		float actual = cuboid.getHeight();
		
		//3.Assert
		assertTrue("Error with cuboid height", actual==expected);
	}
	
	// Tests the depth of the Cuboid class
	@Test
	public void depthOfCuboid() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, 4, 4, 4);
		float expected = 4.0f;
		
		//2.Act
		//cuboid.setDepth(4.0f);
		float actual = cuboid.getDepth();
		
		//3.Assert
		assertTrue("Error with the cuboid depth", actual==expected);
	}
	
	// Test that the constructor doesn't take negative numbers
	@Test
	public void cuboidConstructor() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, -1.0f, -1.0f, -1.0f);
		float expected = 0.0f;
		
		//2.Act
		float actual = cuboid.getWidth();
		
		//3.Assert
		
		assertTrue("Error in cuboid constructor logic", actual==expected);
	}
	
	// Tests that the surface area works with positive numbers
	@Test
	public void cuboidSurfaceAreaPositive() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, 10, 10, 10);
		float expected = 600.00f;
		
		//2.Act
		float actual = cuboid.surfaceArea();
		
		//3.Assert
		assertTrue("Error in cuboid surface area Positive", actual==expected);
	}
	
	// Tests that the surface area method works with zeros;
	@Test
	public void cuboidSurfaceAreaZero() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, 0, 0, 0);
		float expected = 0.0f;
		
		//2.Act
		float actual = cuboid.surfaceArea();
		
		//3.Assert
		assertTrue("Error in cuboid sureface area Zero", actual==expected);
	}
	
	// Tests that the surface area method to see that negative numbers don't work
	@Test
	public void cuboidSurfaceAreaNegative() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, -10, -10, -10);
		float expected = 0.0f;
		
		//2.Act
		float actual = cuboid.surfaceArea();
		
		//3.Assert
		assertTrue("Error in cuboid sureface area Negative", actual==expected);
	}
	
	// Tests the method volume to make sure positive numbers work with it
	@Test
	public void cuboidVolumePositive() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, 10, 10, 10);
		float expected = 1000.00f;
		
		//2.Act
		float actual = cuboid.volume();
		
		//3.Assert
		assertTrue("Error in the cuboid volume Positive", actual==expected);
	}
	
	// Tests to see if zeros work with the volume method
	@Test
	public void cuboidVolumeZero() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, 0, 0, 0);
		float expected = 0.0f;
		
		//2.Act
		float actual = cuboid.volume();
		
		//3.Assert
		assertTrue("Erroe in the cuboid volume Zero", actual==expected);
	}
	
	// Test to see make sure negative number won't work with the volume method
	@Test
	public void cuboidVolumeNegative() {
		
		//1.Arrange
		Cuboid cuboid = new Cuboid(null, -10, -10, -10);
		float expected = 0.0f;
		
		//2.Act
		float actual = cuboid.volume();
		
		//3.Assert
		assertTrue("Error in the cuboid volume Negative", actual==expected);
	}
	
	@Test(expected = Exception.class)
	public void expectedException() throws Exception {
		throw new Exception();
	}
	
	@Test
	public void MessageBoxTest() {
		//1.arrange
		Dialog dialog = new MessageBox();
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cuboid cuboid = new Cuboid(dialogSub, 10, 10, 10);
		
		//2.Act/Assert
		cuboid.render();
	}

}
