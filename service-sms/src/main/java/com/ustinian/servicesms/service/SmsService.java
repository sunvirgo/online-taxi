package com.ustinian.servicesms.service;

import com.ustinian.internalcommon.dto.ResponseResult;
import com.ustinian.internalcommon.dto.servicesms.request.SmsSendRequest;

public interface SmsService {
	/**
	 * 发送短信
	 * @param request
	 * @return
	 */
	public ResponseResult sendSms(SmsSendRequest request);
}