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
public class SphereTest {

	// Test the radius method of the sphere class
	@Test
	public void radiusOfSphere() {
		
		//1.Arrange
		Sphere sphere = new Sphere(null, 2.0f);
		float expected = 2.0f;
		
		//2.Act
		float actual = sphere.getRadius();
		
		//3.Assert
		assertTrue("Error with sphere radius", actual==expected);
	}
	
	// Test that the constructor doesn't take negative numbers
	@Test
	public void contructorSphere() {
		
		//1.Arrange
		Sphere sphere = new Sphere(null, -3.0f);
		float expected = 0.0f;
		
		//2.Act
		float actual = sphere.getRadius();
		
		//3.Assert
		assertTrue("Error with sphere constructor", actual==expected);
	}
	
	// Tests that the surface area method works with positive numbers
	@Test
	public void surfaceAreaOfSpherePositive() {
		
		//1.Arrange
		Sphere sphere = new Sphere(null, 2.0f);
		float expected = 50.265484f;
		
		//2.Act
		float actual = sphere.surfaceArea();
		
		//3.Assert
		assertTrue("Error with sphere surface area Positive", actual==expected);
	}
	
	// Tests to prove that a negative number won't work with the surface area method
	@Test
	public void surfaceAreaOfSphereNegative() {
		
		//1.Arrange
		Sphere sphere = new Sphere(null, -12.0f);
		float expected = 0.0f;
		
		//2.Act
		float actual = sphere.surfaceArea();
		
		//3.Assert
		assertTrue("Error with sphere surface area Negative", actual==expected);
	}
	
	// Test that the surface area method works with zeros
	@Test
	public void surfaceAreaOfSphereZero() {
		
		//1.Arrange
		Sphere sphere = new Sphere(null, 0.0f);
		float expected = 0.0f;
		
		//2.Act
		float actual = sphere.surfaceArea();
		
		//3.Assert
		assertTrue("Error with sphere surface area Zero", actual==expected);
	}
	
	// Tests that the volume method works with positive numbers
	@Test
	public void volumeOfSpherePositive() {
		
		//1.Arrange
		Sphere sphere = new Sphere(null, 2.0f);
		float expected = 25.132742f;
		
		//2.Act
		float actual = sphere.volume();
		
		//3.Assert
		assertTrue("Error with the volume of sphere Positive", actual==expected);
	}
	
	// Tests that the volume method doesn't work with negative numbers
	@Test
	public void volumeOfSphereNegative() {
		
		//1.Arrange
		Sphere sphere = new Sphere(null, -122.0f);
		float expected = 0.0f;
		
		//2.Act
		float actual = sphere.volume();
		
		//3.Assert
		assertTrue("Error with the volume of sphere Negative", actual==expected);
	}
	
	// Tests that the volume method works with zeros
	@Test
	public void volumeOfSphereZero() {
		
		//1.Arrange
		Sphere sphere = new Sphere(null, 0.0f);
		float expected = 0.0f;
		
		//2.Act
		float actual = sphere.volume();
		
		//3.Assert
		assertTrue("Error with the volume of sphere Zero", actual==expected);
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
		Sphere sphere = new Sphere(dialogSub, 10);
		
		//2.Act/Assert
		sphere.render();
	}


}
