package kr.ac.koreatech.demo;

import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/* shell 에서 테스트 코드 
$ curl http://localhost:8080/
*/

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<Map<String, String>> index() {
        log.info("index() ...");

        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "message", "Hello World", "status", "ok"));
    }

}
