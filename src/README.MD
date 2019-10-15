**Git task**
1.	Checkout to master branch. Commit README document with any words or sentences.
2.	Checkout to develop branch. Create base file (java) and add content inside (class with any name and one method “public int add(int a, int b)” with add operation implementation). Commit it to develop branch.
3.	Create otherOperation branch. 
4.	Add sub (subtraction) implementation (new public method like on previous step). Commit.
5.	Add div(division) implementation. Commit.
6.	Add mult (multiplication) implementation. Commit.
7.	Add sqrt implementation. Step by step.
a.	add  method with implementation to your java file.
b.	add changed file to staging zone.
c.	get your staged file back to working directory (think how)
d.	change sqrt method name to sqrtBad.
e.	add to staging zone
f.	commit
8.	Reset all your repo (read about reset command and all possible options of resetting) to mult implementation commit (i.e remove last commit with sqrtBad method)
9.	Add sqrt implementation. Commit.
10.	Rebase it to develop branch. Squash it to 1 commit. Write good and clear message. 
11.	Checkout to develop. Create new branch advancedOperation.
12.	Add implementation for add operation with 2 parameters. The first line of method “System out (“This is add method”)”. Commit.
13.	Add implementation for add operation with 3 parameters. The first line of method “System out (“This is add method for 3 params”)”. The first line of method add with 2 parameters “System out (“This is add method for 2 params”)”.  Commit.
14.	Add implementation for add operation with 4 parameters. The first line of method “System out (“This is add method for 4 params”)”. Commit.
15.	Checkout to your “grandparent commit”. Copy first line of add method for 2 params. Checkout back to the “tail” of your current branch and paste line to add method with 2 params. Commit.
16.	Merge it with develop branch. 
17.	Merge develop with master.
18.	Push your changes to remote repository with all refs (branches).
