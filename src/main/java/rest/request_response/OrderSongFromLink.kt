package rest.request_response

import rest.model.SongInfo

class OrderSongFromLinkReqData(
        var roomToken: String? = null,
        var songLink: String? = null
)

class OrderSongFromLinkRespBody(
        var songInfo: SongInfo? = null
)