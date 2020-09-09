package orderSongFromLink

import core.CommonResponse
import model.SongInfo

class OrderSongFromLinkResponse : CommonResponse<OrderSongFromLinkResponse.ResponseBody>() {
    class ResponseBody(
            var songInfo: SongInfo? = null
    )
}