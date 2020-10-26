# cmpe202
---
## design patterns used: 
### factory & decorator
It starts with the interface *GumballMachine.java*. The *GumballMachineDecorator.java* file implements this interface and each of the 3 gumball machines will extend from the decorator. 

## terminal output
### gumball machine 1

**input:**
```
GumballMachineDecorator gm1 = new GumballMachineDecorator();
gm1.insertCoin(25);
gm1.turnCrank();

gm1.insertCoin(10);
gm1.turnCrank();
```

**output:**
```
	Gumball Machine 1 - 25 Cents
 ---------------------------------------------------
Insert: 25
Thanks for your money.  Gumball(s) Ejected!

Insert: 10
Quarters only!
Please insert 25 cents for 1 gumball. Ejecting coins...
```

### gumball machine 2
**input:**
```
GumballMachine2 gm2 = new GumballMachine2(); 
gm2.insertCoin(25);
gm2.insertCoin(25);
gm2.turnCrank();

gm2.insertCoin(10);
gm2.turnCrank();
```

**output:**
```
	Gumball Machine 2 - 50 Cents, Quarters Only
 ---------------------------------------------------
Insert: 25
Insert: 25
Thanks for your money.  Gumball(s) Ejected!

Insert: 10
Quarters only!
Please insert 50 cents for 1 gumball. Ejecting coins...
```
### gumball machine 3
**input:**
```
GumballMachine3 gm3 = new GumballMachine3(); 
gm3.insertCoin(25); 
gm3.insertCoin(10); 
gm3.insertCoin(10); 
gm3.insertCoin(5); 
gm3.turnCrank(); 

gm3.insertCoin(1);
gm3.insertCoin(1);
gm3.turnCrank();
```

**output:**
```
	Gumball Machine 3 - 50 Cents, All Coins
 ---------------------------------------------------
Inserted: 25
Inserted: 10
Inserted: 10
Inserted: 5
Thanks for your money.  Gumball(s) Ejected!

Dimes, nickels or quarters only!
Dimes, nickels or quarters only!
Please insert 50 cents for 1 gumball. Ejecting coins...
```
