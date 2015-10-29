#####This project shows the usage of 'hibernate3-maven-plugin' to generate hibernate.cfg.xml file from the existing database structure.

The ideal way is configure reveng.xml and then generate the hibernate config file, however I dont have much information on creating revenge.xml file, so using the alternative way.

In this alternative way I have created a default __hibernate.cfg.xml__ in _src/main/resources_ folder and added the basic database configuration information like

	hibernate.dialect
	hibernate.connection.driver_class
	hibernate.connection.url
	hibernate.connection.username
	hibernate.connection.password

After running the build, the plugin will create the right __hibernate.cfg.xml__ file  in _target/hibernate3/generated-mappings_ directory which will include all the reference for hibernate mapping files.