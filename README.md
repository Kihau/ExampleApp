# Android Example App
VERY basic android project template.

## About
The idea behind this template is to:
  - Strip out unnecessary files.
  - Get rid of unnecessary settings.
  - Simplify directory structure.
  - Simplify build process.


## Requirements
- Android SDK: [android-sdk](https://developer.android.com/studio)

    You can download either Android Studio or stand-alone command line tools (at the bottom of the page)
    

- Java 17: [java-download](https://www.oracle.com/java/technologies/downloads/)


## Command line Android SDK setup (without android studio)

To build the project you need to have valid SDK licenses on your system. They can be created using the `sdkmanager` from 
the downloaded android command line tools.

Creating valid licenses using `sdkmanager`:
- Download and extract `commandline-tools.zip`
- Navigate to `./commandline-tools/bin` directory.
- Run the following command:

Linux:
```sh
./sdkmanager --sdk_root=/home/example/AndroidSDK --licenses

```
Windows:
```cmd
.\sdkmanager.bat --sdk_root=C:/Users/Example/AndroidSDK --licenses
```
    

## Command line project setup (without android studio)

When building from command line; you need to create a `local.properties` file in the project root and set up correct sdk.dir.
- Example `local.properties` file content:
```
sdk.dir=C:/Users/Example/AndroidSDK
```


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
