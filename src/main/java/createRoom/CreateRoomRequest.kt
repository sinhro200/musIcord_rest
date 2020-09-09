package createRoom

import core.CommonRequest

class CreateRoomRequest : CommonRequest<CreateRoomRequest.Data>() {
    class Data(
            var title: String? = null
    )
}