This project shows the usage of 'hibernate3-maven-plugin' to generate java files from the existing database table structure.

In order to use this plugin for generating hbm files
1 The hibernate.cfg.xml should have been configured before.
2 The hibernate mapping files should have been defined before


After running the build, the plugin will create the java classes in src/main/java/com/mycompany/myproject/mydatamodel directory. The above path can be configured in the plugin configuartion.