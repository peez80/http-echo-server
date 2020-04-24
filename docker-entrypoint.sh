#!/bin/sh
# Disclaimer: I know building and starting during container runtime is not beautiful but this is just for sake of quick implementation
cd /app
gradle installDist
cd build/install/app
./bin/app