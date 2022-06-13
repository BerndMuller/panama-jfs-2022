# FFM with Java 17

Compile with maven. Toolchain with Java 17 required.

Run ProcessId:

```
/java/jdk/jdk-17.0.2/bin/java -cp target/classes --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign de.pdbm.ProcessId
```

Run Quicksort:

```
/java/jdk/jdk-17.0.2/bin/java -cp target/classes --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign de.pdbm.Quicksort
```

Run ProcessIdWithJextract:

```
/java/jdk/jdk-17.0.2/bin/java -cp target/classes --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign de.pdbm.ProcessIdWithJextract
```

To generate helper classes (done on Fedora 35) with ``jextract`` run:

```
/java/jdk/openjdk-17-panama+3-167/bin/jextract --source -d src/main/java -t unistd -I /usr/include /usr/include/unistd.h
```

If you omit ``--sources`` only the class files are generated. You have to put them in ``target/classes``, of course.

You can download the ``jextract`` JDK at [https://jdk.java.net/panama/17/](https://jdk.java.net/panama/17/).