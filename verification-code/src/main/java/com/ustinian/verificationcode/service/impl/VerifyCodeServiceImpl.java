package com.ustinian.verificationcode.service.impl;

import com.ustinian.internalcommon.dto.ResponseResult;
import com.ustinian.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;
import com.ustinian.verificationcode.service.VerifyCodeService;
import org.springframework.stereotype.Service;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/10/13 0:17
 **/
@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {

    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        return null;
    }
}
