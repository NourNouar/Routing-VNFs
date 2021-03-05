import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
public class CreateNSD {
	
	ArrayList<ConstituentVnfd> cnstvnfd= new ArrayList<ConstituentVnfd>();
	//cnstvnfd.ad
	//cnstvnd.add(new ConstituentVnfd("1", "ips_vnfd"));
	File file = new File("NSD.yml");
	YAMLMapper yamlMapper = new YAMLMapper();


	NSD ns = new NSD(null, null, null, null, null, null, null, null, null);

	ObjectMapper om = new ObjectMapper(new YAMLFactory());
	
	//om.writeValue(new File("/person2.yaml"), ns);

}
