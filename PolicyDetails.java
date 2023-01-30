package com.test.interfac;

import java.util.Scanner;

public class PolicyDetails implements Policy {

	private int id;
	private String policyName;
	private String policyType;
	private int premiumAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public int getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	@Override
	public Policy getpolicyDetails() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter policy id :");
		id = scanner.nextInt();

		System.out.println("Enter policy name :");
		policyName = scanner.next();

		System.out.println("Enter policy type :");
		policyType = scanner.next();

		System.out.println("Enter premium amount :");
		premiumAmount = scanner.nextInt();

		PolicyDetails policyDetails = new PolicyDetails();

		policyDetails.setId(id);
		policyDetails.setPolicyName(policyName);
		policyDetails.setPolicyType(policyType);
		policyDetails.setPremiumAmount(premiumAmount);

		return policyDetails;
	}

	@Override
	public String toString() {
		return "PolicyDetails [id=" + id + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", premiumAmount=" + premiumAmount + "]";
	}

}
