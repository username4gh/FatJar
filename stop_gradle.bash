#! /usr/bin/env bash

ps aux | grep gradle | grep -vi 'grep' | awk '{print $2}' | xargs kill -9

echo "rm -rf .gradle"
rm -rf ./gradle

echo "rm -rf sample/build"
rm -rf app/build
