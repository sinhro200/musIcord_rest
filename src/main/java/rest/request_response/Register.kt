package rest.request_response

import rest.model.UserInfo

class RegisterReqData(
        var login: String? = null,
        var password: String? = null,
        var nickname: String? = null,
        var email: String? = null
)

class RegisterRespBody(
        var successRegister_message: String? = null
)