import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestApplication {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testAppIsWorking() {
        ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
        assertEquals(200, response.getStatusCodeValue());
        assertTrue(response.getBody().contains("Hello World!"));
    }
}