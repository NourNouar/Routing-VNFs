public class DHCPParams {
    public DHCPParams(long count, boolean enabled, String startAddress) {
		super();
		this.count = count;
		this.enabled = enabled;
		this.startAddress = startAddress;
	}
	private long count;
    private boolean enabled;
    private String startAddress;
    public long getCount() { return count; }
    public void setCount(long value) { this.count = value; }
    public boolean getEnabled() { return enabled; }
    public void setEnabled(boolean value) { this.enabled = value; }
    public String getStartAddress() { return startAddress; }
    public void setStartAddress(String value) { this.startAddress = value; }
}
