package com.example.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

class MyServiceInteractionOrderTest {
    @Test
    void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.doInOrder();
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).callA();
        inOrder.verify(mockApi).callB();
    }
}
