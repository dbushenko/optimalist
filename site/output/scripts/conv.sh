#!/bin/sh
convert $1 -resize 40% $1.jpg
rm -f $1
mv $1.jpg $1

