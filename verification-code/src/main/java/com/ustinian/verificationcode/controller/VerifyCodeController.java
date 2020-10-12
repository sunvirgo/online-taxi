package com.ustinian.verificationcode.controller;

import com.ustinian.internalcommon.dto.ResponseResult;
import com.ustinian.verificationcode.service.VerifyCodeService;
import com.ustinian.verificationcode.service.impl.VerifyCodeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/10/12 23:46
 **/
@RestController
@RequestMapping("/verify-code")
public class VerifyCodeController {

    @Autowired
    private VerifyCodeServiceImpl verifyCodeService;
    @GetMapping("/generate/{identity}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("identity") int identity , @PathVariable ("phoneNumber") String phoneNumber){
        return verifyCodeService.generate(identity,phoneNumber);
    }
}
