package com.example.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MyServiceVoidTest {
    @Test
    void testLoggerCalled() {
        Logger mockLogger = mock(Logger.class);
        MyService service = new MyService(mockLogger);
        service.doWork("important");
        verify(mockLogger).log("Task done: important");
    }
}
