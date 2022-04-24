package example.generics.datasource;

import example.generics.service.OutputRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StringOutput implements OutputRepository {

    // OutputRepositoryインタフェースで総称型で定義したメソッドを具体的な型でオーバーライド
    @Override
    public <String> void write(List<String> source) {
        System.out.println("T=String:" + source);
    }
}
