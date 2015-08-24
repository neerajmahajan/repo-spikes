package validator;

import java.lang.reflect.Field;

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
		Field[] fields = customer.getClass().getFields();
		for (int i = 0; i < fields.length; i++) {
			String fieldName = fields[i].getName();
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, fieldName, "field.required",
					" The " + fieldName + " field can not be empty");
		}

		if (customer.getUname().length() < 4) {
			errors.rejectValue("uname", "field.minlenght", new Object[] { Integer.valueOf(4) },
					"The user name should be minimum of 4 characters");
		}
		if (customer.getPassword().length() < 4) {
			errors.rejectValue("password", "field.minlenght", new Object[] { Integer.valueOf(4) },
					"The password should be minimum of 4 characters");
		}
	}

}
