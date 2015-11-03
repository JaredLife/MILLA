# Administration Manual #

## What you need - það sem þú þarft ##
* Java JDK (við notuðum  oraclejdk8)
* Java JRE 1.8, til að sjá núverandi útgáfu, keyrðu  ->$ java -version 
* Til að setja upp java þá keyriru ->$ sudo apt-get install openjdk-7-jdk
* Git
       * Til að setja upp Git þá keyriru ->$ apt-get-install git
       * Annars smelliru hér til að [niðurhala git](https://git-scm.com/downloads)

* Þú þarft svo að nota Git [clone](https://help.github.com/articles/cloning-a-repository/) til að na í allar skrár.

## Build Scripts ##
* Keyrðu svo þessar skipanir í rót verkefnisins til að byggja og spila(build and deploy):
	* "./bin/buildAndTest"
	* "./bin/deploy"

*Þetta býr til keyranlega jar skrá í tmp skránni á vélinni, þá er það tilbúið í dreifingu.

## Run the console application - Að Keyra appið ##
* Keyrðu eftirfarandi skipun í rót skráni(root folder) til þess að keyra appið.:
	* "./bin/run"
