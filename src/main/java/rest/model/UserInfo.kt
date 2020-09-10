package rest.model

class UserInfo(
        var id: Long? = null,
        var login: String? = null,
        var email: String? = null,
        var first_name: String? = null,
        var last_name: String? = null,
        var nickname: String? = null
){
    companion object
}