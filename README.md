Follow the below instructions to run the application or to test using JUNIT Tests.

=============================TO RUN the Application Follow below steps=============================
Replace the file path given in "OperationHandler.java" C:\\Users\\zubair\\Desktop\\Digital14\\Data.txt with your own system Data.txt file path.
go to Main.java class file path using command line assignment\src\main\java\assignment and run the below command to compile and run the program
javac *.java
cd ..
java assignment.Main 1 This is really really stupid!!!
NOTE: in above line, "1" is the option to test lowercase feature and "This is really really stupid!!!" is the input string.

Once above command is executed, check the "Data.txt" file, it should be updated with expected output.

1) To test "lowercase" feature pass "1" as first argument parameter and then input sting
2) To test "uppercase" feature pass "2" as first argument parameter and then input sting
3) To test "stupid remover" feature pass "3" as first argument parameter and then input sting
4) To test "duplicate remover" feature pass "4" as first argument parameter and then input sting
5) To test "Remove Duplicate + stupid remover" feature pass "10" as first argument parameter and then input sting
6) To test "Remove Duplicate + stupid remover" feature pass "10" as first argument parameter and then input sting
7) To test "lowercase + stupid remover" feature pass "11" as first argument parameter and then input sting
8) To test "lowercase + duplicate remover" feature pass "12" as first argument parameter and then input sting
9)  To test "duplicate remover + uppercase" feature pass "13" as first argument parameter and then input sting
10) To test "stupid remover + uppercase" feature pass "14" as first argument parameter and then input sting
NOTE: After executing each scenario, check the "Data.txt" file, it should be updated with expected output.

=============================TO Test the Unit Tests Follow below steps=============================
1) Open the TestOperationalHandler.java class and uncomment the import import org.junit.Test
2) uncomment each test method one by one i.e. "testLowerCase" and test by doing the right click and select "Run-As -> Junit Test" option


To add any new feature in future, just follow the below steps
1) add/define the required feature in form of new method in OperationHandler.java class as existing methods are added
2) in switch statement of same class define a new CASE for this feature i.e. case: 15 and call the new feature method.
3) In Main.java class, add the new option value i.e. 15.
