package example.generics.datasource;

import example.generics.service.OutputRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IntegerOutput implements OutputRepository {
    // OutputRepositoryインタフェースで総称型で定義したメソッドを具体的な型でオーバーライド
    @Override
    public <Integer> void write(List<Integer> source) {
        System.out.println("T=Integer:" + source);
    }
}
