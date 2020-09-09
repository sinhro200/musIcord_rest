package rest.register

import rest.core.CommonResponse

class RegistrationResponse : CommonResponse<RegistrationResponse.ResponseBody>() {
    class ResponseBody(
            var successRegister_message: String? = null
    )
    companion object
}