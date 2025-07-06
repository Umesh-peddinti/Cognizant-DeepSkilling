package com.example.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class MyServiceArgumentTest {

    @Test
    void testArgumentMatching() {
        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getDataForUser(eq("umesh"))).thenReturn("Data for umesh");

        MyService service = new MyService(mockApi);

        // Act
        String result = service.fetchDataFor("umesh");

        // Assert
        verify(mockApi).getDataForUser(eq("umesh"));  // match argument
    }
}
