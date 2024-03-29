package com.mudit.api.Helper;

public enum ResponseStatus {
    Success(200),
    InternalServerError(500);

    private int responseCode;

    public int getResponseCode() {
        return responseCode;
    }

    ResponseStatus(int responseCode) {
        this.responseCode = responseCode;
    }
}
