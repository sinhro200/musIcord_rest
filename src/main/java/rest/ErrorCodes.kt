package rest

public val ERROR_CODE_SERVER_EXC = 0
public val ERROR_CODE_REQUEST_DATA_EXC = 1
public val ERROR_CODE_NIMUSC_EXC = 2
public val ERROR_CODE_MUSIC_SERVICE_EXC = 3
public val ERROR_CODE_NETWORK_TIMEOUT = 4
public val ERROR_CODE_SMTH_WENT_WRONG = 5

public val ERROR_CODE_REGISTER_USER_ALREDY_EXIST = 100
public val ERROR_CODE_REGISTER_EMAIL_ALREADY_USED = 101
public val ERROR_CODE_AUTH_USER_NOT_FOUND = 110
public val ERROR_CODE_AUTH_PASSWORD_INCORRECT = 111
public val ERROR_CODE_AUTH_USER_NOT_VERIFIED = 112


public fun buildErrorCode(MAIN_ERROR_CODE : Int, additionalErrCode : Int? = null) =
        (MAIN_ERROR_CODE.toString() + additionalErrCode?:"00").toInt()

