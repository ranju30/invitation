rm -rf out/*
javac -d out/ src/app/* src/cli/* src/designs/* src/filters/* src/guest/* src/display/* src/io/* src/sortData/*
java -cp "out/" app/PrintLabels $@
