Steps to run this
------------------------------------
go to command prompt (cmd)
then go to the folder of bin.... assume you download this and extracted it on c drive
type following


cd c:\RMIExamQuestion\bin (hit enter)
SET CLASSPATH=. (hit enter)
rmic me.agilani.www.BankImpl (hit enter)
rmiregistry (hit enter)


open a new command prompt
type following
cd c:\RMIExamQuestion\bin (hit enter)
SET CLASSPATH=. (hit enter)
java me.agilani.www.BankServer
(you should see "bank server is ready")

open a new command prompt
type following
cd c:\RMIExamQuestion\bin (hit enter)
SET CLASSPATH=. (hit enter)
java me.agilani.www.BankOfficerClient

you should see adeel's account details
