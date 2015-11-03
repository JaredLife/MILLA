# Developers Manual #

Þetta verkefni er lítið console forrit sem notar Java

## Requirements ##
* Java - (Java JDK (við notuðum java 8 - oraclejdk8))
* Til að builda notum við gradle 
og er hægt að niðurhala því í console-inu

## Get started ##
* Til að setja projectið upp og að builda það er hægt að fylgja þessum þrepum:

1. git clone git@github.com:JaredLife/MILLA.git
2. Fara inní verkefnis möppuna ../MILLA
3. /bin/buildAndTest

## Bin scripturnar til að flýta fyrir eru: ##
* bin/buildAndTest - Byggir það, hreinsar og Testar ( keyrir ./bin/clean og ./bin/compile og ./bin/unit_test)
* bin/run - Runnar það
* bin/clean - Hreinsar
* bin/compile - Compilar
* bin/package - býr til .jar skrá
* bin/run - Runnar það
* bin/unit_test - Testar það


## Til að setja upp verkefnið á tölvuna þarf að fylgja þessum þrepum: ##

1. Up to date Linux workstation
2. Ná java  → sudo apt-get install openjdk-7-jdk
3. Ná í git → sudo apt-get install git
4. Tengjast github verkefninu → git clone git@github.com:JaredLife/MILLA.git

## Test the code ##
* Til að gera Unit test þá notum við Gradle sem er tengt við JUnit , scripturnar okkar í bin keyra Gradle wrapper með að nota skipunina → /bin/unit_test
* You can see the code coverage in the [README](README.md) and also at the [CodeCov website](https://codecov.io/github/JaredLife/MILLA)

