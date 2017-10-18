

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteTest {

	@Test 
	public void VectsizeTEST() {
		VectorHelper y = new VectorHelper(); 
		y.addVectElemnt(5);
		assertTrue(y.VectSize()==1);
		
		
	                           }
	@Test 
	public void TrieTest () {
		VectorHelper y = new VectorHelper(); 
		y.addVectElemnt(9);
		y.addVectElemnt(56);
		y.addVectElemnt(42);
		y.addVectElemnt(19);
		y.Trie();
		VectorHelper x =new VectorHelper () ;
		x.addVectElemnt(9);
		x.addVectElemnt(19);
		x.addVectElemnt(42);
		x.addVectElemnt(56);
		assertTrue(y.equals(x));
		
		
		
	}
	
	@Test 
	public void VectInverserTest () {
		VectorHelper y = new VectorHelper(); 
		y.addVectElemnt(1);
		y.addVectElemnt(2);
		y.addVectElemnt(3);
		y.addVectElemnt(4);
		y.addVectElemnt(5);
		y.addVectElemnt(6);
		y.VectInverser();
		VectorHelper x =new VectorHelper () ;
		x.addVectElemnt(6);
		x.addVectElemnt(5);
		x.addVectElemnt(4);
		x.addVectElemnt(3);
		x.addVectElemnt(2);
		x.addVectElemnt(1);
		assertTrue(y.equals(x));		
	}
	
	@Test 
	public void VectMaxTest () {
		VectorHelper y = new VectorHelper(); 
		y.addVectElemnt(8);
		y.addVectElemnt(48);
		y.addVectElemnt(489);
		y.addVectElemnt(85);
		y.addVectElemnt(02);
		y.addVectElemnt(48);
		int m=y.VectMax();
		assertTrue(m==489);
			}
	@Test 
	public void VectMinTest () {
		VectorHelper y = new VectorHelper(); 
		y.addVectElemnt(76);
		y.addVectElemnt(29);
		y.addVectElemnt(25);
		y.addVectElemnt(154);
		y.addVectElemnt(52);
		y.addVectElemnt(86);
		int m=y.VectMin();
		assertTrue(m==25);
			}
	@Test
	public void VectMUltipTest () {
		VectorHelper y = new VectorHelper(); 
		y.addVectElemnt(8);
		y.addVectElemnt(7);
		y.addVectElemnt(6);
		y.addVectElemnt(2);
		y.addVectElemnt(7);
		y.addVectElemnt(4);
		 y.VectMultiplication(2);
		 VectorHelper x = new VectorHelper();
		 x.addVectElemnt(16);
		 x.addVectElemnt(14);
		 x.addVectElemnt(12);
		 x.addVectElemnt(4);
		 x.addVectElemnt(14);
		 x.addVectElemnt(8);
		 assertTrue(y.equals(x));
			}
	@Test
	public void SommeTest () {
		VectorHelper y = new VectorHelper(); 
		y.addVectElemnt(12);
		y.addVectElemnt(26);
		y.addVectElemnt(20);
		y.addVectElemnt(12);
		y.addVectElemnt(0);
		y.addVectElemnt(23);
		 VectorHelper x = new VectorHelper();
		 x.addVectElemnt(16);
		 x.addVectElemnt(14);
		 x.addVectElemnt(12);
		 x.addVectElemnt(4);
		 x.addVectElemnt(14);
		 x.addVectElemnt(8);
		 try {
			y = y.Somme(x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 VectorHelper z = new VectorHelper();
		 z.addVectElemnt(28);
		 z.addVectElemnt(40);
		 z.addVectElemnt(32);
		 z.addVectElemnt(16);
		 z.addVectElemnt(14);
		 z.addVectElemnt(31);
			assertTrue(z.equals(y));
			}
}
