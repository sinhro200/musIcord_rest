package enterRoom

import core.CommonRequest

class EnterRoomRequest : CommonRequest<EnterRoomRequest.Data>() {
    class Data(
            var inviteCode: String? = null
    )
}