package gl51.tp1;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;

import org.junit.jupiter.api.Test;
import spock.lang.AutoCleanup;
import spock.lang.Shared;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class MovieControllerTest {


    @Shared @Inject
    EmbeddedServer embeddedServer

    @Shared @AutoCleanup
    @Inject @Client("/")
    RxHttpClient client

    void "test index"() {
        given:
        HttpResponse response = client.toBlocking().exchange("/movie")

        expect:
        response.status == HttpStatus.OK
    }
}
