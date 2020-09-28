package rest.request_response

import rest.model.UserInfo

class AuthReqData(
    var login: String? = null,
    var password: String? = null
)

class AuthRespBody(
    var userInfo: UserInfo? = null,
    var accessToken: String? = null
)