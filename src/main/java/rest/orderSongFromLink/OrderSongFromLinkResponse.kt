package rest.orderSongFromLink

import rest.core.CommonResponse
import rest.model.SongInfo

class OrderSongFromLinkResponse : CommonResponse<OrderSongFromLinkResponse.ResponseBody>() {
    class ResponseBody(
            var songInfo: SongInfo? = null
    )
    companion object
}