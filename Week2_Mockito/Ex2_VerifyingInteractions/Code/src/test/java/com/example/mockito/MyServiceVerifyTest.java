package com.example.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class MyServiceVerifyTest {

    @Test
    void testVerifyInteraction() {
        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Anything");

        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();

        // Assert (verify interaction)
        verify(mockApi).getData();   // passes if called exactly once with no args
    }
}
