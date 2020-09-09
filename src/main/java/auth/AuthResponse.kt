package auth

import core.CommonResponse
import model.UserInfo

class AuthResponse : CommonResponse<AuthResponse.ResponseBody>() {
    class ResponseBody(
            var userInfo: UserInfo? = null,
            var accessToken: String? = null
    )
}