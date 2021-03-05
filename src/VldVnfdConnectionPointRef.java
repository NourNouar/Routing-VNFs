public class VldVnfdConnectionPointRef {
    private long memberVnfIndexRef;
    private String vnfdConnectionPointRef;
    private String vnfdIDRef;
    private String ipAddress;

    public long getMemberVnfIndexRef() { return memberVnfIndexRef; }
    public void setMemberVnfIndexRef(long value) { this.memberVnfIndexRef = value; }

    public String getVnfdConnectionPointRef() { return vnfdConnectionPointRef; }
    public void setVnfdConnectionPointRef(String value) { this.vnfdConnectionPointRef = value; }

    public String getVnfdIDRef() { return vnfdIDRef; }
    public void setVnfdIDRef(String value) { this.vnfdIDRef = value; }

    public String getIPAddress() { return ipAddress; }
    public void setIPAddress(String value) { this.ipAddress = value; }
	public VldVnfdConnectionPointRef(long memberVnfIndexRef, String vnfdConnectionPointRef, String vnfdIDRef,
			String ipAddress) {
		super();
		this.memberVnfIndexRef = memberVnfIndexRef;
		this.vnfdConnectionPointRef = vnfdConnectionPointRef;
		this.vnfdIDRef = vnfdIDRef;
		this.ipAddress = ipAddress;
	}
}