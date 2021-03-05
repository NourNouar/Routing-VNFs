package package1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IPProfileParams {
    private AddressAttribution addParams;
    private Addresses[] add;
    private String ipVersion;
    private String subnetAddress;


    public AddressAttribution getAddParams() { return addParams; }

    public void setaddParams(AddressAttribution value) { this.addParams = value; }


    public Addresses[] getAddresses() { return add; }

    public void setAddresses(Addresses[] value) { this.add = value; }


    public String getIPVersion() { return ipVersion; }

    public void setIPVersion(String value) { this.ipVersion = value; }


    public String getSubnetAddress() { return subnetAddress; }

    public void setSubnetAddress(String value) { this.subnetAddress = value; }
}