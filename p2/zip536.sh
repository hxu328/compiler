#!/bin/bash
# Shell script for zipping CS536 project. 
# @author Huan Xu <https://github.com/hxu296>

usage()
{
  echo "Usage: $0 [ -1 | --name1 \"LASTNAME.FIRSTNAME\" ] 
                 [ -2 | --name2 \"LASTNAME.FIRSTNAME\" ] 
                 [ -p | --project PROJECT ]
                 [ -x | --ignore \"REGEX1 REGEX2 ...\"]"
  exit 2
}

PARSED_ARGUMENTS=$(getopt -a -n $0 -o h1:2:p:x: --long help,name1:,name2:,project:,ignore: -- "$@")
VALID_ARGUMENTS=$?
if [ "$VALID_ARGUMENTS" != "0" ]; then
  usage
fi

eval set -- "$PARSED_ARGUMENTS"
while :
do
  case "$1" in
    -h | --help)    usage ;;
    -1 | --name1)   NAME1=$(echo $2 | tr '[:upper:]' '[:lower:]'})  ; shift 2 ;;
    -2 | --name2)   NAME2=$(echo $2 | tr '[:upper:]' '[:lower:]')   ; shift 2 ;;
    -p | --project)   PROJECT=$(echo $2 | tr '[:upper:]' '[:lower:]')   ; shift 2 ;;
    -x | --ignore)  IGNORE=$2 ; shift 2 ;;
    --) shift; break ;;
    *) echo "Unexpected option: $1 - this should not happen."
       usage ;;
  esac
done

if [ -z "$NAME1" ] || [ -z "$NAME2" ] || [ -z "$PROJECT" ]; then 
    usage
fi

if [ -e Makefile ] || [ -e makefile ]
then
    make clean > /dev/null  # clean before archiving
fi

ZIPNAME=$NAME1.$NAME2.$PROJECT.zip
if [ -e $ZIPNAME ]
then
    rm $ZIPNAME  # start fresh
fi

zip -9 -r $ZIPNAME . -x $0 .* $IGNORE > /dev/null
echo "Zip File Structure:"
echo $ZIPNAME
zip -sf $ZIPNAME | tail -n +2 | head -n -1 | awk -F/ 'NF <= 2' | sort | sed -e 's/^\s*/|──/'
