# KotlinExample

## Overview:
* Now that Google has embraced Kotlin—making it an official language on Android— cross-platform development has become a lot simpler. 
* The striking similarities between Swift and Kotlin make maintaining an app across iOS and Android more intuitive. 
* Highlighting the similarities and differences between Kotlin and Swift by looking at Swift code examples and walking through how to code Kotlin equivalents. 
* Kotlin is a concise new programming language that's used for Android development and in other Java-based environments.
* Among its many benefits, Kotlin is 100% compatible with Java and is fully supported by Google. 

## Objective:
* Comprehensive overview of the most essential features of Kotlin, specifically the version that runs on the Java Virtual Machine (JVM). 
* Project setup, through rudimentary syntax, to working with variables and creating custom classes. 
* Display program flow with functions, loops, conditional statements, and try/catch exception handling. 
* Display how to manage data in memory with fixed-size arrays and dynamic data collections: lists, sets, and maps. 
* Describes how to implement inheritance-a key feature of reusable, object-oriented code-with classes, interfaces, anonymous objects, and anonymous functions (aka lambda expressions).
* Demonstrate working with simple values and complex objects such as data collections.
* Show you how to manage programming flow with conditional statements and loops.
* Explore a variety of ways to create reusable code in Kotlin with functions, classes, interfaces, enumerations, and more. 

## Overview:
* Now that Google has embraced Kotlin—making it an official language on Android— cross-platform development has become a lot simpler. 
* The striking similarities between Swift and Kotlin make maintaining an app across iOS and Android more intuitive. 
* Highlighting the similarities and differences between Kotlin and Swift by looking at Swift code examples and walking through how to code Kotlin equivalents. 

## Brief overview of Kotlin:
* Different types of Kotlin available:
    * We have Kotlin Server Side, which will be a great language for APIs. 
    * Kotlin JavaScript, which is a client side solution. 
    * Kotlin Native, a cross-platform native solution. 
    * Kotlin Android, It's a stable, already native to Android solution, and most importantly, it's sanctioned by Google. 
        * Both Swift and Kotlin have been under development since 2010. 
        * JetBrains actively uses Kotlin in building their own IDEs. 
        
* Kotlin was released to the public within a year, while Swift remained experimental and was not released to the public until four years later.
* It took Kotlin about six years to feel confident enough to move out of beta. 
* Swift, on the other hand, has had a new version annually, with many of the versions containing breaking changes. 
* Kotlin and Swift are both officially supported on their respective platforms. 
* Kotlin updates are optional because it's based on a plugin that you use in the IDE, while Swift updates have been historically mandatory because the new versions of Xcode require you to use the latest Swift version.
* Kotlin doesn't need a runtime compiled into the application because it all gets compiled down bytecode similar to Java. 
* Because of this, it's more interoperable and easy to work with Java, unlike Swift and Objective-C. 

* JetBrains: 
    * They're a company that's been around since 2000, and they build IDEs and utilities for developers. 
    * We may have used the ReSharper plugin, IntelliJ for Java, or one of their other IDEs. 
    * Their whole business is focused on making coding easier for you.
    
## Similarities and differences from Swift:

* Functions in Kotlin are very similar. 
* Variables in Kotlin are going to be, again, pretty similar and that's the great thing about Kotlin is how similar it is to Swift and what we will be working with. 
* So, in Kotlin we have a var, it's the same type of thing and we also have the concept of a constant.
* but instead of let, they call it a val. 
* And just like in Swift, you can use implicit types, so the top two variables were integers, or we can explicitly say that this is a double.

And Kotlin has the same data types that you would expect, they have integers, doubles, floats, strings, all of those types of things are similar in Kotlin. And now, let's look at how optionals are handled within Kotlin. Again, we do have the concept of optionals, which is fantastic to work with. But unwrapping them is a little bit different within Kotlin. We have the word null instead of nil, and we don't have to escape variables that way.

We can just put a dollar before them, or we can put dollar, brace and do some more complicated computations within those braces. Prints are a little bit different within Kotlin. Print will print, but it won't print a new line. So typically you would convert these to a new line if you want a message on each line. And we don't have a characters array, we just can call it like this and again we have that question mark operator which is great for us to unwrap something that could potentially be nil.

Kotlin also has a way to force unwrapped variables. But instead of a single exclamation point, they use two exclamation points. 
And this just means that Android studio understands that a value has already been assigned to that variable, so we don't have to unwrap it like you would in Swift.

we have to either explicitly unwrap it or provide some sort of default value. But in Kotlin, it understands that it can implicitly use the result that you've applied to it and we don't have to unwrap it at all. So, in working with Kotlin, we'll also want to unwrap variables at the beginning to make sure that they're not nil. So let's go ahead and convert this to a Kotlin-type function.

And we don't have a guard statement unfortunately, but we can do something similar to it. We can say val arg = someArg.let and what let does, it returns whatever the result is and it lets you work with it. Otherwise, if that return's nil, you can just return from the block or you could give it some sort of default value. SO this is one way that you can do something that's similar to a guard statement. Another way to do this, we can say, fun doSomething2, someArg, string, and in here, we'll say someArg and we'll use that same let construct, and this just means, if it is not null, go ahead and do this next block.

So we'll just say do something, and then we'll print out whatever it is, and it is just like the dollar zero is in any Swift-type block. So those are the two types of construct that you can work with to have something similar to a guard statement.






