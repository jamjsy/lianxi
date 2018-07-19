#！bin/bash
mvn clean package
echo "--------Exam1-----------"
java -jar Exam1/target/Exam1.jar
echo "--------deson2-----------"
java -jar Exam2/target/Exam2.jar
echo "--------deson3-----------"
java -jar Exam3/target/Exam3.jar