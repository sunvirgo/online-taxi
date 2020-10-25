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

    /**
     * 方法说明: redis：1分钟发了3次，限制5分钟不能发。一小时发了10次限制1小时不能发
     * @author : 黄刚
     * @date : 2020/10/18 22:48
     * @para : [identity, phoneNumber]
     * @return : com.ustinian.internalcommon.dto.ResponseResult<com.ustinian.internalcommon.dto.serviceverificationcode.VerifyCodeResponse>
     */
    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        //不建议(Math.random()+“”).substring(2,8);
        //生成6位随机数，用数字再转换为String,效率大于用String进行拼接，基本数据类型大于引用类型
        //Math.random()结果为；0~9.999999   Math.random()*9结果为0~8.9999999   Math.random()*9+1为：1~9.99999999
        String code = String.valueOf((Math.random()*9+1)*Math.pow(10,5));
        VerifyCodeResponse data = new VerifyCodeResponse();
        data.setCode(code);
        return ResponseResult.success(data);
    }
}
