package frontend.forms;

import java.util.ArrayList;

public class AddressForm {
	
	private String addressId;
	private String addressTypeFk;
	private String country;
	private String county;
	private String townVillage;
	private String streetAddress;
	private String zipcode;
	private ArrayList<AddressForm> addresses;

	public AddressForm() { }

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	
	/**
	 * @return the addressTypeFk
	 */
	public String getAddressTypeFk() {
		return addressTypeFk;
	}

	/**
	 * @param addressTypeFk the addressTypeFk to set
	 */
	public void setAddressTypeFk(String addressTypeFk) {
		this.addressTypeFk = addressTypeFk;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * @return the townVillage
	 */
	public String getTownVillage() {
		return townVillage;
	}

	/**
	 * @param townVillage the townVillage to set
	 */
	public void setTownVillage(String townVillage) {
		this.townVillage = townVillage;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public ArrayList<AddressForm> getAddresses() {
		return addresses;
	}

	public void setAddresses(ArrayList<AddressForm> addresses) {
		this.addresses = addresses;
	}

}
