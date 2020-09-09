package rest.auth

import rest.core.CommonResponse
import rest.model.UserInfo

class AuthResponse : CommonResponse<AuthResponse.ResponseBody>() {
    class ResponseBody(
            var userInfo: UserInfo? = null,
            var accessToken: String? = null
    )

    companion object
}