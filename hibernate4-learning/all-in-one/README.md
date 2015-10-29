#####This project shows the usage of 'hibernate3-maven-plugin' to generate hibernate.cfg.xml,hbm files and pojo classes from the existing database table structure.

In order to use this plugin for generating above files

1. A database should be populated for which you want to do reverse engineering 
2. The above database properties should be configured in the default hibernate.cfg.xml file provided in src/main/resources directory


The Ideal way is use to revenge.xml file to define the strategy for reverse enginnering, however I am not sure about its usage and haven't found any documentation for it. But I have used an alternative way in which we can give a default hibernate.cfg.xml file with some basic database properties.


After running the build, the plugin will create 

1. Actual hibernate.cfg.xml file at target/hibernate3/generated-mappings directory
2. All hbm files at target/classes/com/mycompany/myproject/mydatamodel
3. All pojo classes at target/pojo/com/mycompany/myproject/mydatamodel/

The above paths can be configured in the plugin configuartion.