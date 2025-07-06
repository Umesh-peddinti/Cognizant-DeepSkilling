package com.example.mockito;

public class MyService {
    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String[] fetchMultiple() {
        return new String[] {
            externalApi.getNextData(),
            externalApi.getNextData(),
            externalApi.getNextData()
        };
    }
}
