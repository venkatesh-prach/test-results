#### Code assignment Java developer

1. **Can you implement the sing() method for the bird?**
>>a. How did you unit test it? 
 >>>__implemented the JUnit Test Case__
>>b. How did you optimize the code for maintainability?
>>>__Optimized the current code by seperating the classess into different files, can see the diffrence with *com.singtel.test.before.optimize*, *com.singtel.test.after.optimize*. And also I have introduced the Default Abstarction class, which will decoupling the enforcing of interface implimation approch. Henece, Code will easily maintainable.__

2. **Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?**
>>a. A duck says: “Quack, quack”
>>b. A duck can swim
>>c. A chicken says: “Cluck, cluck”
>>d. A chicken cannot fly 
-	Introduced Duck, Chicken Classes and Sound Interface

3. **Now how would you model a rooster?**
>>a. A rooster says: “Cock-a-doodle-doo”
>>b. How is the rooster related to the chicken?
>>c. Can you think of other ways to model a rooster without using inheritance?
-	Rooster is  type of Chicken

4. **Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.**
>>a. A parrot living with dogs says: “Woof, woof”
>>b. A parrot living with cats says: “Meow”
>>c. A parrot living near the rooster says: “Cock-a-doodle-doo”
>>d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?

- Added Utill logic inside parrot Java Class