public class NSD {
    public NSD(ConstituentVnfd[] constituentVnfd, String description, String id, IPProfile[] ipProfiles, String name,
			String shortName, String version, Vld[] vld, Vnffgd[] vnffgd) {
		super();
		this.constituentVnfd = constituentVnfd;
		this.description = description;
		this.id = id;
		this.ipProfiles = ipProfiles;
		this.name = name;
		this.shortName = shortName;
		this.version = version;
		this.vld = vld;
		this.vnffgd = vnffgd;
	}
	private ConstituentVnfd[] constituentVnfd;
    private String description;
    private String id;
    private IPProfile[] ipProfiles;
    private String name;
    private String shortName;
    private String version;
    private Vld[] vld;
    private Vnffgd[] vnffgd;

    public ConstituentVnfd[] getConstituentVnfd() { return constituentVnfd; }
    public void setConstituentVnfd(ConstituentVnfd[] value) { this.constituentVnfd = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public IPProfile[] getIPProfiles() { return ipProfiles; }
    public void setIPProfiles(IPProfile[] value) { this.ipProfiles = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getShortName() { return shortName; }
    public void setShortName(String value) { this.shortName = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    public Vld[] getVld() { return vld; }
    public void setVld(Vld[] value) { this.vld = value; }

    public Vnffgd[] getVnffgd() { return vnffgd; }
    public void setVnffgd(Vnffgd[] value) { this.vnffgd = value; }
}






















