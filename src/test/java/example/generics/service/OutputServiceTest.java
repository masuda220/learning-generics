package example.generics.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OutputServiceTest {

    @Autowired
    OutputService service;

    @Test
    void output() {
        // output()メソッドはvoid型
        // 実行できればOKとする

        // List<String>で実行
        service.output(List.of("abc", "xyz"), "stringOutput");

        // List<Integer>で実行
        service.output(List.of(1, 2), "integerOutput");
    }

}