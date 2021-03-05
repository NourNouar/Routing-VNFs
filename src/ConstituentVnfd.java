
public class ConstituentVnfd {
    private long memberVnfIndex;
    private String vnfdIDRef;

    public long getMemberVnfIndex() { return memberVnfIndex; }
    public ConstituentVnfd(int memberVnfIndex, String vnfdIDRef) {
		super();
		this.memberVnfIndex = memberVnfIndex;
		this.vnfdIDRef = vnfdIDRef;
	}
	public void setMemberVnfIndex(int value) { this.memberVnfIndex = value; }

    public String getVnfdIDRef() { return vnfdIDRef; }
    public void setVnfdIDRef(String value) { this.vnfdIDRef = value; }
}