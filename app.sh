rm -rf out/*
javac -d out/ src/app/* src/option/* src/guest/* src/designs/* src/filters/* src/print/*
java -cp "out/" app/PrintLabels $@
