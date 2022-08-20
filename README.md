# Spring Boot - Prototype injection 


    We have a scenario to get the prototype bean from singleton
    class but when we get the prototype bean then it will be
    treated as a singleton because it is injected in 
    another singleton class. To solve this problem

    - ApplicationContext
    - ObjectFactory
    - LookUp (Best way) : @Lookup tells Spring to return an 
                instance of the method's return type when we invoke it.



