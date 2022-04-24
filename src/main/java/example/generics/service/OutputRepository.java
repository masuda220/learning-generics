package example.generics.service;

import java.util.List;

public interface OutputRepository {

    // 総称型（ジェネリクス）のメソッドを定義
    // 引数のListの要素の型をパラメータ化
    <T> void write(List<T> source);
}
