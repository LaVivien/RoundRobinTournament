# Round Robin Tournament

## Description

There are 10 soccer teams that will play in the league this year are stored in a file called “input.txt”. Read the names of these teams from the file and develop a round-robin schedule so that every team plays every other team over the next 9 weeks. You must put the results of your program (the schedule) into a file called “output.txt”.

## Output

Here is a sample solution:

Soccer Schedule: Number of teams is: 10

```
Week 1
Cosmos plays Attackers
Red Bull plays iPhoners
Manchester United plays Foo Fighters
Liverpool plays Giants
Staples plays Westhill

Week 2
Cosmos plays iPhoners
Attackers plays Foo Fighters
Red Bull plays Giants
Manchester United plays Westhill
Liverpool plays Staples

Week 3
Cosmos plays Foo Fighters
iPhoners plays Giants
Attackers plays Westhill
Red Bull plays Staples
Manchester United plays Liverpool

Week 4
Cosmos plays Giants
Foo Fighters plays Westhill
iPhoners plays Staples
Attackers plays Liverpool
Red Bull plays Manchester United

Week 5
Cosmos plays Westhill
Giants plays Staples
Foo Fighters plays Liverpool
iPhoners plays Manchester United
Attackers plays Red Bull

Week 6
Cosmos plays Staples
Westhill plays Liverpool
Giants plays Manchester United
Foo Fighters plays Red Bull
iPhoners plays Attackers

Week 7
Cosmos plays Liverpool
Staples plays Manchester United
Westhill plays Red Bull
Giants plays Attackers
Foo Fighters plays iPhoners

Week 8
Cosmos plays Manchester United
Liverpool plays Red Bull
Staples plays Attackers
Westhill plays iPhoners
Giants plays Foo Fighters

Week 9
Cosmos plays Red Bull
Manchester United plays Attackers
Liverpool plays iPhoners
Staples plays Foo Fighters
Westhill plays Giants
```

## Algorithm

Scheduling algorithm taken from [Wikipedia](https://en.wikipedia.org/wiki/Round-robin_tournament)

If  is the number of competitors, a pure round robin tournament requires  games. If  is even, then in each of  rounds,  games can be run in parallel, provided there exist sufficient resources (e.g. courts for a tennis tournament). If  is odd, there will be  rounds, each with  games, and one competitor having no game in that round.

The standard algorithm for round-robins is to assign each competitor a number, and pair them off in the first round …

```
Round 1. (1 plays 14, 2 plays 13, ... )
1  2 3  4 5 6  7
 14 13 12 11 10 9  8
```

then fix one competitor (number one in this example) and rotate the others clockwise one position

```
Round 2. (1 plays 13, 14 plays 12, ... )
1  14 2  3 4 5  6
 13 12 11 10 9  8 7
```

```
Round 3. (1 plays 12, 13 plays 11, ... )
1  13 14 2  3 4 5
 12 11 10 9  8 7 6
 ```
 
until you end up almost back at the initial position

```
Round 13. (1 plays 2, 3 plays 14, ... )
1  3 4  5 6 7  8
 2 14  13 12 11 10 9
```

If there are an odd number of competitors, a dummy competitor can be added, whose scheduled opponent in a given round does not play and has a bye. The schedule can therefore be computed as though the dummy were an ordinary player, either fixed or rotating. Instead of rotating one position, any number relatively prime to  will generate a complete schedule. The upper and lower rows can indicate home/away in sports, white/black in chess, etc.

To ensure fairness, this must alternate between rounds since competitor 1 is always on the first row. If, say, competitors 3 and 8 were unable to fulfil their fixture in the third round, it would need to be rescheduled outside the other rounds, since both competitors would already be facing other opponents in those rounds. More complex scheduling constraints may require more complex algorithms. This schedule is applied in chess and draughts tournaments of rapid games, where players physically move round a table.







