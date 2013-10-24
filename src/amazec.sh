#!/bin/bash

if [ -f  ./Test.java ]
	then
		javac Test.java
		if [ -f ./Test.class ]
			then
				java Test $(readlink -f $1)
				if [ -f ./Out.java ]
					then
						javac Out.java
						echo $(readlink -f $1)
					else
						echo "Compiler error"
				fi
		fi
fi

#javac Test.java
#java Test $1
#javac Out.java
#java Out
