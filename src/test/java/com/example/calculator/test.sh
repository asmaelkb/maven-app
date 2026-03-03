#!/bin/sh

# Chemin vers le fichier de base
SOURCE_FILE="CalculatorEdgeCasesTest.java"

# Dossier cible
OUTPUT_DIR="generated-tests"
mkdir -p "$OUTPUT_DIR"

for i in $(seq 1 100); do
    TARGET_FILE="$OUTPUT_DIR/CalculatorEdgeCasesTest_$i.java"

    sed \
        -e "s/class CalculatorEdgeCasesTest/class CalculatorEdgeCasesTest_$i/" \
        -e "s/divide_precisionEdge/divide_precisionEdge_$i/" \
        -e "s/factorial_largeButSafe/factorial_largeButSafe_$i/" \
        "$SOURCE_FILE" > "$TARGET_FILE"

    echo "✔️ Généré : $TARGET_FILE"
done