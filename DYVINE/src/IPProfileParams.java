public class IPProfileParams {
    private DHCPParams dhcpParams;
    private DNSServer[] dnsServer;
    private String ipVersion;
    private String subnetAddress;

    public DHCPParams getDHCPParams() { return dhcpParams; }
    public void setDHCPParams(DHCPParams value) { this.dhcpParams = value; }

    public DNSServer[] getDNSServer() { return dnsServer; }
    public void setDNSServer(DNSServer[] value) { this.dnsServer = value; }

    public String getIPVersion() { return ipVersion; }
    public void setIPVersion(String value) { this.ipVersion = value; }

    public String getSubnetAddress() { return subnetAddress; }
    public void setSubnetAddress(String value) { this.subnetAddress = value; }
	public IPProfileParams(DHCPParams dhcpParams, DNSServer[] dnsServer, String ipVersion, String subnetAddress) {
		super();
		this.dhcpParams = dhcpParams;
		this.dnsServer = dnsServer;
		this.ipVersion = ipVersion;
		this.subnetAddress = subnetAddress;
	}
}