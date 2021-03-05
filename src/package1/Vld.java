package package1;



public class Vld {
    private String id;
    private String mgmtNetwork;
    private String name;
    private String shortName;
    private String type;
    private String vimNetworkName;
    private VldVnfdConnectionPointRef[] vnfdConnectionPointRef;
    private String ipProfileRef;


    public String getID() { return id; }

    public void setID(String value) { this.id = value; }


    public String getMgmtNetwork() { return mgmtNetwork; }

    public void setMgmtNetwork(String value) { this.mgmtNetwork = value; }


    public String getName() { return name; }

    public void setName(String value) { this.name = value; }


    public String getShortName() { return shortName; }

    public void setShortName(String value) { this.shortName = value; }

    public String getType() { return type; }

    public void setType(String value) { this.type = value; }


    public String getVimNetworkName() { return vimNetworkName; }

    public void setVimNetworkName(String value) { this.vimNetworkName = value; }


    public VldVnfdConnectionPointRef[] getVnfdConnectionPointRef() { return vnfdConnectionPointRef; }

    public void setVnfdConnectionPointRef(VldVnfdConnectionPointRef[] value) { this.vnfdConnectionPointRef = value; }


    public String getIPProfileRef() { return ipProfileRef; }

    public void setIPProfileRef(String value) { this.ipProfileRef = value; }
}