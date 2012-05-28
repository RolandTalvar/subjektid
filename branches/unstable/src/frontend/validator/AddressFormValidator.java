package frontend.validator;

import frontend.forms.AddressForm;
import general.Utils;

public class AddressFormValidator extends Validator {
	
	AddressForm form;
	
	public AddressFormValidator(AddressForm form) {
		this.form = form;
	}
	
	@Override
	public void validate() {
		validateCountry();
		validateCounty();
		validateTownVillage();
		validateStreetAddress();
		validateZipcode();
	}
	
	private void validateCountry() {
		if(Utils.checkEmpty(form.getCountry())) {
			errors.put("country", "Country name is empty!");
		} else if (!form.getCountry().matches("[A-Za-z]+[-_]?[A-Za-z]+")) {
			errors.put("country", "Country contains non-letters!");
		} else if (form.getCountry().length() > 50) {
			errors.put("country", "Country name should not exceed 50 symbols!");
		}
	}
	
	private void validateCounty() {
		if(Utils.checkEmpty(form.getCounty())) {
			errors.put("county", "County name is empty!");
		} else if (!form.getCounty().matches("[A-Za-z]+[-_]?[A-Za-z]+")) {
			errors.put("county", "County contains non-letters!");
		} else if (form.getCounty().length() > 100) {
			errors.put("county", "County name should not exceed 100 symbols!");
		}
	}
	
	private void validateTownVillage() {
		if(Utils.checkEmpty(form.getTownVillage())) {
			errors.put("town_village", "Town/village name is empty!");
		} else if (!form.getTownVillage().matches("[A-Za-z]+")) {
			errors.put("town_village", "Town/village name contains non-letters!");
		} else if (form.getTownVillage().length() > 100) {
			errors.put("town_village", "Town/village name should not exceed 100 symbols!");
		}
	}
	
	private void validateStreetAddress() {
		if(Utils.checkEmpty(form.getStreetAddress())) {
			errors.put("street_address", "Street address is empty!");
		} else if (form.getStreetAddress().length() > 100) {
			errors.put("street_address", "Street address should not exceed"
					+ " 100 symbols!");
		}
	}
	
	private void validateZipcode() {
		if(Utils.checkEmpty(form.getZipcode())) {
			errors.put("zipcode", "Zipcode is empty!");
		} else if (!form.getZipcode().matches("\\d+")) {
			errors.put("zipcode", "Zipcode contains non-numbers!");
		} else if (form.getZipcode().length() > 50) {
			errors.put("zipcode", "Zipcode should not exceed 50 symbols!");
		}
	}

}
