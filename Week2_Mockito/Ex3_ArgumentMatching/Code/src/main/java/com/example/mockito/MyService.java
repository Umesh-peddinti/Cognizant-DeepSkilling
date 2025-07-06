package com.example.mockito;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchDataFor(String username) {
        return api.getDataForUser(username);
    }
}
