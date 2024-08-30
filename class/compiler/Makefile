# Makefile para compilar el proyecto del compilador

# Nombre del proyecto
PROJECT = Compiler

# Directorios
SRC_DIR = src    #Cambiamos esto y ya tenemos para que funcione el codigo
BIN_DIR = .

# Clases de salida
CLASSES = $(BIN_DIR)/$(PROJECT).class

# Lista de archivos fuente en src/
SOURCES = $(wildcard $(SRC_DIR)/*.java)

# Ruta completa para el compilador de Java (con comillas)
JAVAC = "C:\Program Files\Java\jdk-17\bin\javac"
JFLAGS = -d $(BIN_DIR)

# Compilación por defecto
all: $(CLASSES)

# Regla para compilar el archivo de salida
$(CLASSES): $(SOURCES)
	$(JAVAC) $(JFLAGS) $(SOURCES)

# Regla para limpiar archivos compilados
clean:
	del /Q $(BIN_DIR)\*.class

# Documentación del uso del makefile
help:
	@echo "Uso del Makefile:"
	@echo "  make        - Compila todos los archivos fuente .java"
	@echo "  make clean  - Elimina todos los archivos .class generados"
