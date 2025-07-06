package com.example.mockito;

public class MyService {
    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void doInOrder() {
        externalApi.callA();
        externalApi.callB();
    }
}
