package rest

public val ERROR_CODE_SERVER_EXC = 0
public val ERROR_CODE_REQUEST_DATA_EXC = 1
public val ERROR_CODE_NIMUSC_EXC = 2
public val ERROR_CODE_MUSIC_SERVICE_EXC = 3
public val ERROR_CODE_NETWORK_TIMEOUT = 4
public val ERROR_CODE_SMTH_WENT_WRONG = 5


public fun buildErrorCode(MAIN_ERROR_CODE : Int, additionalErrCode : Int? = null) =
        (MAIN_ERROR_CODE.toString() + additionalErrCode?:"00").toInt()

