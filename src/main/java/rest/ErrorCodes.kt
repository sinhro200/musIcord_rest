package rest

enum class ErrorCodes(
        private val code :Int
) {
    SERVER_EXC(1000),
    REQUEST_DATA_EXC(1001),
    MUSIC_SERVICE_EXC(1002),
    NETWORK_TIMEOUT(1003),
    SMTH_WENT_WRONG(1004),
    NET_CONNECTION_ERR(1005),

    REGISTER_USER_ALREDY_EXIST(5000),
    REGISTER_EMAIL_ALREADY_USED(5001),
    AUTH_USER_NOT_FOUND(5010),
    AUTH_PASSWORD_INCORRECT(5011),
    AUTH_USER_NOT_VERIFIED(5012),

    /**
     * Nimusc exception codes :
     */
//CommonNE
    NIMUSC_GENERAL_EXC(2000),

    NIMUSC_COMMON_WRONG_HTTP_URL_PARAMETERS(2001),
    NIMUSC_COMMON_ERR_WHILE_SENDING_REQUEST(2002),
    NIMUSC_COMMON_ERR_IN_RESPONSE(2003),
    NIMUSC_COMMON_ACCESS_TOKEN_BROKEN(2004),
    NIMUSC_COMMON_ACCESS_TOKEN_EMPTYORNULL(2005),

    //LinkConvertingNE
    NIMUSC_LINK_CONVERTING_BROKEN_LINK(2020),
    NIMUSC_LINK_CONVERTING_SONGS_NOT_FOUND(2021),

    //TokenReceiverNE
    NIMUSC_TOKEN_RECEIVER_REGISTRATION_ERR(2040),
    NIMUSC_TOKEN_RECEIVER_TOKEN_NOT_REFRESHED(2041),
    NIMUSC_TOKEN_RECEIVER_TOKEN_NOT_RECEIVED(2042),
    NIMUSC_TOKEN_RECEIVER_TWOFA_REQ(2043),
    NIMUSC_TOKEN_RECEIVER_TWOFA_ERR(2044),

    //SongFinderNE
    NIMUSC_SONG_FINDER_SONGS_NOT_FOUND(2060),
    ;

    public fun getCode(): Int = code

    companion object{
        public fun toErrorCode(errCode : Int) : ErrorCodes{
            return values().asList().stream().filter{it.code == errCode}.findFirst().get()
        }
    }


}