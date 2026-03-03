#!/bin/sh

# Chemin vers le fichier de base
SOURCE_FILE="CalculatorParamTest.java"

# Dossier cible
OUTPUT_DIR="generated-tests"
mkdir -p "$OUTPUT_DIR"

for i in $(seq 1 100); do
    TARGET_FILE="$OUTPUT_DIR/CalculatorParam${i}Test.java"

    sed \
        -e "s/class CalculatorParamTest/class CalculatorParam${i}Test/" \
        "$SOURCE_FILE" > "$TARGET_FILE"

    echo "✔️ Généré : $TARGET_FILE"
done