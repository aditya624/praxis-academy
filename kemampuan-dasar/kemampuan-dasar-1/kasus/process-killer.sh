#!/bin/bash
echo "Masukkan Nama Program :"
read program
pid=$(pgrep $program)
echo "Memiliki No PID : $pid"
kill $(pgrep $program)


