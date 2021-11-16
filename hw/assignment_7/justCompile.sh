#!/bin/bash

declare -a javas=("CardList.java" "Assignment7.java")
declare -a testcases=("case1.txt")

GREEN="\e[0;32m"
RED="\e[0;31m"
YELLOW="\e[0;33m"
NC="\e[0m"

clear

for i in "${javas[@]}"
do
	echo -ne "\n${YELLOW}Compiling $i ....\n"
	echo -ne "\n-----------------------------------${NC}\n"
	if javac -Xlint:deprecation $i; then
		echo -ne "\n${GREEN}$i compiled successfully!${NC}\n"
	else
		echo -ne "\n${RED}$i --- compile failed !!! ---${NC}\n"
	fi
done

if find Assignment7.class > /dev/null 2>&1; then
	for i in "${testcases[@]}"
	do
		echo -ne "\n${GREEN}RUNNING test case: $i\n"
		echo -ne "\n--------------------${NC}\n"
		cat $i | java Assignment7
	done
else
	echo -ne "\n${RED}Assignment7: No class file to execute${NC}\n"
fi

if find *.class > /dev/null 2>&1; then
	rm *.class; echo -ne "\n${GREEN}Class files cleaned up!${NC}\n"
else
	echo -ne "\n${YELLOW}No class files to clean up..${NC}\n"
fi
