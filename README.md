# HEIG-VD DAI 2023/24 - Practical Works by @lutonite

This is the repository for the practical works done as part of the DAI (Développement d'Applications Internet) course at
HEIG-VD.

## Modules

|   Module directory    |                                               Description                                               |
|:---------------------:|:-------------------------------------------------------------------------------------------------------:|
|  `dai-dependencies`   |              Common module that regroups dependencies for the monorepo in a central place               |
|     `dai-parent`      |   Parent module for all practical work modules that sets up the basic utilities and packaging options   |
|   `pw-hello-world`    |               The first practical module implementend as part of Chapter 4 of the course                |
|   `pw-io-benchmark`   |     Practical content from Chapter 5 of the course, where we had to benchmark different IO classes      |
| `pw-cli-ioprocessing` | The module for the first practical work, where it is requested to build a CLI for basic file processing |

## How to run the practical works

> **Note**
> Build artifacts are provided for every commit. In the case you do not want to compile
> the project, you can fetch the latest build artifact for every module from the `Actions` tab

### Prerequisites

You need Java 17 to run this project. Maven is also required, but available through the wrapper.

### Build

> **Note**
> For IntelliJ users, you can import the project as a Maven project and use the IDE to build the project,
> a run configuration is already set up for each module.

To build only one module, run the following command from the root of the project:

```shell
./mvnw clean package -am -pl <module-name>
```

For example, to build the `pw-hello-world` module, run:

```shell
./mvnw clean package -am -pl pw-hello-world
```

### Run

To run a module, run the following command from the root of the project:

```shell
java -jar <module-name>/target/<module-name>-<version>.jar
```

For example, to run the `pw-hello-world` module, run:

```shell
java -jar pw-hello-world/target/pw-hello-world-1.0.0-SNAPSHOT.jar
```

## Writing modules

Each practical work done through the course should be implemented as a module in this repository.
The `pom.xml` should inherit from `dai-parent`, which includes all the ground work for getting a runnable module easily.

As a basic rule, each module should be tested through some unit tests, using JUnit.

The code is checked using Checkstyle when opening a pull request, you can install the Checkstyle IntelliJ plugin to
get inlined feedback on your code inside the editor. The configuration file is located at the root of the repository.
