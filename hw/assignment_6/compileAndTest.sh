#!/bin/bash

clear

declare -a testcases=(case1.txt case2.txt)

echo -ne "Compiling Assignment6.java and Fraction.java....\n\n"


if javac -Xlint:deprecation Assignment6.java && javac -Xlint:deprecation Fraction.java; then
	echo -ne "Compile successful!\n"
	echo -ne "-----------------------------\n\n"

	for i in "${testcases[@]}"
	do
		echo -ne "\nRunning test case:$i\n"
		echo -ne "----------------------------\n"
		echo -ne | cat $i | java Assignment6
	done
else
	echo -ne "\nCompile failed!\n"
fi

rm *.class
