#!/bin/bash

if javac Assignment5.java; then
	echo -ne "Assignment5 compiled successfully!\n"
	echo -ne "Running Assignment 5...\n"
	echo -ne "-----------------------\n"
	java Assignment5
else
	echo -ne "Assignment5 failed to compile\n"
fi
