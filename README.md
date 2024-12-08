# Java Methods

**Author: Jeet Soni**

**Date: 12/07/2024**

## Description

After learning Python, I decided it was time to pick up another language. What better language than Java? I started self-learning Java through Udemy. So far, I have learned about variables, casting, primitive types, operators, and methods. I decided to do an assignment to explore how Java works and see how amazing it is.

It's often said, "If you know one programming language, it's easier to learn others." I found this to be very true!

## Problems I Worked On

### 1. Write a method called `checkNumber` with an `int` parameter named `number`. The method should not return any value, and it needs to print out:

- **"positive"** if the parameter `number` is greater than 0.
- **"negative"** if the parameter `number` is less than 0.
- **"zero"** if the parameter `number` is equal to 0.

I created a method `checkNumber` that takes an integer parameter `number`. I used if-else-if statements to determine if the number is greater than, less than, or equal to 0. If it's greater than 0, it's positive; if less than 0, it's negative; and if equal to 0, it's zero.

### 2. Write a program that converts kilometers per hour to miles per hour.

I created a method that takes one parameter `kilometersPerHour` and returns a `long` value. First, I checked if `kilometersPerHour` was less than 0, in which case the input is considered invalid. I then used the formula to convert kilometers to miles. After that, I created another method called `printConversion` that takes a `kilometersPerHour` parameter. Inside this method, I called the `toMilesPerHour` method and passed the parameter. Finally, I called the method from the main method.

### 3. Write a program that calculates whether a year is a leap year or not.

I created a method with a `boolean` return type and an `int` parameter. I used the leap year formula with if-else statements to determine whether the year is a leap year or not.

### 4. Write a method named area with one double parameter named radius. Write another overloaded method with two parameters x and y, where x and y represent the sides of a rectangle.

I used method overloading to find the area of a circle and a rectangle. I declared an `area` method with one parameter to find the area of a circle. Then, I used the `area` method again with two parameters to find the area of a rectangle.

### 5. Create a program that determines the equivalent years and days based on a given input in minutes.

I created a method that takes an `int` parameter named `minutes`. To calculate the years and days, I divided `minutes` by `525,600` (the number of minutes in a year). Then, I used the modulus operator (`%`) to find the remaining minutes (`minutes % 525,600`). Finally, I divided the remaining minutes by `1,440` (the number of minutes in a day) to calculate the days.

## Conclusion

This was such a fun assignment! I’ve realized how essential methods are and know I’ll be using them as long as I continue coding. My top priority was learning them well so that I’d never forget.

Hope you all enjoyed it as much as I did! :smile: 

Made with :heart: by Jeet Soni

