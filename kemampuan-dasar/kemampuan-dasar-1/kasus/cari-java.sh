#!/bin/bash
if [[ $(find $1 -name "*.java") ]]; then
echo "Ada file Java pada direktori"
find $1 -iname "*.java"
else
echo "Tidak ada file java"
fi
