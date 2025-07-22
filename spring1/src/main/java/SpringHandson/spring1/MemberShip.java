package SpringHandson.spring1;

public class MemberShip {
	private int memberId;
	private int visitsperYear;
	private String membershipType;
	private Customer customer;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getVisitsperYear() {
		return visitsperYear;
	}
	public void setVisitsperYear(int visitsperYear) {
		this.visitsperYear = visitsperYear;
	}
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "MemberShip [memberId=" + memberId + ", visitsperYear=" + visitsperYear + ", membershipType="
				+ membershipType + ", customer=" + customer + "]";
	}
	
	

}
