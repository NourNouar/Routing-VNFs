# Description
This work proposes routing VNFs with re-configurable wiring capabilities as a novel concept that would allow agile and dynamic VNFs wiring from design-time to run-time.

# Ubuntu pre-requirements
sudo apt install python-pip libcurl4-gnutls-dev libgnutls-dev
# Install OSM client from the git repo.
sudo -H pip install git+https://osm.etsi.org/gerrit/osm/osmclient
# Integarte Openstack VIM
osm vim-create --name openstack-site --user admin --password userpwd --auth_url http://$openstack_ip$:5000/v2.0 --tenant admin --account_type openstack --config='{security_groups: default, keypair: $generatedmykey$}'

# VNFs packages
This folder contains the diffent VNFs packages used for the security NS.
# Onboarding VNFs packages 
Using OSM GUI, upload the VNFs to OSM's VNF repository  
Using OSMclient  
 osm vnfd-create swingNS.tar.gz  
 osm vnfd-list  

# NS package
This folder contains the NS package.
# Onboarding NS package
Using OSM GUI, upload the NS to OSM's NS repository  
Using OSMclient  
 osm nsd-create swingNS.tar.gz  
 osm nsd-list  

# NS Instantiation
make sure that the corresponding VM image (image folder) is available in the Openstack VIM where it will be instantiated. This image contains all the swing logics.  
After deploying the VNFs and VLs connecting them. OSM talks to the VNFs deployed in a VIM to run day-0, day-1 and day-2 configuration primitives.  
Using OSM GUI  
 Fill the form and add at least a name and selecting the VIM  
using OSMclient  
 osm ns-create --nsd_name swingNS --ns_name <ns-instance-name> --vim_account <data-center-name>  
 osm ns-list  
