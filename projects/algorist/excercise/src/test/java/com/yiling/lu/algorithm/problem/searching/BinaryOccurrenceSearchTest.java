package com.yiling.lu.algorithm.problem.searching;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import CtCILibrary.AssortedMethods;

import com.yiling.lu.algorithm.sorting.comparasionbased.QuickSort;
import com.yiling.lu.algorithm.util.AssortedUtils;

public class BinaryOccurrenceSearchTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindRightIndex() {
		String[] array = { "a", "a", "a" };

		int rigthIndex = BinarySearch
				.searchRightMostOccurrenceIndex(array, "a");
		System.out.println("index of the right most occurrence: " + 1);
		Assert.assertEquals(2, rigthIndex);
	}

	@Test
	public void testFindRightIndex2() {
		String[] array = { "a" };

		int rigthIndex = BinarySearch
				.searchRightMostOccurrenceIndex(array, "a");
		System.out.println("index of the right most occurrence: " + 1);
		Assert.assertEquals(0, rigthIndex);
	}

	@Test
	public void testFindRightIndex3() {
		String[] array = { "a", "a", "a", "d", "e", "g", "g" };

		int rightIndex = BinarySearch
				.searchRightMostOccurrenceIndex(array, "g");
		System.out.println("index of the right most occurrence: " + rightIndex);
		Assert.assertEquals(6, rightIndex);

		rightIndex = BinarySearch.searchRightMostOccurrenceIndex(array, "a");
		System.out.println("index of the right most occurrence: " + rightIndex);
		Assert.assertEquals(2, rightIndex);

		rightIndex = BinarySearch.searchRightMostOccurrenceIndex(array, "d");
		System.out.println("index of the right most occurrence: " + rightIndex);
		Assert.assertEquals(3, rightIndex);

		rightIndex = BinarySearch.searchRightMostOccurrenceIndex(array, "e");
		System.out.println("index of the right most occurrence: " + rightIndex);
		Assert.assertEquals(4, rightIndex);

	}

	@Test
	public void testFindLeftIndex() {
		String[] array = { "a", "a", "a", "d", "e", "g", "g" };

		int left = BinarySearch.searchLeftMostOccurrenceIndex(array, "g");
		System.out.println("index of the right most occurrence: " + left);
		Assert.assertEquals(5, left);

		left = BinarySearch.searchLeftMostOccurrenceIndex(array, "a");
		System.out.println("index of the right most occurrence: " + left);
		Assert.assertEquals(0, left);

		left = BinarySearch.searchLeftMostOccurrenceIndex(array, "d");
		System.out.println("index of the right most occurrence: " + left);
		Assert.assertEquals(3, left);

		left = BinarySearch.searchLeftMostOccurrenceIndex(array, "e");
		System.out.println("index of the right most occurrence: " + left);
		Assert.assertEquals(4, left);

	}

	@Test
	public void testFindOccurrenceCount() {
		String[] array = { "6", "a", "b", "c", "a", "d", "d", "d", "x", "n",
				"m", "q", "d", "6" };

		QuickSort.qsort(array);

		System.out.println("sorting result "
				+ AssortedMethods.stringArrayToString(array));
		AssortedUtils.verifyOrder(array);
		
		int count1 = BinarySearch.countOccurrence(array, "6");
		int count2 = BinarySearch.countOccurrence(array, "6");
		
		Assert.assertEquals(count2, count1);
		Assert.assertEquals(2, count1);
	}
	
	@Test
	public void testFindOccurrenceCount2() {
		String[] array = { "6", "a", "b", "c", "a", "d", "d", "d", "x", "n",
				"m", "q", "d", "6" };

		QuickSort.qsort(array);

		System.out.println("sorting result "
				+ AssortedMethods.stringArrayToString(array));
		AssortedUtils.verifyOrder(array);
		
		String target = "x";
		int count1 = BinarySearch.countOccurrence(array, target);
		int count2 = BinarySearch.countOccurrence(array, target);
		
		Assert.assertEquals(count2, count1);
		Assert.assertEquals(1, count1);
		
		System.out.println(count1 + " occurrences of " + target + " found.");
	}
	
	@Test
	public void testFindOccurrenceCount3() {
		String[] array = { "6", "a", "b", "c", "a", "d", "d", "d", "x", "n",
				"m", "q", "d", "6" };

		QuickSort.qsort(array);

		System.out.println("sorting result "
				+ AssortedMethods.stringArrayToString(array));
		AssortedUtils.verifyOrder(array);
		
		String target = "c";
		int count1 = BinarySearch.countOccurrence(array, target);
		int count2 = BinarySearch.countOccurrence(array, target);
		
		Assert.assertEquals(count2, count1);
		Assert.assertEquals(1, count1);
		
		System.out.println(count1 + " occurrences of " + target + " found.");
	}	

}