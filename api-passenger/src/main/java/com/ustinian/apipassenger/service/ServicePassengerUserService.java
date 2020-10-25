package com.ustinian.apipassenger.service;

import com.ustinian.internalcommon.dto.ResponseResult;
import com.ustinian.internalcommon.dto.servicepassengeruser.request.LoginRequest;

public interface ServicePassengerUserService {

    public ResponseResult login(String passengerPhone);
}
