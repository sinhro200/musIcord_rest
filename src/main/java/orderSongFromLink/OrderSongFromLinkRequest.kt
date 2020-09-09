package orderSongFromLink

import core.CommonRequest

class OrderSongFromLinkRequest : CommonRequest<OrderSongFromLinkRequest.Data?>() {
    class Data(
            private val roomToken: String? = null,
            private val songLink: String? = null
    )
}