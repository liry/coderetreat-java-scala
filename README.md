Pre-configured maven based app for simple Java or Scala app. One can start coding and testing right away.
Good starting point for [coderetreat](http://coderetreat.org) sessions.

If you want to write in Java, start with `src/test/java/coderetreat/java/GameOfLifeTest.java`.

If you want Scala, you can choose from these testing libraries:

* _specs2_ - then use `src/test/scala/coderetreat/scala/GameOfLifeSpec.scala`
* _scalatest_ - then use `src/test/scala/coderetreat/scala/GameOfLifeSuite.scala`

Use `mvn clean test` to compile and run tests.

Use `git reset --hard && git clean -f` command to return to the starting point.
