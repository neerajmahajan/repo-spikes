package controller.simpleformcontroller;

import org.springframework.web.servlet.mvc.SimpleFormController;

import pojo.Customer;
import service.CustomerService;

public class AddCustomerController extends SimpleFormController {

	CustomerService customerService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@Override
	protected void doSubmitAction(Object command) throws Exception {
		System.out.println(command + "111111111111111");
		customerService.createCustomer((Customer)command);// TODO Auto-generated method stub
	}
}
