# ---------------------------------------------------------------------
#   Use openjdk Java 11.
#   Tested with openjdk Java 11 on Linux.
#   Tested with openjdk Java 11 on windows.
# ---------------------------------------------------------------------

echo `date +%Y-%m-%d:%H:%M:%S.%N` "begin"

JARDIR="../"
JARS="$JARDIR/dist/KRR-PARSER.jar:$JARDIR/lib/antlr-runtime-3.5.3.jar"

java -cp $JARS krr.main.Tool -PL   -DEBUG  input/PL-01.txt   1>output/PL-01-DEBUG.xml
java -cp $JARS krr.main.Tool -FOL  -DEBUG  input/FOL-01.txt  1>output/FOL-01-DEBUG.xml
java -cp $JARS krr.main.Tool -HC   -DEBUG  input/HC-01.txt   1>output/HC-01-DEBUG.xml
java -cp $JARS krr.main.Tool -DL   -DEBUG  input/DL-01.txt   1>output/DL-01-DEBUG.xml
java -cp $JARS krr.main.Tool -MAN  -DEBUG  input/MAN-01.txt  1>output/MAN-01-DEBUG.xml
java -cp $JARS krr.main.Tool -PSYS -DEBUG  input/PSYS-01.txt 1>output/PSYS-01-DEBUG.xml

java -cp $JARS krr.main.Tool -PL    input/PL-01.txt   1>output/PL-01.xml
java -cp $JARS krr.main.Tool -FOL   input/FOL-01.txt  1>output/FOL-01.xml
java -cp $JARS krr.main.Tool -HC    input/HC-01.txt   1>output/HC-01.xml
java -cp $JARS krr.main.Tool -DL    input/DL-01.txt   1>output/DL-01.xml
java -cp $JARS krr.main.Tool -MAN   input/MAN-01.txt  1>output/MAN-01.xml
java -cp $JARS krr.main.Tool -PSYS  input/PSYS-01.txt 1>output/PSYS-01.xml

java -cp $JARS krr.main.Tool -PL   -DEBUG  input/PL-01-OP.txt   1>output/PL-01-OP-DEBUG.xml
java -cp $JARS krr.main.Tool -FOL  -DEBUG  input/FOL-01-OP.txt  1>output/FOL-01-OP-DEBUG.xml
java -cp $JARS krr.main.Tool -DL   -DEBUG  input/DL-01-OP.txt   1>output/DL-01-OP-DEBUG.xml
java -cp $JARS krr.main.Tool -PSYS -DEBUG  input/PSYS-01-OP.txt 1>output/PSYS-01-OP-DEBUG.xml

java -cp $JARS krr.main.Tool -PL    input/PL-01-OP.txt   1>output/PL-01-OP.xml
java -cp $JARS krr.main.Tool -FOL   input/FOL-01-OP.txt  1>output/FOL-01-OP.xml
java -cp $JARS krr.main.Tool -DL    input/DL-01-OP.txt   1>output/DL-01-OP.xml
java -cp $JARS krr.main.Tool -PSYS  input/PSYS-01-OP.txt 1>output/PSYS-01-OP.xml

echo `date +%Y-%m-%d:%H:%M:%S.%N` "end"
