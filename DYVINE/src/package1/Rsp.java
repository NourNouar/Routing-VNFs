package package1;




public class Rsp {
    private String id;
    private String name;
    private RspVnfdConnectionPointRef[] vnfdConnectionPointRef;


    public String getID() { return id; }

    public void setID(String value) { this.id = value; }


    public String getName() { return name; }

    public void setName(String value) { this.name = value; }

    public RspVnfdConnectionPointRef[] getVnfdConnectionPointRef() { return vnfdConnectionPointRef; }

    public void setVnfdConnectionPointRef(RspVnfdConnectionPointRef[] value) { this.vnfdConnectionPointRef = value; }
}