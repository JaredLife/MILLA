# Administration Manual #

## What you need ##
* Java JDK (we used oraclejdk8)
* Java JRE 1.8, to see your current version run ->$ java -version 
* To install java you can run ->$ sudo apt-get install openjdk-7-jdk
* Git
        * Linux console command: "apt-get-install git"
        * Otherwise click here to [download git](https://git-scm.com/downloads)

* You need to [clone](https://help.github.com/articles/cloning-a-repository/) the repository to your computer.

## Build Scripts ##
* Run the following scripts in the root folder to allow you to build and deploy:
	* "./bin/buildAndTest"
	* "./bin/deploy"

*This creates a runable jar file in the tmp file of your computer. There you can ship it.

## Run the console application ##
* Run the following script in the root folder to allow you to run the application:
	* "./bin/run"
