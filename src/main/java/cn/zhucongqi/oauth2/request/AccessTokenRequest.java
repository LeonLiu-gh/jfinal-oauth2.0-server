package cn.zhucongqi.oauth2.request;

import javax.servlet.http.HttpServletRequest;

import cn.zhucongqi.oauth2.base.validator.OAuthValidator;
import cn.zhucongqi.oauth2.validators.AccessTokenRequestValidator;

/**
 * AccessTokenRequest
 * @author Jobsz
 */
public class AccessTokenRequest {

	private OAuthValidator validator = null;

	public AccessTokenRequest(HttpServletRequest request) {
		this.validator = new AccessTokenRequestValidator(request);
	}
	
	public OAuthValidator getValidator() {
		return this.validator;
	}
}
