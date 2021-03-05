public class IPProfile {
    public IPProfile(String description, IPProfileParams ipProfileParams, String name) {
		super();
		this.description = description;
		this.ipProfileParams = ipProfileParams;
		this.name = name;
	}
	private String description;
    private IPProfileParams ipProfileParams;
    private String name;

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public IPProfileParams getIPProfileParams() { return ipProfileParams; }
    public void setIPProfileParams(IPProfileParams value) { this.ipProfileParams = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
}
