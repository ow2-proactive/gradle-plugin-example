# Template for Gradle plugin

## Description

The plugin sources are contained in the directory [src/](src/main/java/org/ow2/proactive/gradle/). It contains a task called example that can be called by using the plugin in another gradle project. The task example display on the standard output the parameter `sentenceToDisplay`. This parameter should be declared in the build.gradle of the project that use the extension. An example is available in the [example/](example/) directory.

## Build step

The build step will build the plugin and upload in your maven local repository.

On Linux
```
./gradlew install
```

On Windows
```
gradlew.bat install
```

## Run the example

The follwing command will move your current directory to the example directory. Then it will run the example task with the -Plocal property in order to use the local maven repository to get the plugin.

On Linux
```
cd example
./gradlew example -Plocal
```

On Windows
```
cd example
gradlew.bat example -Plocal
```
