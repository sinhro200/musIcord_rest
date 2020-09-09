package register

import core.CommonRequest

class RegistrationRequest : CommonRequest<RegistrationRequest.Data>() {
    class Data(
            var login: String? = null,
            private val password: String? = null,
            private val nickname: String? = null,
            private val email: String? = null
    )
}