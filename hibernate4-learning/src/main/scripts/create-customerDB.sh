
echo "#####################Executing DB creation script ###############################"

mysql -uroot -pmysql -hlocalhost < `dirname $0`/createDB.sql

