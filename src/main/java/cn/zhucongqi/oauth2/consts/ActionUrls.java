/**
 * 所有的ActionUrls
 */
package cn.zhucongqi.oauth2.consts;

/**
 * 
 * @author Jobsz [zcq@zhucongqi.cn]
 * @version
 */
public class ActionUrls {
	
	public static final String BASE_URL = "auth/";
	// authrize url
	public static final String AUTHORIZE_URL = BASE_URL + "authorize";
	// authrize code url
	public static final String AUTHORIZE_CODE_URL = BASE_URL + "authorize_code";
	// access token url
	public static final String ACCESS_TOKEN_URL = BASE_URL + "access_token";
	// refresh token url
	public static final String REFRESH_TOKEN_URL = BASE_URL + "refresh_token";
	// secure access token url
	public static final String SECURE_ACCESS_TOKEN_URL = BASE_URL + "secure_access_token";
}
