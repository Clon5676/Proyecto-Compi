# Definir variables
JAVAC = javac
JAVA = java
CLASSPATH = grupo06:.

# Fuentes y archivos compilados
SRC_DIR = compiler
SRC_FILES = $(wildcard $(SRC_DIR)/*.java)
CLASS_FILES = $(SRC_FILES:.java=.class)

# Regla para compilar todo
all: $(CLASS_FILES)

# Regla genérica para compilar archivos .java a .class
%.class: %.java
	$(JAVAC) -cp $(CLASSPATH) $<

# Regla para ejecutar el compilador
run: all
	@echo "Ejecutando el compilador..."
	cd $(SRC_DIR) && $(JAVA) -cp $(CLASSPATH) Compiler $(ARGS)

# Limpiar archivos compilados
clean:
	@echo "Limpiando archivos compilados..."
	rm -f $(SRC_DIR)/*.class

.PHONY: all clean run
