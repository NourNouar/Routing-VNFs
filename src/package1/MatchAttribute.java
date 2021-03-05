package package1;

public class MatchAttribute {
    private String destinationIPAddress;
    private long destinationPort;
    private String id;
    private long ipProto;
    private String sourceIPAddress;
    private long sourcePort;


    public String getDestinationIPAddress() { return destinationIPAddress; }

    public void setDestinationIPAddress(String value) { this.destinationIPAddress = value; }


    public long getDestinationPort() { return destinationPort; }

    public void setDestinationPort(long value) { this.destinationPort = value; }


    public String getID() { return id; }

    public void setID(String value) { this.id = value; }


    public long getIPProto() { return ipProto; }

    public void setIPProto(long value) { this.ipProto = value; }


    public String getSourceIPAddress() { return sourceIPAddress; }

    public void setSourceIPAddress(String value) { this.sourceIPAddress = value; }

    public long getSourcePort() { return sourcePort; }

    public void setSourcePort(long value) { this.sourcePort = value; }
}