import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSorting {
	private Sorting test = null;
	private Sorting test2[];
	@Before
	public void setUp() throws Exception {
		test = new Sorting();
		test2 = new Sorting[2];
		Sorting.swapReferences(test2, 0, 1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int ans1[] = {1,2,3,4,5};
		int ans2[] = new int [100];
		for(int i=99;i>=0;i--)
			ans2[i]=i;
		int a[] = {5,4,3,2,1};
		test.isSorted(a);
		test.insertionSort(a);
		int b[] = new int[100];
		for(int i=99;i>=0;i--)
			b[i]=100-i;
		Sorting.quicksort(b);
		test.isSorted(a);
		assertArrayEquals(ans1, a);
		assertArrayEquals(ans2, b);
		
	}

}
