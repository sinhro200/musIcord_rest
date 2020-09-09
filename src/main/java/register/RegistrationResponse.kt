package register

import core.CommonResponse

class RegistrationResponse : CommonResponse<RegistrationResponse.Response>() {
    class Response(
            var successRegister_message: String? = null
    )
}