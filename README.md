#### Code assignment Java developer

1. **Can you implement the sing() method for the bird?**
>>a. How did you unit test it? 
 >>>__implemented the JUnit Test Case__
>>b. How did you optimize the code for maintainability?
>>>__Optimized the current code by seperating the classes into different files, can see the diffrence with *com.singtel.test.before.optimize*, *com.singtel.test.after.optimize*. And also I have introduced the Default Abstarction class, which will decoupling the enforcing of interface implimation approch. Henece, Code will easily maintainable.__

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

##### B. Model fish as well as other swimming animals
1. **In addition to the birds, can you model a fish?**
>>a. Fishes don’t sing
>>b. Fishes don’t walk
>>c. Fishes can swim
- Added Fish and Swimming Animal java classes

2. **Can you specialize the fish as a Shark and as a Clownfish?**
>>a. Sharks are large and grey
>>b. Clownfish are small and colourful (orange)
>>c. Clownfish make jokes
>>d. Sharks eat other fish
- Added Shark and Clownfish Java classes

3. **Dolphins are not exactly fish, yet, they are good swimmers**
>>a. Can you model a dolphin that swims without inheriting from a fish class?
>>b. How do you avoid duplicating code or introducing unneeded overhead?
- Both Dolphins and Fish are Swmiing animals, hence, it will inherit the swimming behavior from the SwimmingAnimals not from Fish. Code has modified for the same
