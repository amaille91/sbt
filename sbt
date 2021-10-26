#!/bin/bash
# sbt.sh: Sharad Build Tool

. sbt-usage
. sbt-build
. sbt-test

case "${1:-help}" in

        build)
                echo "Building sharad server"
                sbt-build
                ;;
        test)
                echo "Running sharad-server's unit tests"
                sbt-test
                ;;

        integration-test)
                echo "Running sharad-server's integration tests"
                sbt-integration-test
                ;;

        publish)
                echo "Publishing sharad server -- NOT YET IMPLEMENTED"
                ;;
        help)
                sbt-usage
                exit 1
                ;;
        *)
                echo "Unknown command $1" >&2
                sbt-usage
                exit 1
                ;;
esac
