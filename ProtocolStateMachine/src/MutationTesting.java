import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class MutationTesting {
	public Context mm;
	public ArrayList<String> stateListNames;
	
	@BeforeEach
	void setUp() throws Exception {
		this.mm = new Context();
		this.stateListNames = new ArrayList<String>();
	}	

	@Test
	void testIfState4_1_within_State3_Region1_entered_with_Op1() {
		try {
			mm.executeTransition(1);
			assertTrue(this.mm.activatedStateList.contains("State4_1"));
		}
		catch(Exception ex) {
			System.out.println("Test 1:" + ex.getMessage());
		}
		System.out.println("Test 1: Test if State 4_1 of region1 was entered:");
		System.out.println("PASSED");
		System.out.println("      ");
	}
	
	@Test
	void testIfState5_1_within_State3_Region2_entered_with_Op1() {
		try {
			mm.executeTransition(1);
			assertTrue(this.mm.activatedStateList.contains("State5_1"));
		}
		catch(Exception ex) {
			System.out.println("Test 2:" + ex.getMessage());
		}
		System.out.println("Test 2: Test if State 5_1 of region2  was entered:");
		System.out.println("PASSED");
		System.out.println("      ");
	}
	
	@Test	
	void testTransitionSequenceForOperations_1_3_2_5() {		
		try {
			//Testing Operation 1
			mm.executeTransition(1);		
			stateListNames.add("State1");
			stateListNames.add("State3");
			stateListNames.add("State4_1");
			stateListNames.add("State5_1");
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			
			//Testing Operation 3
			mm.executeTransition(3);
			stateListNames.add("State2");
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 2
			mm.executeTransition(2);		
			stateListNames.add("State3");
			stateListNames.add("State4_1");
			stateListNames.add("State5_1");
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 5
			mm.executeTransition(5);		
			stateListNames.add("State4_1");
			stateListNames.add("State5_2");		
			assertEquals(this.stateListNames, mm.activatedStateList);
		}
		catch(Exception ex) {
			System.out.println("Test 3:" + ex.getMessage());
		}
		
		System.out.println("Test 3: Transition Sequence Test For Operations 1,3,2,5:");
		System.out.println("PASSED");
		System.out.println("      ");
	}
	
	@Test
	void testTransitionSequenceForOperations_1_4_3_2_6() {
		try {
			//Testing Operation 1
			mm.executeTransition(1);		
			stateListNames.add("State1");
			stateListNames.add("State3");
			stateListNames.add("State4_1");
			stateListNames.add("State5_1");
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 4
			mm.executeTransition(4);		
			stateListNames.add("State5_1");
			stateListNames.add("State4_2");
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 3
			mm.executeTransition(3);
			stateListNames.add("State2");		
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 2
			mm.executeTransition(2);		
			stateListNames.add("State3");
			stateListNames.add("State4_2");
			stateListNames.add("State5_1");
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 6
			mm.executeTransition(6);		
			stateListNames.add("State5_1");
			stateListNames.add("Pseudostate");
			assertEquals(this.stateListNames, mm.activatedStateList);
		}
		catch(Exception ex) {
			System.out.println("Test 4:" + ex.getMessage());
		}
		System.out.println("Test 4: Transition Sequence Test For Operations 1,4,3,2,6:");
		System.out.println("PASSED");
		System.out.println("      ");
	}
	
	@Test	
	void testTransitionSequenceForOperations_1_4_6_5_7_3() {		
		try {
			//Testing Operation 1
			mm.executeTransition(1);		
			stateListNames.add("State1");
			stateListNames.add("State3");
			stateListNames.add("State4_1");
			stateListNames.add("State5_1");		
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 4
			mm.executeTransition(4);		
			stateListNames.add("State5_1");
			stateListNames.add("State4_2");
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 6
			mm.executeTransition(6);
			stateListNames.add("State5_1");
			stateListNames.add("Pseudostate");
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 5
			mm.executeTransition(5);		
			stateListNames.add("Pseudostate");
			stateListNames.add("State5_2");
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 7
			mm.executeTransition(7);		
			stateListNames.add("Pseudostate");
			stateListNames.add("Pseudostate");		
			assertEquals(this.stateListNames, mm.activatedStateList);
			
			//Testing Operation 3
			mm.executeTransition(3);		
			stateListNames.add("State2");	
			assertEquals(this.stateListNames, mm.activatedStateList);
		}
		catch(Exception ex) {
			System.out.println("Test 5:" + ex.getMessage());
		}
		System.out.println("Test 5: Transition Sequence Test For Operations 1,4,6,5,7,3:");
		System.out.println("PASSED");
		System.out.println("      ");
	}
	
	@AfterEach
	void tearDown() throws Exception {
		this.mm = null;
		this.stateListNames = null;
		assertNull(this.mm);
		assertNull(this.stateListNames);
	}
}
