# =========================
# CodeForge Makefile
# =========================

APP_NAME=CodeForge
MVN=mvn

# Default target
help:
	@echo "Available commands:"
	@echo " make clean        - Clean the project"
	@echo " make build        - Build the project"
	@echo " make run          - Run Spring Boot app"
	@echo " make test         - Run tests"
	@echo " make package      - Create jar file"

# Clean project
clean:
	$(MVN) clean

# Build project
build:
	$(MVN) clean install

# Run Spring Boot application
run:
	$(MVN) spring-boot:run

# Run tests
test:
	$(MVN) test

# Package jar
package:
	$(MVN) package

