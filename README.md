# Teaching-HEIGVD-AMT-Framework-SDK
This repo was created to facilitate the implementation of third-party services that can be added to the AMT Framework Server (see [this repo](https://github.com/SoftEng-HEIGVD/Teaching-HEIGVD-AMT-Framework).

## Procedure

### 1. Fork this repo

### 2. Refactor the package and class names

* In this repo, we have created a simple `JokesService` in the `com.wasabi` package. Rename these two elements with your own values.

### 3. Modify the unit tests

* Observe that the `JokesServiceTest` class extends `ServiceTest`, a class that is part of the SDK and that performs a couple of tests for you.
* Add test methods to fully test the logic of your service (instead of the `itShouldProvideATellJokeOperation` placeholder).

### 4. Implement the service

* Implement the `execute` and `getHelpMessage` methods in your service class. 

### 5. Build your project and share your .jar file

* The person running the AMT framework will add your .jar file in the `third-party-libs` to be able to use it. 
* Depending on the version of the framework, the person will either have to update the framework code to load your class or to update a configuration file.







