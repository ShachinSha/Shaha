package org.stepdefanition;

import org.bcs.BaseCls1;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseCls1{

	
	@Before
	//precondition
	
	private void Precondition() {
	
		launchBrowser();
		maxi();

	}
	
	
	@After
	//postcondition
	private void postcondition() {
	
		close();

	}

}
