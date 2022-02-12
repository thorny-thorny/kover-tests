import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JvmGreetersTests {
    @Test
    public void testJvmGreeters() {
        Assertions.assertAll(() -> {
            new JvmGreeterWithOptional();
            new JvmGreeterWithOptional("Thorny");
        });
    }
}
