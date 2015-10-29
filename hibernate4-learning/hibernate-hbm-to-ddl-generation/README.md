#####This project shows the usage of 'hibernate3-maven-plugin' to generate sql script files from the hbm file

In order to use this plugin for generating sql script

1. The hibernate.cfg.xml should have been configured before.
2. The hibernate mapping files should have been defined before


After running the build, the plugin will create the sql script in _target/hbm2ddl_ directory. The above path can be configured in the plugin configuartion.