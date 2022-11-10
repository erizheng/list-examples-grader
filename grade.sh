# Create your grading script here
set -e

#CPATH = ".:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *"

rm -rf student-submission
git clone $1 student-submission

cp TestListExamples.java student-submission
cp -r lib student-submission

cd student-submission


if test -f ListExamples.java
then 
    echo "Contains file"
else 
    echo "Doesn't contain file" 
    exit
fi

javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java 2> compile-err.txt
echo "Compiled"

java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore TestListExamples