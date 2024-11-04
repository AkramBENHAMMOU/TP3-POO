# Java OOP Lab 3 - Exception Handling
### 📜 Created by: BENHAMMOU Akram
### 📜 Professor: Loubna AMINOU
### 📜 Submitted on: 04/11/2024
This lab focuses on implementing and handling exceptions in Java through three practical exercises.

## 🎯 Lab Objectives

- Understanding Java exception mechanisms
- Creating custom exception classes
- Handling try-catch blocks
- Managing exception stack traces

## 💻 Exercises

### Exercise 1: TropViteException

#### Description
Implementation of a custom exception to handle speed limit violations.

#### Classes
1. **TropViteException**
   - Inherits from `Exception`
   - Constructor taking an integer parameter
   - Formatted error message

2. **Vehicule**
   - Method `testVitesse(int vitesse)`
   - Throws exception if vitesse > 90
   - Test main included

#### Class `TropViteException`
inherits from Exception and takes an integer (vitesse) as parameter. It passes a custom message to the super-constructor.
   ```java
   public class TropViteException extends Exception {
       TropViteException(int vitesse) {
           super("C'est une exception de type TropViteException. Vitesse en cause : " + vitesse);
       }
   }
   ```

#### Class `Vehicule` has:
* a method `testVitesse(int vitesse)` that throws a TropViteException if the speed exceeds 90.
   ```java
   public void testVitesse(int vitesse) throws TropViteException {
       if (vitesse > 90) {
           throw new TropViteException(vitesse);
       }
   }
   ```
* a `main` method that creates a `Vehicule` object, tests the testVitesse() method with two values and displays the stack trace if the exception is thrown.
   ```java
   public static void main(String[] args) {
       Vehicule v = new Vehicule();

       try {
           v.testVitesse(69);
           System.out.println("No exception");
           v.testVitesse(120);
       } catch (TropViteException e) {
           e.printStackTrace();
       }
   }
   ```

### Exercise 2: RacineCarreeException

#### Description
Exception handling for calculating square roots of negative numbers.

#### Classes
1. **RacineCarreeException**
   - Inherits from `Exception`
   - Constructor with integer parameter
   - Custom message for negative numbers

2. **Calculateur**
   - Method `testRacineCarree(int entier)`
   - Validation of negative numbers
   - Tests with try-catch in main

#### Class `RacineCarreeException`
inherits from Exception and takes an integer as parameter. It passes a custom message to the super-constructor.
   ```java
   public class RacineCarreeException extends Exception {
       RacineCarreeException(int entier) {
           super("C'est une exception de type RacineCarreeException. Nombre négatif : " + entier);
       }
   }
   ```
#### Class `Calculateur` has:
* a method `testRacineCarree(int entier)` that throws a RacineCarreeException if the number is negative.
   ```java
   public void testRacineCarree(int entier) throws RacineCarreeException {
       if (entier < 0) {
           throw new RacineCarreeException(entier);
       }
   }
   ```
* a `main` method that creates a `Calculateur` object, tests the testRacineCarree() method with two values (-5 and 25) and displays the stack trace if the exception is thrown.
   ```java
   public static void main(String[] args) {
       Calculateur c = new Calculateur();

       try {
           c.testRacineCarree(-5);
           c.testRacineCarree(25);
           System.out.println("No exception");
       } catch (RacineCarreeException e) {
           e.printStackTrace();
       }
   }
   ```
### Exercise 3: NoteInvalideException

#### Description
Grade validation system with exception handling.

#### Classes
1. **NoteInvalideException**
   - Inherits from `Exception`
   - Verifies grade validity
   - Custom error message

2. **Evaluateur**
   - Method `verifierNote(int entier)`
   - Validates range [0-20]
   - Tests in main with try-catch

##### Class `NoteInvalideException`
inherits from Exception and takes an integer as parameter. It passes a custom message to the super-constructor.
   ```java
   public class NoteInvalideException extends Exception {
       public NoteInvalideException(int entier) {
           super("Exception de type NoteInvalideException. Note invalide : " + entier);
       }
   }
   ```
#### Class `Evaluateur` has:
* a method `verifierNote(int entier)` that throws a NoteInvalideException if the number is not between 0 and 20.
   ```java
   public void verifierNote(int entier) throws Exception {
       if (entier < 0 || entier > 20) {
           throw new NoteInvalideException(entier);
       }
   }
   ```
* a `main` method that creates an `Evaluateur` object, tests the verifierNote() method with two values and displays the stack trace if the exception is thrown.
   ```java
   public static void main(String[] args) {
       Evaluateur e = new Evaluateur();
       try {
           e.verifierNote(15);
           System.out.println("No exception");
           e.verifierNote(25);
       } catch (Exception f) {
           f.printStackTrace();
       }
   }
   ```

## 🛠 Project Structure

```
TP3-POO/
├── EXO1/
│   |── src
│        |── TropViteException
|        |── Vehicule
├── EXO2/
│   |── src
│        |── Calculateur
|        |── RacineCarreeException
├── EXO3/
    |── src
         |── Evaluateur
         |── NoteInvalideException
```

## 📝 Execution Instructions

1. Compile Java files:
```bash
javac EXO1/src/*.java
javac EXO2/src/*.java
javac EXO3/src/*.java
```

2. Run each main class:
```bash
java EXO1.src.Vehicule
java EXO2.src.Calculateur
java EXO3.src.Evaluateur
```

## 📚 Key Concepts

- Exception Inheritance
- Custom Exception Handling
- Try-catch Block Usage
- Stack Trace and Debugging
- Data Validation

## 🤝 Contribution

This project is a learning lab. Feel free to suggest improvements or report issues.