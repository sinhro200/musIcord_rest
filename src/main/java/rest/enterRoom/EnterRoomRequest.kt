package rest.enterRoom

import rest.core.CommonRequest

class EnterRoomRequest : CommonRequest<EnterRoomRequest.Data>() {
    class Data(
            var inviteCode: String? = null
    )
    companion object
}