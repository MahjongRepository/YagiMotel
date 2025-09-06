#!/bin/bash

protoc --plugin=protoc-gen-pbandk=./protoc-gen-pbandk --pbandk_out=kotlin_service_gen='./twirp-kmp-generator-1.0.0.jar|com.collectiveidea.twirp.Generator',kotlin_package=org.yagi.motel.pantheon.api:./ mimir.proto
