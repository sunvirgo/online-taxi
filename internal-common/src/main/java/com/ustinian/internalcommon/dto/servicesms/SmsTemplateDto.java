package com.ustinian.internalcommon.dto.servicesms;

import lombok.Data;

import java.util.Map;

/**
 * 类说明:
 * @author : 黄刚
 * @date : 2020/10/25 23:12
 * @para :
 * @return :
 */
@Data
public class SmsTemplateDto {
	// 模板id
	private String id;

	// 参数  占位符
	private Map<String, Object> templateMap;

	@Override
	public String toString() {
		return "SmsTemplateDto [id=" + id + ", templateMap=" + templateMap + "]";
	}

}