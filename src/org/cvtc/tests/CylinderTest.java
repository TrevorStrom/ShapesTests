/**
 * 
 */
package org.cvtc.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.*;
import org.cvtc.shapes.MessageBox;
import org.cvtc.tests.substitutes.MessageBoxSub;
import org.junit.Test;

/**
 * @author Trevor
 *
 */
public class CylinderTest {

	// Test the height of the Cylinder
	@Test
	public void heightOfCylinder() {
		
		//1.Arrange
		Cylinder cylinder = new Cylinder(null, 1.0f, 2.0f);
		float expected = 2.0f;
		
		//2.Act
		float actual = cylinder.getHeight();
		
		//3.Assert
		assertTrue("Error with the cylinder height", actual==expected);
	}
	
	// Tests the radius of the Cylinder
	@Test
	public void radiusOfCylinder() {
		
		//1.Arrange
		Cylinder cylinder = new Cylinder(null, 2.0f, 1.0f);
		float expected = 2.0f;
		
		//2.Act
		float actual = cylinder.getRadius();
		
		//3.Assert
		assertTrue("Error with the cylinder radius", actual==expected);
	}
	
	// Tests that the constructor does take negative numbers
	@Test
	public void constructorCylinder() {
		
		//1.Arrange
		Cylinder cylinder = new Cylinder(null, -3.0f, -4.0f);
		float expected = 0.0f;
		
		//2.Act
		float actual = cylinder.getRadius();
		
		//3.Assert
		assertTrue("Error in cylinder constructor", actual==expected);
	}
	
	// Tests if a positive number works with the surface area method
	@Test
	public void surfaceAreaOfCylinderPositive() {
		
		//1.Arrange
		Cylinder cylinder = new Cylinder(null, 1.0f, 1.0f);
		float expected = 12.566371f;
		
		//2.Act
		float acutal = cylinder.surfaceArea();
		
		//3.Assert
		assertTrue("Error with surfaceArea of cylinder Positive", acutal==expected);
		
	}
	
	// Tests if a negative number doesn't work with the surface area method
	@Test
	public void surfaceAreaOfCylinderNegative() {
		
		//1.Arrange
		Cylinder cylinder = new Cylinder(null, -10.0f, -1.0f);
		float expected = 0.0f;
		
		//2.Act
		float acutal = cylinder.surfaceArea();
		
		//3.Assert
		assertTrue("Error with surfaceArea of cylinder Negative", acutal==expected);
		
	}
	
	// Tests if a zero number works with the surface area method
	@Test
	public void surfaceAreaOfCylinderZero() {
		
		//1.Arrange
		Cylinder cylinder = new Cylinder(null, 0.0f, 0.0f);
		float expected = 0.0f;
		
		//2.Act
		float acutal = cylinder.surfaceArea();
		
		//3.Assert
		assertTrue("Error with surfaceArea of cylinder Zero", acutal==expected);
		
	}
	
	// Tests if a positive number works with the volume method
	@Test
	public void volumeOfCylinderPositive() {
		
		//1.Arrange
		Cylinder cylinder = new Cylinder(null, 1.0f, 1.0f);
		float expected = 3.1415927f;
		
		//2.Act
		float actual = cylinder.volume();
		
		//3.Assert
		assertTrue("Error with volume of cylinder Positive", actual==expected);
	}
	
	// Tests if a negative number doesn't work with the volume method
	@Test
	public void volumeOfCylinderNegative() {
		
		//1.Arrange
		Cylinder cylinder = new Cylinder(null, -11.0f, -11.0f);
		float expected = 0.0f;
		
		//2.Act
		float actual = cylinder.volume();
		
		//3.Assert
		assertTrue("Error with volume of cylinder Negative", actual==expected);
	}
	
	// Tests to see if a zero works with the volume method
	@Test
	public void volumeOfCylinderZero() {
		
		//1.Arrange
		Cylinder cylinder = new Cylinder(null, 0.0f, 0.0f);
		float expected = 0.0f;
		
		//2.Act
		float actual = cylinder.volume();
		
		//3.Assert
		assertTrue("Error with volume of cylinder Zero", actual==expected);
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
		Cylinder cylinder = new Cylinder(dialogSub, 10, 10);
		
		//2.Act/Assert
		cylinder.render();
	}
	

}
