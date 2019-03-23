package pkgTestShape;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import pkgShape.Cuboid;

public class CuboidTest {
	//Test to see if constructor works properly
	@Test
	public void construction_test() {
		try {
			Cuboid cube1 = new Cuboid(3, 5, 7);
			int x = cube1.getiDepth();
			assertEquals(x, 7);
		} catch(Exception e) {
			System.out.print("Invalid iDepth value");
		}
	}
	
	//Validating exception will be thrown when iDepth < 0
	@Test(expected = IllegalArgumentException.class)
	public void constructorException_test() throws Exception {
		Cuboid cube2 = new Cuboid(3, 5, -2);
		}
	
	//get_iDepth test
	@Test
	public void get_iDepth_test() {
		try {
			Cuboid cube3 = new Cuboid(3, 5, 2);
			int x = cube3.getiDepth();
			assertEquals(x, 2);
		} catch(Exception e) {
			System.out.print("Invalid iDepth value");
		}
	}
	
	//set_iDepth test
	@Test
	public void set_iDepth_test() {
		try {
			Cuboid cube4 = new Cuboid(3, 5, 7);
			cube4.setiDepth(5);
			assertEquals(cube4.getiDepth(), 5);
		} catch(Exception e) {
			System.out.print("Invalid iDepth value");
		}
	}
	
	//test for surface area of Cuboid
	@Test
	public void cuboid_area_test() {
		try {
			Cuboid cube5 = new Cuboid(3, 5, 2);
			int x = (int) cube5.area();
			assertEquals(x, 30);
		} catch(Exception e) {
			System.out.print("Invalid iDepth value");
		}
	}
	
	//Validating exception will be thrown when the perimeter method is called
	@Test(expected = UnsupportedOperationException.class)
	public void cuboid_perimeter_test() throws Exception {
		Cuboid cube4597 = new Cuboid(3, 5, 3);
		cube4597.perimeter();
		}
	
	//Test for the sort by area method in Cuboid
	@Test
	public void sortByArea_test() {
		try {
			Cuboid testCube1 = new Cuboid(2, 2, 2);
			Cuboid testCube2 = new Cuboid(4, 4, 2);
			Cuboid testCube3 = new Cuboid(6, 6, 2);
			ArrayList<Cuboid> cubeList = new ArrayList<Cuboid>();
			cubeList.add(testCube3);
			cubeList.add(testCube1);
			cubeList.add(testCube2);
			Collections.sort(cubeList); //testCube1 has the smallest area and this test 
			assertEquals(cubeList.get(0), testCube1); //shows the sort method moved it to
		} catch(Exception e) {						  //index 0 where it should be.
			System.out.print("Invalid iDepth value");
		}
	}
	
	//Test for the sort by volume method in Cuboid
		@Test
		public void sortByVolume_test() {
			try {
				Cuboid testCube4 = new Cuboid(5, 5, 130);
				Cuboid testCube5 = new Cuboid(9, 8, 7);
				Cuboid testCube6 = new Cuboid(3, 4, 5);
				ArrayList<Cuboid> cubeList1 = new ArrayList<Cuboid>();
				cubeList1.add(testCube6);
				cubeList1.add(testCube5);
				cubeList1.add(testCube4);
				Collections.sort(cubeList1); //testCube4 has the largest volume 
				assertEquals(cubeList1.get(2), testCube4); //and this test shows it is at
			} catch(Exception e) {				//the end of the list, where it should be
				System.out.print("Invalid iDepth value");
			}
		}
}
