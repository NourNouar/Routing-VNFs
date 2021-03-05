package com.girtel.osmclient;


import com.girtel.osmclient.utils.OSMConstants;


public class ConnectionPoint extends OSMComponent {

    private String name, macAddress, ipAddress;

    /**
     * Constructor
     * @param name connection point's name
     * @param macAddress connection point's MAC Address
     * @param ipAddress connection point's IP Address
     */
    protected ConnectionPoint(String name, String macAddress, String ipAddress)
    {
        super(name, OSMConstants.OSMComponentType.CONNECTION_POINT);
        this.name = name;
        this.macAddress = macAddress;
        this.ipAddress = ipAddress;
    }

    /**
     * Gets connection point's name
     * @return connection point's name
     */
    public String getName(){ return name; }

    /**
     * Gets connection point's MAC Address
     * @return connection point's MAC Address
     */
    public String getMACAddress(){ return macAddress; }

    /**
     * Gets connection point's IP Address
     * @return connection point's IP Address
     */
    public String getIPAddress(){ return ipAddress; }
}
