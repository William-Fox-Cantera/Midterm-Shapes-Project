package pkgTestShape;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import pkgShape.Rectangle;

public class RectangleTest {
	//Test to see if constructor works properly
	@Test
	public void constructer_test() {
		try {
			Rectangle rec1 = new Rectangle(5, 3);
			int x = rec1.getiWidth();
			assertEquals(x, 5);
		} catch(Exception e) {
			System.out.print("Invalid Rectangle Dimensions");
		}
	}
	
	//Validating exception will be thrown when given dimension < 0
	@Test(expected = IllegalArgumentException.class)
	public void constructorException_test() throws Exception {
			Rectangle rec1 = new Rectangle(-5, 3);
	}
	
	//GetWidth test
	@Test
	public void GetWidth_test() {
		try {
			Rectangle rec1 = new Rectangle(5, 3);
			int x = rec1.getiWidth();
			assertEquals(x, 5);
		} catch(Exception e) {
			System.out.print("Invalid Rectangle Dimensions");
		}
	}
	
	//SetWidth test
	@Test
	public void SetWidth_test() {
		try {
			Rectangle rec1 = new Rectangle(5, 3);
			rec1.setiWidth(8);
			assertEquals(rec1.getiWidth(), 8);
		} catch(Exception e) {
			System.out.print("Invalid Rectangle Dimensions");
		}
	}
	
	//GetLength test
	@Test
	public void GetLength_test() {
		try {
			Rectangle rec1 = new Rectangle(5, 3);
			int x = rec1.getiLength();
			assertEquals(x, 3);
		} catch(Exception e) {
			System.out.print("Invalid Rectangle Dimensions");
		}
	}
	
	//SetLength test
	@Test
	public void SetLength_test() {
		try {
			Rectangle rec1 = new Rectangle(5, 3);
			rec1.setiLength(7);
			assertEquals(rec1.getiLength(), 7);
		} catch(Exception e) {
			System.out.print("Invalid Rectangle Dimensions");
		}
	}
	
	//Area test
	@Test
	public void Area_test() {
		try {
			Rectangle rec1 = new Rectangle(5, 3);
			int x = (int) rec1.area();
			assertEquals(x, 15);
		} catch(Exception e) {
			System.out.print("Invalid Rectangle Dimensions");
		}
	}
	
	//Perimeter test
	@Test
	public void Perimeter_test() {
		try {
			Rectangle rec1 = new Rectangle(9, 5);
			int x = (int) rec1.perimeter();
			assertEquals(x, 28);
		} catch(Exception e) {
			System.out.print("Invalid Rectangle Dimensions");
		}
	}
	
	//Testing to see if rectangles are being sorted in ascending order
	@Test
	public void sort_test() {
		try {
			Rectangle rec1 = new Rectangle(2, 2);
			Rectangle rec2 = new Rectangle(4, 4);
			Rectangle rec3 = new Rectangle(6, 6);
			ArrayList<Rectangle> recList = new ArrayList<Rectangle>();
			recList.add(rec3);
			recList.add(rec1);
			recList.add(rec2);
			Collections.sort(recList);
			assertEquals(recList.get(2), rec3);
		} catch(Exception e) {
			System.out.print("Invalid Rectangle Dimensions");
		}
	}
}
