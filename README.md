# Template for Gradle plugin

## Description

The plugin sources are contained in the directory [src/](src/main/java/org/ow2/proactive/gradle/). It contains a task called example that can be called by using the plugin in another gradle project. The task example display on the output the content of a parameter that should be declared in the build.gradle. An example is available in the [example/](example/) directory.

## Build step

On Linux
```
./gradlew install
```

On Windows
```
gradlew.bat install
```

## Run the example

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
