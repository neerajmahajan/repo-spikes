package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pojo.Customer;

public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return cls.equals(Customer.class);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Customer customer = (Customer) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "uname", "field.required",
				" The username field can not be empty");
		if (customer.getUname().length() < 4) {
			errors.rejectValue("uname", "field.minlenght", new Object[] { Integer.valueOf(4) },
					"The user name should be minimum of 4 characters");
		}
	}

}
