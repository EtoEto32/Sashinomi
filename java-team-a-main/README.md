# java-team-a
2024年セレスのハッカソンで利用するリポジトリ

## 開発環境

- Docker Desktop
- JDK 17(ローカル PC にインストールの必要あり)
- SpringBoot 3.3.2
- VScode
- MYSQL

## ローカル開発

以下のコマンド実行でアプリが起動します
`bash start.sh` or `sh start.sh` 

それでも動かない場合は.shファイル内のコマンドを直接ターミナルで実行

公開URL : http://localhost:8080/ (デバック対応)


# アーキテクチャ

MVC + Repository
https://smallit.co.jp/blog/a2517/

## フロント

- Thymeleaf
  Java の Web アプリケーションで利用できるテンプレートエンジンの一つ
  https://qiita.com/thirai67/items/64fd18810a8ccfedd459

## DB 周り

- lombok
  アノテーションを付与するだけで getter、setter、toString メソッド等をコンパイル時に自動生成してくれます
  https://qiita.com/toranoko92114/items/05cf2dfeab3f2a46ae56

- Spring Data JPA
  Spring boot でデータベースにアクセスできるライブラリ/フレームワーク
  https://qiita.com/rennnosuke/items/2d3a06ac5a755c656d4b
  https://qiita.com/__x__/items/7e0003a949ce4c6cedd0
  https://qiita.com/shindo_ryo/items/af7d12be264c2cc4b252

## VScode拡張機能

- Prettier - Code formatter
https://ralacode.com/blog/post/vscode-prettier/
- Extension Pack for Java
- Java
- Spring Boot Extension Pack

## Java コードのフォーマット設定

VSCode の設定（Ctrl+,）を開きます。
検索バーに「Java Formatter」と入力し、「Java › Format: On Save」を有効にします。これにより、ファイル保存時に自動的にコードがフォーマットされます。
