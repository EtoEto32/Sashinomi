@REM #コンテナ起動
docker compose up -d --build
cd project
@REM #ソースコードの変化を監視（ホットリロード用
./gradlew build --continuous

@REM ##(動かない場合)
@REM # gradlew build --continuous