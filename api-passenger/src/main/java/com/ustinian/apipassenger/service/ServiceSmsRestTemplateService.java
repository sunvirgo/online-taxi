package com.ustinian.apipassenger.service;

import com.ustinian.internalcommon.dto.ResponseResult;
import com.ustinian.internalcommon.dto.servicesms.request.SmsSendRequest;

public interface ServiceSmsRestTemplateService {

    public ResponseResult sendSms(String phoneNumber , String code);
}
