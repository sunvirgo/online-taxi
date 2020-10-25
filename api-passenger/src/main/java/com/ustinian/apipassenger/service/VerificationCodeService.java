package com.ustinian.apipassenger.service;

import com.ustinian.internalcommon.dto.ResponseResult;
/**
 * 接口说明:
 * @author : 黄刚
 * @date : 2020/10/25 23:08
 * @para : 
 * @return : 
 */ 
public interface VerificationCodeService {

    public ResponseResult send(String phoneNumber);

    public ResponseResult verify(String phoneNumber, String code);
}
