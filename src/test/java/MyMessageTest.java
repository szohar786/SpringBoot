package com;
  
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MyMessage;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MyMessageTest {
	String ab="Sarfaraj";
	MyMessage xy = new MyMessage();
        @Test
        public void sayHello() {
            Assertions.assertEquals(xy.Hello(ab), "Hello Sarfaraj");
    }
        @Test
        public void sayHi() {
            Assertions.assertEquals(xy.Hi(ab), "Hi Sarfaraj");
    }
        @Test
        public void sayBye() {
            Assertions.assertEquals(xy.Bye(ab), "Bye Sarfaraj");
    }
        @Test
        public void sayBestLuck() {
            Assertions.assertEquals(xy.BestLuck(ab), "Best of luck Sarfaraj");
    }
        @Test
        public void sayCongrats() {
            Assertions.assertEquals(xy.Congrats(ab), "Congrats Sarfaraj");
    }
}
