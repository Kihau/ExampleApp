# Android Example App
VERY basic android project template 

## About
The idea behind this template is to:
  - strip out unnecessary files 
  - get rid of unnecessary settings
  - simplify directory structure


## Requirements
- Android SDK: [android-sdk](https://developer.android.com/studio)

    You can download either Android Studio or stand-alone command line tools (at the bottom of the page)
    

- Java 8: [java-download](https://www.java.com/en/download/)

## Command line setup (no android studio)
When building from command line; you need to create a `local.properties` file in the project root and set up corrent sdk.dir.
- Example `local.properties` file content:
```
sdk.dir=C:/Users/Example/AndroidSDK
```
Alternatively, setting correct environment variables might be sufficient (untested)

## Building
- Android Studio:
  
  click the compile button :)
- Linux command line:
```sh
./gradlew buildDebug
```
- Windows command line:
```
./gradlew.bat buildDebug
```
