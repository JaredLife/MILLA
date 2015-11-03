# Developers Manual #

Þetta verkefni er lítið console forrit sem notar Java

## Það sem þú þarft - Requirements ##
* Java - (Java JDK (við notuðum java 8 - oraclejdk8))
* Git
* Travis
* Codecoverage

## Til að byrja - Get started ##

### Til að setja upp verkefnið á tölvuna þarf að fylgja þessum þrepum: ###

1. Up to date Linux workstation
2. Ná java  → sudo apt-get install openjdk-7-jdk
3. Ná í git → sudo apt-get install git
4. Tengjast github verkefninu → git clone git@github.com:JaredLife/MILLA.git

### Til að setja upp Travis ###
1. Búa til aðgang á [Travis-CI](https://travis-ci.org)
2. Fara á [Travis síðu verkefnisins](https://travis-ci.org/JaredLife/MILLA)

### Til að setja upp Code Coverage ###
1. Búa til aðgang á [Codecoverage] (https://codecov.io)
2. Fara á [Code Coverage síðu verkefnisins](https://codecov.io/github/JaredLife/MILLA)

### Til að setja projectið upp og að builda það er hægt að fylgja þessum þrepum: ###

1. git clone git@github.com:JaredLife/MILLA.git
2. Fara inní verkefnis möppuna ../MILLA
3. /bin/buildAndTest

### Bin scripturnar til að flýta fyrir eru: ###
* bin/buildAndTest - Byggir það, hreinsar og Testar ( keyrir ./bin/clean og ./bin/compile og ./bin/unit_test)
* bin/run - Runnar það
* bin/clean - Hreinsar
* bin/compile - Compilar
* bin/package - býr til .jar skrá
* bin/run - Runnar það
* bin/unit_test - Testar það


* Verkefnið er byggt upp á Gradle og er það innbyggt.

## Prufa kóðan - Test the code ##
* Til að gera Unit test þá notum við Gradle sem er tengt við JUnit , scripturnar okkar í bin keyra Gradle wrapper með að nota skipunina → /bin/unit_test
* Til að sjá code coverage í [README](./MILLA/README.md) og líka á [CodeCov vefsíðunni](https://codecov.io/github/JaredLife/MILLA)
