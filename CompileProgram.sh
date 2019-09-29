#!/bin/sh

PROGRAM_NAME=EmailApp.java

javac -d ./ ./src/*.java

if [ $? -eq 0 ]
then
    echo "Successful Compilation!"
    java EmailApp
fi