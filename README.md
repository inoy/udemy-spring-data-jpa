# udemy-spring-data-jpa

## スキーマ作成

```sql
CREATE DATABASE IF NOT EXISTS mydb CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```

## テーブル作成

```sql
create table product(
  id int PRIMARY KEY,
  name varchar(20),
  description varchar(100),
  price decimal(8,3)
);

create table employee(
  id int,
  name varchar(20)
)
```

## Lombok

pom.xml

```xml
<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.12</version>
    <scope>provided</scope>
</dependency>
```

## 進捗

8/30(日) 開始

| 日  | 目標 | 実績 | 進捗 | 目標比 |
| --- | ---- | ---- | ---- | ------ |
| 日  | 65   | 65   | 65   | +0     |
| 月  | 76   |      |      |        |
| 火  | 81   |      |      |        |
| 水  | 98   |      |      |        |
| 木  | 104  |      |      |        |
| 金  | 123  |      |      |        |
| 土  | 139  |      |      |        |
| 日  | 150  |      |      |        |

〜 247
