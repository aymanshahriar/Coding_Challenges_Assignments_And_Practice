import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class RecursionExercisesTest {

	//Check the submission file for the words "for" and "while"
	
	public void testCheckWords(){
		Scanner scan = null;
		try {
			scan = new Scanner (new FileInputStream("RecursionExercises.java"));
		} catch (FileNotFoundException e){
			fail("RecursionExercises.java not found");
		}
		
		while (scan.hasNext()){
			String line = scan.nextLine();
			
			if (line.contains("for") || line.contains("while")){
				fail("Found word \"for\" or \"while\": " + line);
			}
		}
		
		scan.close();
	}
	
	// Testing sum
	
	@Test 
	public void test_sum_negative() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		assertEquals("Testing sum starting and ending at negative number", 0, se.sum(-1 , -1));
		assertEquals("Testing sum starting at negative number", 0, se.sum(-2, 1));
		assertEquals("Testing sum ending at negative number", 0, se.sum(1, -5));
	}
	
	@Test 
	public void test_sum_zero() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		assertEquals("Testing sum starting at zero", 0, se.sum(0,0));
	}
	
	@Test 
	public void test_sum_one() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		assertEquals("Testing sum starting at one", 1, se.sum(1, 1));
	}
	
	@Test 
	public void test_sum_five() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		assertEquals("Testing sum one to ten", 15, se.sum(1,5));
	}
	
	// Testing sumOfMultiple1
	
	@Test 
	public void test_sumOfMultiple1_negative() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		assertEquals("Testing summing starting at negative number", 0, se.sumOfMultiple1(-1));
		assertEquals("Testing summing starting at negative number", 0, se.sumOfMultiple1(-2));
		assertEquals("Testing summing starting at negative number", 0, se.sumOfMultiple1(-5));
		assertEquals("Testing summing starting at negative number", 0, se.sumOfMultiple1(-10));
	}
	
	@Test 
	public void test_sumOfMultiple1_zero() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		assertEquals("Testing summing starting at zero", 0, se.sumOfMultiple1(0));
	}
	
	@Test 
	public void test_sumOfMultiple1_four() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		assertEquals("Testing sum of (multiple of five) numbers from zero to four", 0, se.sumOfMultiple1(4));
	}
	
	@Test 
	public void test_sumOfMultiple1_five() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		assertEquals("Testing sum of multiple of five numbers from zero to five", 5, se.sumOfMultiple1(5));
	}
	
	@Test 
	public void test_sumOfMultiple1_First_Three() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		assertEquals("Testing sum of multiple of five numbers from zero to twenty", 50, se.sumOfMultiple1(20));
	}
	
	
	//Testing sumOfMultiple2
	
	@Test
	public void test_sumOfMultiple2_Mix() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(10);
		list.add(15);
		list.add(5);
		
		assertEquals("Testing sumOfMultiple2 for {7,10,15,5}.", 30, se.sumOfMultiple2(list));	
	}
	
	@Test
	public void test_sumOfMultiple2_NoMultipleof5() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(12);

		
		assertEquals("Testing sumOfMultiple2 for {0,3,6,9,12}.", 0, se.sumOfMultiple2(list));
		
	}
	
	@Test
	public void test_sumOfMultiple2_OnlyMultipleOf5() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(20);
		
		assertEquals("Testing sumOfMultiple2 for {5,10,20}.", 35, se.sumOfMultiple2(list));
		
	} 
	
	@Test
	public void test_sumOfMultiple2_EmptyList() {
		//Test empty lsit
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		assertEquals("Testing sumOfMultiple2 for {}.", 0, se.sumOfMultiple2(list));
		
	}
	
	@Test
	public void test_sumOfMultiple2_NullList() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		
		assertEquals("Testing sumOfMultiple2 for null list.", 0, se.sumOfMultiple2(null));
		
	}
	
	//testing removeNonVowels
	@Test
	public void test_removeNonVowels_NullString() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		
		assertEquals("Testing removeNonVowels for null string.", null, se.removeNonVowels(null));
		
	}
	
	@Test
	public void test_removeNonVowels_EmptyString() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		
		assertEquals("Testing removeVowels for empty string.", "", se.removeNonVowels(""));
		
	}
	
	@Test
	public void test_removeNonVowels_NoVowels() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		
		assertEquals("Testing removeNonVowels for string with no vowels.", "bjwsr", se.removeNonVowels("bjwsr"));
		
	}
	
	@Test
	public void test_removeNonVowels_AllVowels() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		
		assertEquals("Testing removeNonVowels for string with all vowels.", "", se.removeNonVowels("aeiou"));
		
	}
	
	@Test
	public void test_removeNonVowels_VowelsAndConsonants() {
		testCheckWords();
		RecursionExercises se = new RecursionExercises();
		
		assertEquals("Testing removeNonVowels for string with vowels and consonants.", "s s ths  strng wth vwls?", se.removeNonVowels("Is is this A string with vowels?"));
	}
	

}
