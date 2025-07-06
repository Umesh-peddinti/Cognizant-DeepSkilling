package com.example.mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MyServiceMultipleReturnsTest {
    @Test
    void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getNextData())
            .thenReturn("first", "second", "third");
        MyService service = new MyService(mockApi);
        String[] results = service.fetchMultiple();
        assertArrayEquals(new String[]{"first", "second", "third"}, results);
    }
}
