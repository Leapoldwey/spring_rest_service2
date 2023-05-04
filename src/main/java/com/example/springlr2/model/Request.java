package com.example.springlr2.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
public class Request {
    @NotBlank
    @Size(max = 32)
    private String uid;
    @NotBlank
    @Size(max = 32)
    private String operationUid;
    private String systemName;
    @NotBlank
    private String systemTime;
    private String source;
    private int communicationId;
    private int templateId;
    @Max(7)
    private int productCode;
    @Max(5)
    private int smsCode;

}
