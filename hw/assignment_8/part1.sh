#!/bin/bash

GREEN="\e[0;32m"
RED="\e[0;31m"
YELLOW="\e[0;33m"
NC="\e[0m"

clear


FILE="part1.java"

echo -ne "\n${YELLOW}Compiling $FILE ....\n"
echo -ne "\n-----------------------------------${NC}\n"
if javac -Xlint:deprecation $FILE; then
	echo -ne "\n${GREEN}$FILE compiled successfully!${NC}\n"
	if find part1.class > /dev/null 2>&1; then
		java part1
	fi
else
	echo -ne "\n${RED}$FILE --- compile failed !!! ---${NC}\n"
fi
