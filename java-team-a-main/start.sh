#!/bin/bash

#コンテナ起動
docker compose up -d --build
cd project
#ソースコードの変化を監視（ホットリロード用
./gradlew build --continuous

##(動かない場合)
# gradlew build --continuous