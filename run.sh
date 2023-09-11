#!/bin/bash

# Caminho para o executável Java
JAVA_EXECUTABLE="/usr/lib/jvm/java-8-openjdk-amd64/bin/java"

# Caminho para a pasta contendo seu código Java compilado (classes)
CLASS_PATH="/home/dnsouzadev/eclipse-workspace/worker-project/worker/bin"

# Nome da classe principal do seu aplicativo Java
MAIN_CLASS="App"

# Comando para executar o aplicativo Java
"$JAVA_EXECUTABLE" -cp "$CLASS_PATH" "$MAIN_CLASS"
