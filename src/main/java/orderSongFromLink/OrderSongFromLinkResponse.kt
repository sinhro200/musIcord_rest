package orderSongFromLink

import core.CommonResponse
import model.SongInfo

class OrderSongFromLinkResponse : CommonResponse<OrderSongFromLinkResponse.Response?>() {
    class Response {
        var songInfo: SongInfo? = null
    }
}