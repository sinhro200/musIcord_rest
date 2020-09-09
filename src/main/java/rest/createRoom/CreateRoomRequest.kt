package rest.createRoom

import rest.core.CommonRequest

class CreateRoomRequest : CommonRequest<CreateRoomRequest.Data>() {
    class Data(
            var title: String? = null
    )
    companion object
}