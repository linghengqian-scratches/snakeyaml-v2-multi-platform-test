# snakeyaml-v2-multi-platform-test

- For https://bitbucket.org/snakeyaml/snakeyaml/issues/1093 , https://github.com/apache/shardingsphere/issues/29429 and https://github.com/apache/shardingsphere/pull/28805 .

- Verified unit test under `Ubuntu 22.04.4 LTS` with `Docker Engine` and `SDKMAN!`.

```bash
sdk install java 17.0.11-ms
sdk use java 17.0.11-ms

git clone git@github.com:linghengqian/snakeyaml-v2-multi-platform-test.git
cd ./snakeyaml-v2-multi-platform-test/
./mvnw clean test
```

- The log is as follows.
```bash
$ ./mvnw clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------< com.lingh:snakeyaml-v2-multi-platform-test >-------------
[INFO] Building snakeyaml-v2-multi-platform-test 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ snakeyaml-v2-multi-platform-test ---
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/snakeyaml-v2-multi-platform-test/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ snakeyaml-v2-multi-platform-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/snakeyaml-v2-multi-platform-test/src/main/resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ snakeyaml-v2-multi-platform-test ---
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ snakeyaml-v2-multi-platform-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/snakeyaml-v2-multi-platform-test/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ snakeyaml-v2-multi-platform-test ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 1 source file with javac [debug target 17] to target/test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ snakeyaml-v2-multi-platform-test ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.lingh.SnakeYamlTest
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.085 s <<< FAILURE! -- in com.lingh.SnakeYamlTest
[ERROR] com.lingh.SnakeYamlTest.testSnakeYaml -- Time elapsed: 0.070 s <<< FAILURE!
java.lang.AssertionError: 

Expected: is "name: test\r\n"
     but: was "name: test\n"
        at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)
        at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:6)
        at com.lingh.SnakeYamlTest.testSnakeYaml(SnakeYamlTest.java:20)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   SnakeYamlTest.testSnakeYaml:20 
Expected: is "name: test\r\n"
     but: was "name: test\n"
[INFO] 
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.829 s
[INFO] Finished at: 2024-07-17T18:01:09+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.5:test (default-test) on project snakeyaml-v2-multi-platform-test: There are test failures.
[ERROR] 
[ERROR] Please refer to /home/linghengqian/TwinklingLiftWorks/git/public/snakeyaml-v2-multi-platform-test/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```