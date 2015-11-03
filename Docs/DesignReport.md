# Design report #

* Lítið og einfalt forrit sem lætur notanda spila TicTacToe(Myllu) við annan notanda á sömu tölvu.
* Við teiknuðum leikborðið á skjánnum í 3x3 char fylki:

-------------
| 1 | 2 | 3 |
-------------
| 4 | 5 | 6 |
-------------
| 7 | 8 | 9 |
-------------

* Leikmaður X velur svo t.d 3 til að leika sína umferð

-------------
| 1 | 2 | X |
-------------
| 4 | 5 | 6 |
-------------
| 7 | 8 | 9 |
-------------

* Svo velur Leikmaður O t.d 2 í sinni umferð en getur ekki valið reit sem leikmaður X hefur þegar valið.

-------------
| 1 | O | X |
-------------
| 4 | 5 | 6 |
-------------
| 7 | 8 | 9 |
-------------

* Leik er svo lokið þegar Leikmaður X nær 3 Xum í röð t.d 3og6og9.

-------------
| 1 | O | X |
-------------
| 4 | O | X |
-------------
| O | 8 | X |
-------------
(X er sigurvegari!)

* Ef allir reitir eru fylltir og enginn hefur náð 3 í röð endar leikurinn með jafntefli.

* Það eru 8 leiðir sem leikmenn geta unnið eða 
* 123 - 456 - 789 - 147 - 258 - 369 - 159 - 357

* Eftir að leik lýkur prentast út Skilaboð með hver hefur sigrað(eða jafntefli)

## Klasar ##

###Grid - Griddið býr til Nóður frá 1-9, og win lógík###
* Grid()
* getNodes()
* changeNodeOwnerInGrid(Player owner, int nodeNumber)
* toString()
* isWinner()

###Player - Býr til leikmann###
* Player(int number, String name)
* getNumber()
* getName()
* getSymbol()


###Node - Nóða á tilvik af leikmanni en ef enginn nóða á leikmann er tilvikið null.###
* Node(int num)
* setOwner(Player player)
* isEmpty()
* getOwner()
* getNumber()

###BusinessLogic - Logíkin fer fram hér - Milli lagið  ###
* BusinessLogic(Player newPlayer1, Player newPlayer2)
* getGrid()
* isValidInput(int input)
* markNode(int input, int tunNum)
* bingo()

####TicTacToe.java Keyrir leik af TicTacToe. Á eintak af öllum ofangreindum klösum.####
