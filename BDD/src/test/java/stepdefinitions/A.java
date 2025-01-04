package stepdefinitions;

import io.cucumber.java.en.Given;

public class A {
	@Given("Execute Customer Module")
	public void execute_customer_module() {
		System.out.println("Executing customer module test case");
	}

}
