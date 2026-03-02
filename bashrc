runtest() {
    # $1 is the first word you type after 'runtest'
    mvn compile test-compile exec:java -Dexec.classpathScope="test" -Dexec.mainClass="com.mycompany.app.$1"
}
