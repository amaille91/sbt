#!/bin/bash
# sbt.sh: Sharad Build Tool

. sbt-usage
. sbt-build
. sbt-test

case $1 in

        build)
                echo "Building sharad server"
                sbt-build
                ;;
        test)
                echo "Running sharad-server's unit tests"
                sbt-test
                ;;

        publish)
                echo "Publishing sharad server"
                ;;
        *)
                echo "Unknown command $1" >&2
                sbt-usage
                exit 1
                ;;
esac
