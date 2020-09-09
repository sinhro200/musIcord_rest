package auth

import core.CommonResponse
import model.UserInfo

class AuthResponse : CommonResponse<AuthResponse.Response?>() {
    class Response {
        var userInfo: UserInfo? = null
        var accessToken: String? = null
    }
}