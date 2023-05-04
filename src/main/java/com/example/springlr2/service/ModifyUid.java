package com.example.springlr2.service;

import com.example.springlr2.model.Response;

public class ModifyUid implements MyModifyService{
    @Override
    public Response modify(Response response) {

        response.setUid("New Uid");
        return response;
    }
}
