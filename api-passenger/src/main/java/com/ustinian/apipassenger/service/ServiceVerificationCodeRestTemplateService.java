package com.ustinian.apipassenger.service;

import com.ustinian.internalcommon.dto.ResponseResult;
import com.ustinian.internalcommon.dto.servicesms.request.SmsSendRequest;

public interface ServiceVerificationCodeRestTemplateService {

    public ResponseResult generatorCode(int identity, String phoneNumber);

    public ResponseResult verifyCode(int identity, String phoneNumber , String code);
}
