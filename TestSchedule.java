import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSchedule {
	private Schedule schedule = null;
	List<Work> test1;
	List<Work> test2;
	@Before
	public void setUp() throws Exception {
		schedule = new Schedule();
		test1 = new ArrayList();
		test2 = new ArrayList();
		for(int i=0;i<=10;i++)
		{
			Work temp1 = new Work(Integer.toString(i), i, i);
			Work temp2 = new Work(Integer.toString(10-i), 10-i, 10-i);
			test1.add(temp1);
			test2.add(temp2);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		schedule.FCFS(test1);
		schedule.SJF(test2);
		assertEquals(schedule.FCFS(test1), schedule.FCFS(test1));
		assertEquals(schedule.SJF(test2),schedule.SJF(test2));
		
	}

}
