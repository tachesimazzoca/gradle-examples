# gradle-examples-base

This example demonstrates the set of lifecycle tasks provided by the base plugin.

## Usage

```bash
$ ./gradlew check
...
* What went wrong:
A problem occurred evaluating root project 'gradle-examples-base'.
> assert file("./docs/README.md").exists()
...

$ touch docs/README.md

$ ./gradlew check
BUILD SUCCESSFUL in ...

$ ./gradlew build

$ md5sum build/distributions/docs-0.1.0.zip
2573d2a67ca38d4d205e4cdbd6770355 *build/distributions/docs-0.1.0.zip

$ ./gradlew clean
```
