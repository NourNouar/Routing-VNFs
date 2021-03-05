
public class RspVnfdConnectionPointRef {
    private long memberVnfIndexRef;
    private long order;
    private String vnfdEgressConnectionPointRef;
    private String vnfdIDRef;
    private String vnfdIngressConnectionPointRef;

    public long getMemberVnfIndexRef() { return memberVnfIndexRef; }
    public void setMemberVnfIndexRef(long value) { this.memberVnfIndexRef = value; }

    public long getOrder() { return order; }
    public void setOrder(long value) { this.order = value; }

    public String getVnfdEgressConnectionPointRef() { return vnfdEgressConnectionPointRef; }
    public void setVnfdEgressConnectionPointRef(String value) { this.vnfdEgressConnectionPointRef = value; }

    public String getVnfdIDRef() { return vnfdIDRef; }
    public void setVnfdIDRef(String value) { this.vnfdIDRef = value; }

    public String getVnfdIngressConnectionPointRef() { return vnfdIngressConnectionPointRef; }
    public void setVnfdIngressConnectionPointRef(String value) { this.vnfdIngressConnectionPointRef = value; }
	public RspVnfdConnectionPointRef(long memberVnfIndexRef, long order, String vnfdEgressConnectionPointRef,
			String vnfdIDRef, String vnfdIngressConnectionPointRef) {
		super();
		this.memberVnfIndexRef = memberVnfIndexRef;
		this.order = order;
		this.vnfdEgressConnectionPointRef = vnfdEgressConnectionPointRef;
		this.vnfdIDRef = vnfdIDRef;
		this.vnfdIngressConnectionPointRef = vnfdIngressConnectionPointRef;
	}
}