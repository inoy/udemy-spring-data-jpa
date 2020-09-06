# udemy-spring-data-jpa

## @OneToMany

OneToMany を設定したフィールに要素を追加する際は、以下のような add メソッドを用意して、子要素(PhoneNumber)に親要素を設定しながら(`p.setCustoemr(this)`)追加すると良い。

```java
public class Customer {
  // ...省略
  public void addPhoneNumber(PhoneNumber p) {
    if (number != null) {
      if (numbers == null) {
        numbers = new HashSet<>();
      }
      p.setCustomer(this);
      numbers.add(p);
    }
  }
}
```

Course.117 参照。

## Inheritance - JOINED Stragtegy

ユーザごとの設定情報をもつテーブルに使えるかも？

```sql
insert into `setting` (`user_id`, `setting_id`, `setting_value`) values
  (1, 'some_string_type_setting', '1'),
  (1, 'some_integer_type_setting', 1)
);
```

みたいなことがしたいとき、`setting_value`の型に`int`は設定できない。  
Inheritance で振り分ければ行けそう。

```java
@Inheritance(strategy = InheritanceType.XXX)
@DiscriminatorColumn(name="XXX", discriminatorType = DiscriminatorType.XX)
```

詳細は Course.95 あたりを参照。

## 進捗

8/30(日) 開始

| 日  | 目標 | 実績 | 進捗 | 目標比 |
| --- | ---- | ---- | ---- | ------ |
| 日  | 65   | 65   | 65   | +0     |
| 土  | 139  | 123  | 59   | -13    |
| 日  | 150  |      |      |        |

〜 247
