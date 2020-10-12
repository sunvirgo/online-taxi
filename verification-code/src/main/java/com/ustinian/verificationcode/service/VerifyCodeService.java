package com.ustinian.verificationcode.service;

import com.ustinian.internalcommon.dto.ResponseResult;
import com.ustinian.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/10/13 0:16
 **/
public interface VerifyCodeService {
    public ResponseResult<VerifyCodeResponse> generate(int identity , String phoneNumber);
}
