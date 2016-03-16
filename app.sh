rm -rf out/*
javac -d out/ src/app/* src/argumentHandler/* src/designs/* src/filters/* src/guest/* src/print/* src/readFile/* src/sortData/*
java -cp "out/" app/PrintLabels $@
