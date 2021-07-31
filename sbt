#!/bin/bash
# sbt.sh: Sharad Build Tool

. sbt-usage
. sbt-build

case $1 in

        build)
                echo "Building sharad server"
                build
                ;;

        publish)
                echo "Publishing sharad server"
                ;;
        *)
                echo "Unknown command $1" >&2
                usage
                exit 1
                ;;
esac
