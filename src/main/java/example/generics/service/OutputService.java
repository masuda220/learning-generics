package example.generics.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OutputService {

    // OutputRepositoryインタフェースを実装したすべてのクラスのオブジェクトを持つMap
    // Spring Frameworkが、自動的に実装クラスの検出・生成・Mapへのputを行う
    // MapのキーはBean名
    // Bean名は@Componentのvalue属性で指定できる
    // value属性を指定していない場合は、クラス名になる

    Map<String, OutputRepository> repositoryMap;

    public OutputService(Map<String, OutputRepository> repositoryMap) {
        this.repositoryMap = repositoryMap;
    }

    // 総称型のメソッドを定義する
    // repositoryMapから、Bean名をキーに該当リポジトリを取得して実行
    public <T> void output(List<T> source, String type) {
        OutputRepository repository = repositoryMap.get(type);
        repository.write(source);
    }
}
