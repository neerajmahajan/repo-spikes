#####This project shows the usage of 'hibernate3-maven-plugin' to generate hbm files from the existing database structure.

In order to use this plugin for generating hbm files

1.	The corresponding database should be populated
2.	The hibernate.cfg.xml should have configured before.


After running the build, the plugin will create the hbm files in _target/classes/com/mycompany/myproject/mydatamodel/_ directory. The above path can be configured in the plugin configuartion.