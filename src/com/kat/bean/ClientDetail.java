package com.kat.bean;

public class ClientDetail {

	int detailId;
	String email;
	String firstName;
	String lastName;
	String phone;
	String shippingAddress_1;
	String shippingAddress_2;
	String shippingCity;
	String shippingState;
	String shippingZip;
	String billingAddress_1;
	String billingAddress_2;
	String billingCity;
	String billingState;
	String billingZip;
	String cardNumber;
	String expirationMonth;
	String expireYear;
	String securityCode;
	int numberOfOrderPerAccount;
	String username;
	String password;
	String guestCheckout;
	String shippingSpeed;
	String ipChange;


	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	
	
	
	
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShippingAddress_1() {
		return shippingAddress_1;
	}

	public void setShippingAddress_1(String shippingAddress_1) {
		this.shippingAddress_1 = shippingAddress_1;
	}

	public String getShippingAddress_2() {
		return shippingAddress_2;
	}

	public void setShippingAddress_2(String shippingAddress_2) {
		this.shippingAddress_2 = shippingAddress_2;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public String getShippingZip() {
		return shippingZip;
	}

	public void setShippingZip(String shippingZip) {
		this.shippingZip = shippingZip;
	}

	public String getBillingAddress_1() {
		return billingAddress_1;
	}

	public void setBillingAddress_1(String billingAddress_1) {
		this.billingAddress_1 = billingAddress_1;
	}

	public String getBillingAddress_2() {
		return billingAddress_2;
	}

	public void setBillingAddress_2(String billingAddress_2) {
		this.billingAddress_2 = billingAddress_2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingZip() {
		return billingZip;
	}

	public void setBillingZip(String billingZip) {
		this.billingZip = billingZip;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public String getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public int getNumberOfOrderPerAccount() {
		return numberOfOrderPerAccount;
	}

	public void setNumberOfOrderPerAccount(int numberOfOrderPerAccount) {
		this.numberOfOrderPerAccount = numberOfOrderPerAccount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGuestCheckout() {
		return guestCheckout;
	}

	public void setGuestCheckout(String guestCheckout) {
		this.guestCheckout = guestCheckout;
	}

	public String getShippingSpeed() {
		return shippingSpeed;
	}

	public void setShippingSpeed(String shippingSpeed) {
		this.shippingSpeed = shippingSpeed;
	}

	public String getIpChange() {
		return ipChange;
	}

	public void setIpChange(String ipChange) {
		this.ipChange = ipChange;
	}

	@Override
	public String toString() {
		return "ClientDetail [detailId=" + detailId + ", numberOfOrderPerAccount=" + numberOfOrderPerAccount + "]";
	}
}
