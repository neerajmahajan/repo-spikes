This project shows the usage of 'hibernate3-maven-plugin' to generate hibernate.cfg.xml file from the existing database structure.

The ideal way is configure reveng.xml and then generate the hibernate config file, however I dont have much information on creating revenge.xml file, so using the alternative way.

In this alternative way I have created a default hibernate.cfg.xml in src/main/resources folder and added the basic database configuration information like

hibernate.dialect
hibernate.connection.driver_class
hibernate.connection.url
hibernate.connection.username
hibernate.connection.password

After running the build, the plugin will create the right hibernate.cfg.xml file  in target/hibernate3/generated-mappings directory which will include all the reference for hibernate mapping files.