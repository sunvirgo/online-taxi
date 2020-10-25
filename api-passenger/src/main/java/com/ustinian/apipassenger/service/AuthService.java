package com.ustinian.apipassenger.service;

import com.ustinian.internalcommon.dto.ResponseResult;

public interface AuthService {
    public ResponseResult auth(String passengerPhone, String code);
}
