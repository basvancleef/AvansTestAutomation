#!/bin/bash

# Run tests with coverage
echo "Running tests with coverage..."
dotnet test --collect:"XPlat Code Coverage"

# Get the latest added folder in TestResults
latest_folder=$(ls -td ./TestResults/*/ | head -n 1)

# Generate the coverage report
reportgenerator -reports:"$latest_folder/coverage.cobertura.xml" -targetdir:./coverage-report -reporttypes:Html